# :white_check_mark: PHP e MySQL I

Curso concluído em: 30-08-2017

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

1. :white_check_mark: [Primeiros passos com PHP](#1-primeiros-passos-com-php)
2. :white_check_mark: [Inserindo produtos no banco de dados](#2-inserindo-produtos-no-banco-de-dados)
3. :white_check_mark: [Criando funções no PHP](#3-criando-funções-no-php)
4. :white_check_mark: [Listando todos os produtos](#4-listando-todos-os-produtos)
5. :white_check_mark: [Melhorando a listagem de produtos](#5-melhorando-a-listagem-de-produtos)
6. :white_check_mark: [Deletando produtos](#6-deletando-produtos)
7. :white_check_mark: [Entendendo a diferença entre GET e POST](#7-entendendo-a-diferença-entre-get-e-post)
8. :white_check_mark: [Relacionando Produtos com Categorias](#8-relacionando-produtos-com-categorias)
9. :white_check_mark: [Lidando com Selects e Checkboxes](#9-lidando-com-selects-e-checkboxes)
10. :white_check_mark: [Alterando produtos](#10-alterando-produtos)
11. :white_check_mark: [Subindo a aplicação para um Servidor](#11-subindo-a-aplicação-para-um-servidor)

## 1. Primeiros passos com PHP
- Instalar XAMPP (utilitário que instala PHP, o Apache e o MySql).

- Index @ ```/Applications/XAMPP/xamppfiles/htdocs```, criar um diretório para o projeto. Acessar em ```http://localhost/loja/```

- Adiciona-produto possui a mensagem de sucesso no cadastro, que irá passar, pela URL, os parâmetros do cadastro ```http://localhost/loja/adiciona-produto.php?nome=carro&preco=5000```

## 2. Inserindo produtos no banco de dados
- Acessar http://localhost/phpmyadmin/, ou através do painel do próprio XAMPP

- Podemos usar o método de interpolação, para misturar strings e variáveis 
```php 
$query = "insert into produtos (nome, preco) values ('{$nome}', '{$preco}')";
```
- **mysqli_*** é o novo pacote de acesso ao MySql, onde eles melhoraram toda a parte de acesso ao banco de dados

## 3. Criando funções no PHP

## 4. Listando todos os produtos
- ```mysqli_fetch_assoc()``` criará um array, com os dados da query

## 5. Melhorando a listagem de produtos
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

## 6. Deletando produtos
```php
// Pega as informações enviadas pelo GET
$id = $_GET['id'];

//Remove o produto
removeProduto($conexao, $id);

// Envia um header HTTP puro
/* No caso, estamos informando que a localização da página onde o usuário deve ir é produto-lista.php, enviando como parâmetro que a remoção foi efetuada com sucesso. Ou seja, definimos que a chave é Location e o seu valor é a página que queremos. O navegador irá então fazer esse redirecionamento para o usuário */
header("Location: produto-lista.php?removido=true");

// Para o processamento
die();
```

## 7. Entendendo a diferença entre GET e POST
Não utilizar GET quando for alterar algo no banco. Para isso, utilize POST. Ele será mais limpo na navegação do usuário (não será exibido na URL), além de ser mais "escondido", presente na requisição HTTP somente.

## 8. Relacionando Produtos com Categorias
Criando a tabela "Categorias" para os produtos, agora temos que exibir as categorias existentes no formulário de cadastro. Além disso, precisamos, na tabela "Produtos" criar uma coluna para armazenar o id da categoria selecionada.
Também devermos mudar o SQL que faz a seleção da lista de produtos na página **produto-lista.php**, para que ele faça o join, obtendo também o nome da categoria.

```php
$categorias = listaCategorias($conexao);

foreach($categorias as $categoria) : ?>
        <input type="radio" name="categoria_id" value="<?=$categoria['id']?>"><?=$categoria['nome']?></br>
        <?php endforeach ?>
```

## 9. Lidando com Selects e Checkboxes

## 10. Alterando produtos

## 11. Subindo a aplicação para um Servidor
- Servidor remoto: https://www.000webhost.com/members/website/loja-php
- Site: https://loja-php.000webhostapp.com/produto-lista.php
