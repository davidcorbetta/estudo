<?php

include_once './bootstrap.php';
include_once './entity/Cidade.php';
include_once './entity/Cliente.php';

$cidade = $entityManager->find("Cidade", 1);

$cliente = new Cliente();
$cliente->setNome("Luiz Henrique");
$cliente->setCidade($cidade);
$cliente->setCpf("11122233344");
$cliente->setIdade(15);
$cliente->setCelular("11111");
$cliente->setTelefone("11111");

$entityManager->persist($cliente);
$entityManager->flush();

//LISTAR CLIENTES
$clientes = $entityManager->getRepository("Cliente")->findAll();
foreach ($clientes as $cliente) {
    echo "<br>";
    echo $cliente->getNome();
}
?>
