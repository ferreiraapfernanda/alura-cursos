# Laravel: facilitando o desenvolvimento PHP

- [Link para o curso](https://cursos.alura.com.br/course/laravel)
- **Curso iniciado em: 02/02/2018**
- **Curso concluído em:**

## Aulas

1. :ok: Novo projeto com Laravel
2. :ok: MVC e conexão com banco de dados
3. :ok: Trabalhando com a View
4. Parâmetros da request e URL
5. Views mais flexíveis e poderosas
6. Request e métodos HTTP
7. Os diferentes tipos de resposta

## Anotações

### 1. Novo projeto com Laravel

- [Site oficial](https://laravel.com/)

- [Laravel Recipes](http://laravel-recipes.com/)

- [Site oficial > Configuration](https://laravel.com/docs/5.0/configuration)

- [Packagist](https://packagist.org/)

- O curso define o arquivo **app/Http/routes.php** para a definição das rotas. O Laravel agora possui uma pasta específica para isso. Mudei o arquivo **web.php** para o primeiro exercício.

- Instalação/criação de um projeto com a versão do curso: ``composer create-project laravel/laravel estoque "5.0."``

- Criação de um projeto normal: ``laravel new nome-do-projeto``

- Minha instalação: Precisa instalar a versão específica do curso. Optei para criar o projeto com a versão mais recente do Laravel e do Composer mesmo.

- Alterando o nome padrão: ``php artisan app:name estoque``

### 2. MVC e conexão com banco de dados

- Assim como vários frameworks, o Laravel utiliza o padrão MVC. No caso, a nossa primeira lógica será a de listagem de produtos. As lógicas do sistema ficam por conta dos Controllers, por isso a primeira é a **ProdutoController**.

- Quando criamos o arquivo na pasta **app/Http/Controllers**, precissamos definir seu namespace, ou seja, o seu local na nossa aplicação. Por isso, logo na abertura da tag php, no cabeçalho do arquivo, colocamos o ``namespace estoque\Http\Controllers;``

- Definindo o comportamento do Controller, precisa criar uma rota para ele. No caso, definimos que ele aportará para um método específico do nosso Controller:

    ```php
    Route::get('/produtos', 'ProdutoController@lista');
    ```

- Erro: sem key para a aplicação. Solução: ``php artisan key:generate`` antes de startar a aplicação. [@stackoverflow](https://stackoverflow.com/questions/44839648/no-application-encryption-key-has-been-specified-new-laravel-app)

### 3. Trabalhando com a View

- O controller não deve ser responsável por qualquer visualização. Esse, obviamente, é o trabalho para as views. Então, movemos nosso código HTML para um arquivo na **resources/views**.

- No Controller, faremos somente o select no banco, e retornaremos o resultado. Para retornar, utilizamos o **helper method** ``view()``. Esse método indica que deverá ser chamado uma página view. Precisamos passar o resultado do select, assim, utilizamos o método ``with()`` com a chave e valor. Existem diferentes maneiras de retornar esse valor:

```php
// Sendo listagem.php o nome do arquivo view, produtos o nome da variavel no controller e na view
view('listagem')->withProdutos($produtos);

view('listagem')->with('produtos', $produtos);

return view('listagem', ['produtos' => $produtos]); // Bom para retornar mais de um valor
```

### 4. Prâmetros da request e URL

### 5. Views mais flexíveis e poderosas

### 6. Request e métodos HTTP

### 7. Os diferentes tipos de resposta

**Legenda:**

- :on: em andamento
- :ok: concluído
