<?php

/**
 * @Entity
 * @Table(name="cidade")
 */
class Cidade {

    /**
     * @Id 
     * @Column(type="integer")
     * @GeneratedValue(strategy="AUTO")
     */
    protected $idCidade;

    /**
     * @Column(type="string",length=100)
     */
    protected $nome;

    /**
     * @Column(length=2)
     */
    protected $uf;

    public function getIdCidade() {
        return $this->idCidade;
    }

    public function setIdCidade($idCidade) {
        $this->idCidade = $idCidade;
    }

    public function getNome() {
        return $this->nome;
    }

    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function getUf() {
        return $this->uf;
    }

    public function setUf($uf) {
        $this->uf = $uf;
    }

}

?>
