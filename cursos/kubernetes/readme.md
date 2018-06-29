# Curso Kubernetes: Introdução a orquestração de containers

Status: em andamento.

## Aulas

### Aula 01: Utilizando o Docker

- `enviroment` definirá as variáveis de ambiente:

        MYSQL_DATABASE = loja

- na criação do dockerfile, iremos definir qual imagem usaremos como base, quais comando ele deverá executar (no caso, a instalação do mysql), copiar arquivos para a pasta do apache, e definir uma porta para esse processo

- após a criação do dockerfile, é preciso executar sua criação, definindo uma tag para essa imagem, e indicar onde está o arquivo de dockerfile (no caso, o arquivo está na pasta de execução do comando, e só indicamos como um ponto)`docker build -t "aplicacao-loja:v1" .`

- agora que já temos uma imagem de um servidor web para nossos serviços, precisamos continuar nosso docker-compose, pois iremos configurá-lo também. Vamos mapear a porta local da nossa máquina, à porta do servidor (definida/exposta como 80)

```yaml
web:
 image: aplicacao-web:v1
 ports:
  - 8080:80
 depends_on:
  - db
```

- `docker-compose up -d`

- portanto, foram criados 2 containeres: um para o banco, e outro para o servidor web

- `docker exec -it projeto_db_1 sh` para executar o shell do servidor web. A parti daí, vamos fazer a conexão com o mysql, pelo terminal da imagem do servidor

- O kubernetes fará o gerenciamento dos conteiners web, a partir do arquivo YAML. Esse aquivo será passado a máquina principal do sistema (MESTER), que delegará a implementação destes containers em outros servidores (NODES), que de fato formarão a aplicação. O conjunto de MASTER e NODES é chamado CLUSTER, administrado pelo Kubernetes, que fará ua verificação constante do estado do cluster.

- O Kubernetes é uma plataforma open-source desenvolvida pela Google com o objetivo de gerenciar containers que formam uma aplicação, automatizando assim processos de implementação, monitoramento e escalonamento

### Aula 02: Trabalhando com o minikube

- Utilizamos o minikube para criar uma virtualização de um cluster em nossa máquina local `minikube start`

- No Kubernetes, precisamos abstrair esses containers em um objeto Pod. Ou seja, é uma abstraçã dos containers da nossa aplicação.

- O Pod suporta um ou mais containers. Porém, os containers terão um alto acoplamento, pois dividirão memória e volume. O ideia seria um Pod para cada serviço.

- Utilizamos o kubectl para se comunicar com o cluster criado pelo minikube.

- Comandos:

  - `kubectl create -f aplicacao.yaml` - cria um pod com base na configuração descrita no arquivo
  - `kubectl get pods` - exibe os pods ativos
  - `kubectl delete pods aplicacao` - deleta os pods do cluster aplicacao

- Como o Pod é a menor parte do Kubernetes, iremos precisar de uma abstração do Pod, em um objeto chamado de **Deployment**.

- Com o objeto deployment teremos mais recursos, ou seja, podemos dizer ao kubernetes que ele deve gerenciar nossos pods, a fim de mantê-los rodando sempre.

### Aula 03: Utilizando os serviços

- O Minikube disponibiliza uma página de dashboard, para fazer o gerenciamento dos clusters

- Como cada pod terá um IP na rede do cluster, não podemos acessá-los diretamente (pois os pods sã instáveis). Precisamos de uma maneira mais estável para acessarmos a aplicação que está rodando, ou seja, um outro objeto do Kubernetes, chamado de **Service**.

        "A ideia é que ele faça a abstração do acesso para os objetos Pod. Podemos configurá-lo para que ele atue como se fosse um **balanceador de cargas**, dividindo a quantidade de acessos e requisições que nossa aplicação terá, por estes pods que criamos."

- A chave SELECTOR especifica quais os nomes dos pods que serão abstraidos pelo Service. Ou seja, na configuração do *label > name*.

- Um Service fará a interface entre os usuários da aplicação e o Deployment. O Deployment faz o gerenciamento dos Pods, mantendo eles sempre rodando, por exemplo. Os Pods, por sua vez, são as abstrações dos containers, que aplicam as configurações das imagens docker definidas.

- Comandos:

  - `kubectl describe pods aplicacao-deployment-57584f9b74-pzp9h | grep IP` - fará a descrição do cluster. Utilizamos o grep para buscar somente a parte que possui o "IP" que queremos
  - `minikube dashboard` - acessar, no navegador, o painel administrativo do kubernetes
  - `minikube service servico-aplicacao --url` - devolve qual o URL que foi criado pelo service

### Aula 04: Configurando o banco de dados

- Para o pod do banco, precisamos definir algumas variáveis de ambiente, sobre a tag ENV do nosso arquivo .YAML. Essas variáveis são sobre a CRIAÇÃO do banco que será utilizado pela aplicação, CRIAÇÃO do usuário, e possibilitar uma senha vazia para esse usuário.

- Para que o Kubernetes tenha uma camada de estado dessa aplicação de banco de dados, precisamos definir que queremos que esse Pod sempre esteja rodando no cluster. Porém, em nossa aplicação de banco de dados, precisamos que todas as informações sejam mantidas, ou seja, não só queremos que o Kubernetes lide com a criação de um novo Pod em caso de erros. Também precisamos que ele não destrua todas as informações desse Pod, ou então perderiamos todas os registros do nosso bando de dados!

- Por isso, precisamos abstraí-lo em um **Stateful Set**.  Ele fará uma espécie de mapemanento de volumes.

- No Stateful Set é preciso definir um volume, porém, nele, somente um dos Pods poderão ter permissão de escrita e leitura. Para isso, definimos um **arquivo YAML separado, definindo as permissões**. Essa permissão será sobre o volume do banco, e quanto podemos usufruir.

- Na criação do Stateful Set vamos definir um volume. Em cada container, esse volume deverá ser montado no container do Stateful Set

- O PersistentVolumeClaim é o objeto que configura os pedidos de requisição de recursos de um volume persistente criado pelo administrador do cluster.

- Precisamos agora criar um Service para fazer o balanceamento das requisições ao banco de dados. Para isso, será criado um Serviço do tipo ClusterIP, pois essas requisições serão feitas pelos Pods de dentro do cluster, ou seja, esse serviço só deve atender aos IPs de dentro.

- Nesse Service do banco, iremos manter o mesmo nome do StatefulSet, ou seja, com indicar que essa ligação entre o Pod do banco e o Serviço banco.  Também precisamos indicar que esse StatefulSet pertence a um serviço, por isso, indicamos em seu spec que o nome do serviço é db.

- Primeiro fazermos a criação do statefulset, com o pod do banco. Depois indicamos o seu serviço, ou seja, criamos o servico-banco. E finalmente indicamos as permissões que devem ser seguidas, criando o permissoes.


