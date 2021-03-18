<?php
require_once('Car.php');
require_once('UberX.php');
require_once('Account.php');

$uberx = new UberX("FGR345",new Account("liza C","5757"),"chevy","spark");
$uberx->printDataCar();

?>  