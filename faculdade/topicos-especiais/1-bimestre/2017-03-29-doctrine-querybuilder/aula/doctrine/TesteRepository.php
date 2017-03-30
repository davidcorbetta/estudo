<?php

include_once './bootstrap.php';
include_once './entity/Cidade.php';
include_once './entity/Cliente.php';
include_once './entity/ClienteRepository.php';
include_once './entity/Grupo.php';

$clienteRepository = $entityManager->getRepository("Cliente");
//var_dump($clienteRepository);

$clientes = $clienteRepository->listaClientes($entityManager);

foreach($clientes as $cliente){
    echo "<br>".$cliente->getIdCliente();
    echo "<br>".$cliente->getNome();
    echo "<br>".$cliente->getCidade()->getNome();
}

var_dump($clienteRepository->quantidadeClienteCidade($entityManager));
