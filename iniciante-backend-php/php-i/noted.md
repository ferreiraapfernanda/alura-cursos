# :on: PHP I

[Link para o curso](https://cursos.alura.com.br/course/php-oo-1)

Curso iniciado em: 17/10/2017

Curso concluído em:

1. :white_check_mark: Classes e Objetos
2. :white_check_mark: Evoluindo a listagem de produtos
3. :white_check_mark: Métodos
4. :white_check_mark: Encapsulamento
5. :white_check_mark: Comparando objetos
6. Magic methods

</br></br>

## 1. Classes e Objetos

## 2. Evoluindo a listagem de produtos

## 3. Métodos

## 4. Encapsulamento

A vantagem é que fica possível fazer validações, protegendo a aplicação de erros e modificações de terceiros

## 5. Comparando objetos

A comparação __==__ entre dois objetos retornará TRUE se as instâncias foram da mesma classe e possuem as mesmas propriedades e valores.
Já a comparação __===__ só será verdadeira se os objetos se referem à mesma instância da mesma classe. Exemplo: 
```php
<?php

    require "class/Produto.php";

    $produto = new Produto();
    $produto->setPreco(59.9);
    $produto->setNome("Livro da Casa do Codigo");

    $outroProduto = $produto;
    $outroProduto->setPreco(100.6);
    $outroProduto->setNome("Livro da Casa do Codigo");

    if ($produto === $outroProduto) { // A execução retorna verdadeiro, porque como a referência de $produtofoi atribuida a $outroProduto, ambos os objetos possuem o mesmo preco, nome e local na memória.
        echo "sao iguais";
    } else {
        echo "sao diferentes";
    }

?>
```

A variável de instância só guarda a referência do local da memória.



## 6. Magic methods
