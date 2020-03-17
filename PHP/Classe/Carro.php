<?php

class Carro{

private $modelo;
private $motor;
private $ano;

public function getModelo(){

return $this->modelo;

}
public function setModelo($modelo){
$this->modelo = $modelo;

}
public function getMotor(){

	return $this->motor;
}
public function setMotor($motor){
$this->motor = $motor;
}
public function getAno(){

return $this->ano;
}
public function setAno($ano){
$this->ano = $ano;
}

public function exibir(){

  return array(

"modelo"=>$this->getModelo(),
"motor"=>$this->getMotor(),
"ano"=>$this->getAno()

  );
$hb20 = new Carro();
$hb20->setModelo = ("HB20 2016");
$hb20->setMotor = ("16 Valvulas");
$hb20->setAno = ("2016");

var_dump($hb20);


}




}






?>