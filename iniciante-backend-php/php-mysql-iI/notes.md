# PHP e MySQL II

[Link para o curso](https://cursos.alura.com.br/course/php-mysql-e-fundamentos-da-web-parte-2)

Curso iniciado em:

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

:white_check_mark: 1. Uma ação de login
:white_check_mark: 2. Efetuando o login e cookies
:white_check_mark: 3. Protegendo o acesso as páginas, refatorando e extraindo a lógica
4. Insegurança com cookies, segurança com session e efetuando logout
5. Passando parâmetros para a próxima requisição
6. Refatoração, escopo de flash e controle de erro
7. Um único formulário para adicionar e alterar
8. SQL Injection
9. Include, require, require_onde
10. Envio de email via SMTP

## 1. Uma ação de login
- Sempre criptografar a senha, nem que seja só por md5
- var_dump() para imprimir valores do Array
- header() novamente para redirecionar o usuário, no caso do login. Passando o parâmetro de sucesso index.php?login=1

## 2. Efetuando o login e cookies
- Usar ```time() + 60``` como terceiro parâmetro no **setcookie** para determinar o tempo de duração do cookie 

## 3. Protegendo o acesso as páginas, refatorando e extraindo a lógica
- Proteger não só a página de exibição das informações, mas também as lógicas envolvidas com o banco de dados
- Concentrar a lógica de manioulação de cookies em um só lugar