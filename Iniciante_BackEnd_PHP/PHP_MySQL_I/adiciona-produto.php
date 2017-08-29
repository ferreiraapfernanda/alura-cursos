<html>
<head>
    <title>Minha loja</title>
    <meta charset="utf-8">
    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/loja.css" rel="stylesheet" />
</head>

<body>
    <div class="container">

        <div class="principal">

        <?php
        $nome = $_GET["nome"];
        $preco = $_GET["preco"];
        ?>
        
        <p class="alert-success">
         Produto <?= $nome; ?>, <?= $preco; ?> adicionado com sucesso!
        </p>

        </div>

    </div>

</body>
</html>
