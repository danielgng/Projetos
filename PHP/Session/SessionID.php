<?php



require_once ("Configs.php");

echo session_id();

session_regenerate_id();
var_dump($_SESSION);

?>