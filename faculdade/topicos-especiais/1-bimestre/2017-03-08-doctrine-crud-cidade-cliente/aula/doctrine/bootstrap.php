<?php

include_once '../vendor/autoload.php';

use Doctrine\ORM\Tools\Setup;
use Doctrine\ORM\EntityManager;

$paths = array("./entity");
$isDevMode = true;
$dbParams = array(
    "driver" => "pdo_mysql",
    "host" => "localhost",
    "user" => "root",
    "password" => "",
    "dbname" => "aula"
);

$config = Setup::createAnnotationMetadataConfiguration($paths, $isDevMode);
//$config->setAutoGenerateProxyClasses(true);
$entityManager = EntityManager::create($dbParams, $config);
?>
