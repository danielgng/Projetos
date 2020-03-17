<?php

require_once 'AcoesGames.php';
class Games implements AcoesGames{
   
    private $titulo;
    private $reproduzindo;
    private $genero;
    private $classificacao;
   
    public function __construct($titulo, $reproduzindo, $genero, $classificacao) {
        $this->titulo = $titulo;
        $this->reproduzindo = $reproduzindo;
        $this->reproduzindo = false;
        $this->genero = $genero;
        $this->classificacao = $classificacao;
    }
public function reproduzindo($reproduzindo){
    if($reproduzindo == true){
        
        echo "O jogo foi iniciado!";
    }
    
}
               
    public function morto($mortinho){
        
        if($mortinho == true){
            
            echo '<p>Voce e ruim demais cara, desisti logo!</p>';
        }else {
            
            $this->checkpoint(true);
        }
        }
    public function finalizar($acabou){              
            if($acabou === true){
                
                echo 'Ja chega cansei de te ve jogar, FLW!';
            }else{
                
                echo 'Erro!';
            }
            
        }
    

    public function checkpoint($ponto) {
        if($ponto === true){
            
            echo '<p>Denovo cara ve se nao morre mais ¬¬ </p>'; 
        }else{
            
            $this->morto(true);
        }
    }



    public function play($iniciar) {
       if($iniciar == true ){
           echo '<p>Boa sorte!</p>';
       }else{
           
           return $this->pause(true);
       }
    }
        public function pause($parar) {
            
       if($parar == true){
           echo '<p>O jogo foi pausado</p>';
       }else{
           return $this->finalizar(true);
       }
    }

    public function getTitulo() {
        return $this->titulo;
    }

    
    public function getReproduzindo() {
        return $this->reproduzindo;
    }

    public function getFinalizar() {
        return $this->finalizar;
    }

    public function setTitulo($titulo) {
        $this->titulo = $titulo;
    }

    public function setReproduzindo($reproduzindo) {
        $this->reproduzindo = $reproduzindo;
    }

    public function setFinalizar($finalizar) {
        $this->finalizar = $finalizar;
    }

    public function getGenero() {
        return $this->genero;
    }

    public function getClassificacao() {
        return $this->classificacao;
    }

    public function setGenero($genero) {
        $this->genero = $genero;
    }

    public function setClassificacao($classificacao) {
        $this->classificacao = $classificacao;
    }


    
    
}
