# PHP e MySQL I

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

1. :white_check_mark: [Primeiros passos com PHP](#primeiros-passos-com-php)
2. :white_check_mark: [Inserindo produtos no banco de dados](#inserindo-produtos-no-banco-de-dados)
3. :white_check_mark: [Criando funções no PHP](#)
4. :white_check_mark: [Listando todos os produtos](#)
5. :white_check_mark: [Melhorando a listagem de produtos](#)
6. :arrow_right: Deletando produtos
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

## Deletando produtos
```php
// Pega as informações enviadas pelo GET
$id = $_GET['id'];
removeProduto($conexao, $id);

header("Location: produto-lista.php?removido=true");
die();

```

