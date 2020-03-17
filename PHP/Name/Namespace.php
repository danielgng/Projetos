<?php



spl_autoload_register(function($nomeClass){

    $dirClass = "Class";
    $filename = $dirClass.DIRECTORY_SEPARATOR.$nomeClass.".php";
    if(file_exists($filename)){

    	require_once($filename);
    }
});
?>