<?php
require_once("Configs.php");

echo session_save_path();

echo "<br>";

var_dump(session_status());

echo "<br>";

switch (session_status()) {
	case PHP_SESSION_DISABLED:
		echo"Sessão desabilitada";
		break;
		case PHP_SESSION_NOME:
		echo"Habilitada";
		break;
		case PHP_SESSION_ACTIVE:
		echo"Sessão Habilitada";
		break;
	

}




?>