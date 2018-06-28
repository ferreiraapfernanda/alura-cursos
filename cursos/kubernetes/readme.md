# Curso Kubernetes: Introdução a orquestração de containers

Status: em andamento.

## Aulas 

### Aula 01: Utilizando o Docker

- `enviroment` definirá as variáveis de ambiente:

        MYSQL_DATABASE = loja

- na criação do dockerfile, iremos definir qual imagem usaremos como base, quais comando ele deverá executar (no caso, a instalação do mysql), copiar arquivos para a pasta do apache, e definir uma porta para esse processo

- após a criação do dockerfile, é preciso executar sua criação, definindo uma tag para essa imagem, e indicar onde está o arquivo de dockerfile (no caso, o arquivo está na pasta de execução do comando, e só indicamos como um ponto)`docker build -t "aplicacao-loja:v1" .`

- agora que já temos uma imagem de um servidor web para nossos serviços, precisamos continuar nosso docker-compose, pois iremos configurá-lo também. Vamos mapear a porta local da nossa máquina, à porta do servidor (definida/exposta como 80)
        ```yml
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