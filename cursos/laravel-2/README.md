# Laravel II: Mais técnicas e webapps poderosas

- [Curso na Alura](https://cursos.alura.com.br/course/laravel-2)
- **Iniciado em 15/02/2018**

## Aulas

1. :ok: Eloquent ORM
2. :ok: Trabalhando com Migrations
3. :ok: Validando os dados de entrada
4. Autenticação e segurança
5. Relacionamentos com Eloquent
6. Preenchendo dados com Seeds
7. Mais produtividade com Artisan

## Anotações

### 1. Eloquent ORM

O Eloquent é um framework ORM (Object Relational Mapping) que faz o mapeamento dos objetos para o modelo relacional.
Para começar, é preciso ter uma classe Model de uma tabela do banco de dados. No caso, foi utilizadaa tabela de **produtos**. Na linha de comando, basta digitar ``php artisan make:model Produto``. A classe produto será criada na pasta app. O eloquent consegue fazer todo esse processo de mapeamento pois **ele levará em conta o nome da tabela como sendo o plural da sua classe**. Assim, a tabela que ele reconhece como **produtos** faz referência a classe **Produto**, sempre minúsculo e com o **s** no final. É possível fazer sua própria classe e customizá-la do zero, mas o Eloquent ajuda bastante o processo se seguirmos suas práticas. No caso, é só adiciona a propriedade ``protected $table = 'produtos';`` para definir a tabela.

O Eloquent também assume por padrão que sua tabela tem essas duas colunas **updated_at** e **created_at**. Mas, para customizar esse padrão, é só definir ``public $timestamps = false;``.

- Métodos herdados de Model
  - all() -> **select *** -> ``$produtos = Produto::all();``
  - find() -> **select * from where id = [id]** -> ``$produto = Produto::find($id);``

- Inserção

Agora que temos uma classe representando a tabela, podemos associar os valores as propriedades de um objeto dessa classe

```php
    $produto = new Produto();
    $produto->nome = Request::input('nome');
```

Podemos também indicar que vamos precisar de todos os valores do Request ``$params = Request::all();``, mas não é recomendado fazer isso sem definir na classe a propriedade **fillable** (erro de MassAssignment). Essa propriedade indica quais campos serão populados (como definir as propriedades de uma classe) ``protected $fillable = array('nome', 'descricao', 'valor', 'quantidade');``. O contrário desse atributo é o **guarded**, definimos quais campos não podem ser populados.

Para a inserção, podemos então utilizar o método **save()** do objeto, ficando assim:

```php
    $params = Request::all();
    $produto = new Produto($params);
    $produto->save();
```

A maneira mais curta de fazer esse processo de inserção no banco é com o **factory method create()** ``Produto::create(Request::all());``

- Remoção

A remoção será bem mais fácil com as possibilidades do Eloquent:

```php
    $produto = Produto::find($id);
    $produto->delete();
```

### 2. Trabalhando com Migrations

É comum trabalharmos com um projeto que já possui um banco criado, e nesse processo de mudança para um framework é comum criamos um campo novo em uma tabela existente, ou até uma tabela nova. Com as migrations ensinam o Laravel como criar, atualizar ou recuperar o estado anterior do esquema de seu banco de dados, como um controle de versão.

A migration sempre possui dois métodos **up** e **down**, um para quando criamos um atualizarmos uma tabela e outro para quando quisermos desfazer essa alteração.

Para criar uma migração, podemos executar: ``php artisan make:migration adiciona_tamanho_no_produto``
No arquivo criado em **database/migrations**, no método up, utilizaremos o método table do Schema. No caso, iremos criar uma coluna na table de produtos, do tipo text/string, com no máximo 100 caracteres:

```php
Schema::table('produtos', function($table) {
        $table->string('tamanho', 100);
    });
```

No método down, faremos o drop dessa coluna:

```php
Schema::table('produtos', function($table) {
        $table->dropColumn('tamanho');
    });
```

- Para executar a migração: ``php artisan migrate``
- Para reverter a última migração: ``php artisan migrate:rollback``

**Atenção:**

- Quando criar um campo, lembre-se de alterar todas as utilizações que esse campo terá, como por exemplo, na propriedade fillable, precisamos adicionar tamanho como um campo para se popular

### 3. Validando os dados de entrada

Existe uma classe para as validações. No caso do nosso formulário, e interessante que alguns campos sejam obrigatórios. Para isso, utilizamos a classe **Validador**. Essa classe permite definir alguns padrões para os campos (no nosso caso, campos do Request).
Ao criar uma variável Validator, definimos sua origem (O Request input), e padrões como **required**, **min: 3**, entre outros.

Depois de definidas as validações, é importante definir também qual o comportamento do validator caso ocorra alguma falha. Assim chama-se o método **fails()** do validator, que caso retorne verdadeiro, podemos redirecionar para a página de formulário, sem cadastrar o produto. Outro método interessante é o **messages()**, que armazena as mensagens do validator.

Uma maneira melhor de validar alguns campos, é criar um Form Request. Ele fará as mesmas validações, porém, ficarão isoladas em sua própria classe. Para isso, no terminal, é só digitar **php artisan make:request ProdutoRequest**. Ele criará um arquivo sobre a pasta **app/http/requests/**. Ele já é criado com dois métodos, vamos utilizar primeiro o **rules()**, onde iramos definir as mesmas validações que defininmos anteriormente (required, min, max, etc).

Após definir as regras, iremos modificar o método **adiciona()**, onde ele terá como parâmetro uma instancia dessa classe **ProdutoRequest**, o metodo create agora utiliza **$request->all()** e pronto, todas as validações estão sendo feitas, e caso ocorra algum erro, a própria aplicação redireciona para a página de origem (formulário).

Uma maneira de utilizar as mensagens de erro de uma forma visual, é adicionar ao topo do formulário uma div com uma lista das mensagens de erros do request. No formulario, iremos fazer um **foreach ($erros->all() as $error)** e exibr-los na tela. Uma maneira de personalizar as mensagens é reescrevendo o método **messages()** do ProdutoRequest. Ele simplesmente precisa retornar um array com cada mensagem para cada validação. Por exemplo:

```php
public function messages(){
  return [
    'required' => 'O campo :attribute é obrigatório!',
    'nome.required' => 'O nome é obrigatório!'
  ];
}
```

### 4. Autenticação e segurança

Na nossa aplicação, é importante se somente usuário válidos possam cadastrar produtos. Para isso, precisamos criar uma lógica de usuário, com login e cadastro. Por padrão, o laravel já possui uma lógica de login implementada, que está sobre **app/Http/Controllers/Auth/**. Podemos também criar o nosso próprio controller de Login (**php artisan make:controller LoginController**) que é o que faremos. Mas temos um problema: o laravel criou vários métodos para essa classe. Para criar um controller "limpo" basta definir o parâmetro **--plain**  na criação do Controller.

Depois da criação, precisamos criar uma rota para o nosso login, uma página de formulário e um método no controller para "ligar" essas duas ações. Precisamos também de um método de tentativa de login, onde iremos validar se o usuário digitado já existe. Basta criar um método **login()**, onde pegaremos as credenciais pelo Request (no caso, utilizamos **Request::onyl('email', 'password');**) e através da utilização do método estático ``Auth::attempt($credenciais)``, faremos a tentativa de login.

Agora que definimos um usuário para nossa aplicação, precisamos ter certeza que, a cada ação na aplicação, o usuário esteja logado, ou então, que a cada rota o usuário esteja logado. Para isso, não precisamos definir uma lógica em cada método do nosso ProdutoController por exemplo, podemos criar um **Middleware**. Um Middleware executará uma lógica a cada ação da nossa aplicação. Para criá-lo, basta digitar **php artisan make:middleware Autorizador**. A classe já possui um método, que fará o gerenciamento das ações. Caso esteja tudo certo, ele executa o método **$next()** com o seu **$request** como parâmetro. 

Nossa classe Autorizador terá uma simples verificação ``if (\Auth::guest()) { return redirect('/login');}``, ou seja, caso o usuário não esteja logado/seja um visitante, ele será redirecionado para a página de login. Após definirmos a nossa lógica, precisamos registrar esse middleware no arquivo **Kernel.php**. Um **routeMiddleware** somente será executado quando indicarmos no código, um **middleware** normal SEMPRE será executado.

### 5. Relacionamentos com Eloquent

### 6. Preenchendo dados com Seeds

### 7. Mais produtividade com Artisan

**Legenda:**

- :on: em andamento
- :ok: concluído
