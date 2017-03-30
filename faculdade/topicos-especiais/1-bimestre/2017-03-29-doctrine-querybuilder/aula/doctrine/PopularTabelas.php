<?php

include_once './bootstrap.php';
include_once './entity/Cidade.php';
include_once './entity/Cliente.php';

$cidade = new Cidade();
$cidade->setNome("Apucarana");
$cidade->setUf("PR");
$entityManager->persist($cidade);
$entityManager->flush();

$cidade = new Cidade();
$cidade->setNome("Maringá");
$cidade->setUf("PR");
$entityManager->persist($cidade);
$entityManager->flush();

$cidade = new Cidade();
$cidade->setNome("Florianópolis");
$cidade->setUf("SC");
$entityManager->persist($cidade);
$entityManager->flush();

$cidade = new Cidade();
$cidade->setNome("Rio de Janeiro");
$cidade->setUf("RJ");
$entityManager->persist($cidade);
$entityManager->flush();


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

$cidade = $entityManager->find("Cidade", 1);
$cliente = new Cliente();
$cliente->setNome("João da Silva");
$cliente->setCidade($cidade);
$cliente->setCpf("11122233344");
$cliente->setIdade(15);
$cliente->setCelular("11111");
$cliente->setTelefone("11111");

$entityManager->persist($cliente);
$entityManager->flush();

$cidade = $entityManager->find("Cidade", 2);
$cliente = new Cliente();
$cliente->setNome("Maria da Silva");
$cliente->setCidade($cidade);
$cliente->setCpf("11122233344");
$cliente->setIdade(15);
$cliente->setCelular("11111");
$cliente->setTelefone("11111");

$entityManager->persist($cliente);
$entityManager->flush();

$cidade = $entityManager->find("Cidade", 3);
$cliente = new Cliente();
$cliente->setNome("Carlos de Souza");
$cliente->setCidade($cidade);
$cliente->setCpf("11122233344");
$cliente->setIdade(15);
$cliente->setCelular("11111");
$cliente->setTelefone("11111");

$entityManager->persist($cliente);
$entityManager->flush();







