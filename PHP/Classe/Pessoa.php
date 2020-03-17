<?php

class Pessoa{

public $nome;
public function falar(){

	return "O meu nome e ".$this->nome;
}


}
$Daniel = new Pessoa();
$Daniel->nome = "Daniel Oliveira";
echo $Daniel->falar();

?>