<?php


$periodo = new DateInterval("P15");


$dt = new DateTime();

$dt->add($periodo);

echo $dt->format("d/m/Y");



?>