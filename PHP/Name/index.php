
<?php
require_once("Namespace.php");


use Cliente\Cadastro;


$cad = new Cadastro();
$cad->setNome("Daniel Oliveira");
$cad->setEmail("danieloliveira8c@gmail.com");
$cad->setSenha("123456789");
$cad->registrarVenda();

?>

