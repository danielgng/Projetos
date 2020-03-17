<?php


interface AcoesGames {
    public function play($iniciar);
    public function pause($parar);
    public function checkpoint($ponto);
    public function finalizar($acabou);
    public function morto($mortinho);



}
