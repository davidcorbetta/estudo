<?php

use Doctrine\ORM\EntityRepository;

class ClienteRepository extends EntityRepository {

    public function listaClientes($em) {
        $query = $em
                ->createQueryBuilder()
                ->select("c")
                ->from("Cliente", "c")
                ->where("c.nome like '%luiz%'")
                ->getQuery();

        return $query->getResult();
    }

    public function quantidadeClienteCidade($em) {
        return $em
                ->createQueryBuilder()
                ->select("cid.nome","count(cli.idCliente) as quantidade")
                ->from("Cliente","cli")
                ->innerJoin("Cidade","cid","with","cli.cidade = cid")
                ->groupBy("cid.nome")
                ->getQuery()
                ->getResult();
                   
    }

}
