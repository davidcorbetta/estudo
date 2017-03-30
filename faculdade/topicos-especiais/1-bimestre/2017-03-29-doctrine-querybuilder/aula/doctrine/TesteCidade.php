<?php
include_once './bootstrap.php';
include_once './entity/Cidade.php';


//NOVA CIDADE
/* $cidade = new Cidade();
  $cidade->setNome("Apucarana");
  $cidade->setUf("PR");

  $entityManager->persist($cidade);
  $entityManager->flush();

  echo $cidade->getIdCidade();
 */

//ALTERAR CIDADE
/*
 $cidade = $entityManager->find("Cidade", 1);
  $cidade->setNome("Apucarana");
  $cidade->setUf("PR");

  $entityManager->persist($cidade);
  $entityManager->flush();
*/


//REMOVER CIDADE
/* $cidade = $entityManager->find("Cidade", 1);
  $entityManager->remove($cidade);
  $entityManager->flush(); 
 */


//LISTAR CIDADES
$cidades = $entityManager->getRepository("Cidade")->findAll();
foreach ($cidades as $cidade){
    echo "<br>";
    echo $cidade->getNome();
}


    


?>
