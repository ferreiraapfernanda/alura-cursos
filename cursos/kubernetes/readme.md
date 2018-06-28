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

- Utilizamos o minikube para criar uma virtualização de um cluster em nossa máquina local

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