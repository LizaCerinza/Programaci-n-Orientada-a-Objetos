<?php
require_once('Car.php')
class UberVan extends Car {
    public $typeCarAcepted;
    public $seatMaterial;

    public function __construct($license, $driver,$typeCarAcepted,$seatMaterial){
        parent:__construct($license,$driver);
        this->typeCarAcepted  = $typeCarAcepted;
        this->seatMaterial  = $seatMaterial;
    }
}
?>  