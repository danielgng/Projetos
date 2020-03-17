<?php


abstract class Animal(){
  
public function falar(){
	return"som";
}
public function pelo(){
	return"padrao";
}
public function andar(){
	return"anda";
}


} 

class Gato extends Animal{

public function falar(){

	return "Mia";
}
public function andar(){

	return"Salta";
}

}
class Cachorro extends Animal{

	public function falar(){

		return "Late";
	}

}
//class Passaro extends Animal{
	//public function falar(){

		//return "piar";
	//}
//
//$akamaru = new Cachorro();
//$akamaru->falar();
//$akamaru->pelo("Grisalho");
//$akamaru->andar(100."metros");

//$rengar = new Gato();
//$rengar->falar();
//$rengar->pelo("Liso");
//$rengar->andar(200."metros");
?>