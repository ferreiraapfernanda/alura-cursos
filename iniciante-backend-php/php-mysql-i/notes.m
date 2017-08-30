# PHP e MySQL I
- :ok: [Primeiros passos com PHP](#primeiros-passos-com-php)
- :ok: [Inserindo produtos no banco de dados](#inserindo-produtos-no-banco-de-dados)
- :ok: [Criando funções no PHP](#)
- Listando todos os produtos
- Melhorando a listagem de produtos
- Deletando produtos
- Entendendo a diferença entre GET e POST
- Relacionando Produtos com Categorias
- Lidando com Selects e Checkboxes
- Alterando produtos
- Subindo a aplicação para um Servidor

## Primeiros passos com PHP
- Instalar XAMPP (utilitário que instala PHP, o Apache e o MySql).

- Index @ ```/Applications/XAMPP/xamppfiles/htdocs```, criar um diretório para o projeto. Acessar em ```http://localhost/loja/```

- Adiciona-produto possui a mensagem de sucesso no cadastro, que irá passar, pela URL, os parâmetros do cadastro ```http://localhost/loja/adiciona-produto.php?nome=carro&preco=5000```

## Inserindo produtos no banco de dados
- Acessar http://localhost/phpmyadmin/, ou através do painel do próprio XAMPP

- Podemos usar o método de interpolação, para misturar strings e variáveis 
```php 
$query = "insert into produtos (nome, preco) values ('{$nome}', '{$preco}')";
```
- **mysqli_*** é o novo pacote de acesso ao MySql, onde eles melhoraram toda a parte de acesso ao banco de dados

## Criando funções no PHP
