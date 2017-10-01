# PHP e MySQL II

[Link para o curso](https://cursos.alura.com.br/course/php-mysql-e-fundamentos-da-web-parte-2)

Curso conluído em 01/10/2017

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

:white_check_mark: 1. Uma ação de login

:white_check_mark: 2. Efetuando o login e cookies

:white_check_mark: 3. Protegendo o acesso as páginas, refatorando e extraindo a lógica

:white_check_mark: 4. Insegurança com cookies, segurança com session e efetuando logout

:white_check_mark: 5. Passando parâmetros para a próxima requisição

:white_check_mark: 6. Refatoração, escopo de flash e controle de erro

:white_check_mark: 7. Um único formulário para adicionar e alterar

:white_check_mark: 8. SQL Injection

:white_check_mark: 9. Include, require, require_once

:white_check_mark: 10. Envio de email via SMTP


## 1. Uma ação de login
- Sempre criptografar a senha, nem que seja só por md5
- var_dump() para imprimir valores do Array
- header() novamente para redirecionar o usuário, no caso do login. Passando o parâmetro de sucesso index.php?login=1

## 2. Efetuando o login e cookies
- Usar ```time() + 60``` como terceiro parâmetro no **setcookie** para determinar o tempo de duração do cookie 

## 3. Protegendo o acesso as páginas, refatorando e extraindo a lógica
- Proteger não só a página de exibição das informações, mas também as lógicas envolvidas com o banco de dados
- Concentrar a lógica de manioulação de cookies em um só lugar

## 4. Insegurança com cookies, segurança com session e efetuando logout
- Podemos usar cookies mas não adicionar valores claramente de segurança em dados do cliente.
- Sessão: gera um código aleatório para identificar o usuário logado, e no servidor, atrelar esse código ao email do usuário, por exemplo
- **session_start()**, **session_destroy()** e $_SESSION["usuario_logado"]

## 5. Passando parâmetros para a próxima requisição
- Passar parâmetros somente pela sessão, quando possível. Assim como fizemos com as mensagens de erro e sucesso

## 6. Refatoração, escopo de flash e controle de erro

## 7. Um único formulário para adicionar e alterar

## 8. SQL Injection
- Tratar qualquer query com os dados que o usuário manda para o site
``$email = mysqli_real_escape_string($email);``

## 9. Include, require, require_once
- include dá erro caso o arquivo não exista
- require_once garante que o arquivo só seja inserido uma vez

## 10. Envio de email via SMTP