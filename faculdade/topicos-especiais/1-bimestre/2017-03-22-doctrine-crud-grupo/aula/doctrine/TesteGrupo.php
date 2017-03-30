<?php

include_once './bootstrap.php';
include_once './entity/Cidade.php';
include_once './entity/Cliente.php';
include_once './entity/Grupo.php';

$cliente1 = $entityManager->find("Cliente", 1);
$cliente2 = $entityManager->find("Cliente", 2);

$grupo = new Grupo();
$grupo->setNome("Amarelo");

$grupo->addCliente($cliente1);
$grupo->addCliente($cliente2);

$entityManager->persist($grupo);
$entityManager->flush();

