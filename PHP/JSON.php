<?php

array_push($pessoas, array(
     'nome'=>'Daniel','idade'=>23


));

array_push($pessoas, array(
     'nome'=> 'Matheus', 'idade'=>24
 ));

echo json_decode($pessoas);

?>