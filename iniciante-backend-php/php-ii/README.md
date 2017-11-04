# :on: PHP II

- [Link para o curso](https://cursos.alura.com.br/course/php-oo-2)
- Curso iniciado em: 24/10/2017

1. :ok: Autoloading de classes

1. :ok: DAO - Data Access Object

1. :ok: Herança

1. :ok: Reescrita e Polimorfismo

1. :ok: Classe Abstrata e o padrão Factory

1. Método abstrato

## 1. Autoloading de classes

- Autoload somente no PHP5.

- Cria a função que carrega as classes, e depois registra ela como função de autoload

```php

function carregaClasse($nomeDaClasse) {
  require_once("class/".$nomeDaClasse.".php");
}

spl_autoload_register("carregaClasse");

```

- A função só será executada quando ocorre a utilização de uma classe não definida (no próprio arquivo)

- Cada classe deve estar no seu arquivo e o nome do arquivo deve ser o nome da classe.

## 2. DAO - Data Access Object

- Criação de uma classe para encapsular as funções de acesso aos dados.

Exemplo: ProdutoDao.php

```php

class ProdutoDao {

private $conexao;

function __construct($conexao){
  $this->conexao = $conexao;
}

// Funções de banco-produto.php

}

```

## 3. Herança

- Private: Só a própria classe enxerga
- Protected: A própria classe e as classes filhas enxergam

## 4. Reescrita e Polimorfismo

## 5. Classe Abstrata e o padrão Factory

## 6. Método abstrato

Legenda:

:ok: Concluído

:on: Em andamento
