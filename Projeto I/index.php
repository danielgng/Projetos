<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
    <center><h1>Projeto Controle Remoto</h1></center>
    <prev>
        
        <?php       
         require_once 'ControleRemoto.php';
         $c = new ControleRemoto();
         $c->ligar();
         $c->abrirMenu();
        ?>
        
    </prev>
    </body>
    
</html>
