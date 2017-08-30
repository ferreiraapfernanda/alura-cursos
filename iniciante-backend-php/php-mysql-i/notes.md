# PHP e MySQL I
1. :ok: [Primeiros passos com PHP](#primeiros-passos-com-php)
2. :ok: [Inserindo produtos no banco de dados](#inserindo-produtos-no-banco-de-dados)
3. :ok: [Criando funções no PHP](#)
4. :ok: [Listando todos os produtos](#)
5. :ok: [Melhorando a listagem de produtos](#)
6. Deletando produtos
7. Entendendo a diferença entre GET e POST
8. Relacionando Produtos com Categorias
9. Lidando com Selects e Checkboxes
10. Alterando produtos
11. Subindo a aplicação para um Servidor

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

## Listando todos os produtos
- ```mysqli_fetch_assoc()``` criará um array, com os dados da query

## Melhorando a listagem de produtos
- Quando precisar utilizar php e html no mesmo arquivo, e estiver utilizando uma estrutura de repetição, utilize o **endforeach** para que o código fique um pouco mais limpo
```php
<?php
foreach($produtos as $produto) :
?>
    <tr>
        <td><?= $produto['nome'] ?></td>
        <td><?= $produto['preco'] ?></td>
    </tr>

<?php
endforeach
?>
```
