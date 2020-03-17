<?php

$pessoas = array(
   'nome' => 'Daniel',
   'idade' => 23
 

);
foreach ($pessoas as &$value) {
   if(gettype($value) === 'integer') $value += 15;


	echo $value. '<br>';
}


print_r($pessoas);

?>