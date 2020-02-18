<?php
require_once 'Controlador.php';
class ControleRemoto implements Controlador {
   private $volume;
   private $ligado;
   private $tocando;
    
   function __construct() {
       $this->volume = 50;
       $this->ligado = false;
       $this->tocando = false;
   }
   function getVolume() {
       return $this->volume;
   }
   function getLigado() {
       return $this->ligado;
   }
   function getTocando() {
       return $this->tocando;
   }
   function setVolume($volume) {
       $this->volume = $volume;
   }
   function setLigado($ligado) {
       $this->ligado = $ligado;
   }

   function setTocando($tocando) {
       $this->tocando = $tocando;
   }

   
    public function abrirMenu() {
        echo '<br> Esta Ligado?'.($this->getLigado()?"SIM":"NÃO");
        echo '<br> Esta Tocando?'.($this->getTocando()?"SIM":"NÃO");
        echo '<br> Volume: '.$this->getVolume();
        for ($i=0; $i<= $this->getVolume(); $i+=10){
            echo '|';
            
        }
        echo '<br>';
    }

    public function desligar() {
        $this->setLigado(false);
    }

    public function desligarMudo() {
        if($this->getLigado() && $this->getVolume() == 0 ){
            $this->setVolume() = 50;
            
        }
    }

    public function fecharMenu() {
        echo '<br>Fechando Menu...';
    }

    public function ligar() {
        $this->setLigado(true);
    }

    public function ligarMudo() {
        if($this->getLigado() && $this->getVolume() > 0 ){
            $this->setVolume() = 0;
            
        }
    }

    public function maisVolume() {
        if($this->setLigado()){
            $this->setVolume($this->setVolume() + 5);
            
        }
    }

    public function menosVolume() {
        if($this->setLigado()){
            $this->setVolume($this->setVolume() - 5);
            
        }
    }

    public function pause() {
        if($this->getLigado() && $this->getTocando()){
            $this->setTocando(false);
            
        }
    }

    public function play() {
        if($this->getLigado() && !($this->getTocando())){
            $this->setTocando(true);
            
        }
    }

}
