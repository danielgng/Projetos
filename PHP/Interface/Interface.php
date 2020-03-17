<?php

interface Veiculo {

public function acelerar($velocidade);
public function freiar($velocidade);
public function trocarMarchar($marcha);


}


abstract class Automovel implements Veiculo{

public function acelerar($velocidade){

	echo "O veiculo acelerou ate".$velocidade."km/h";
}
public function freiar($velocidade){

	echo "O veiculo feiou ate".$velocidade."km/h";
}
public function trocarMarchar($marcha){

	echo "O veiculo esta na marcha".$marcha."km/h";
}

}
class BMW extends Automovel{

	public function parabrisa (){}
}

$carro = new BMW();


?>