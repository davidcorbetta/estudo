<?php

/**
 * @Entity
 * @Table(name="cliente")
 */
class Cliente {

    /**
     * @Id 
     * @Column(type="integer")
     * @GeneratedValue(strategy="AUTO")
     */
    protected $idCliente;

    /**
     * @Column(type="string",length=100)
     */
    protected $nome;

    /**
     * @ManyToOne(targetEntity="Cidade")
     * @JoinColumn(name="cidade", referencedColumnName="idCidade")
     */
    protected $cidade;

    /**
     * @Column(type="string",length=11)
     */
    protected $cpf;

    /**
     * @Column(type="integer")
     */
    protected $idade;

    /**
     * @Column(type="string",length=20)
     */
    protected $celular;

    /**
     * @Column(type="string",length=20)
     */
    protected $telefone;

    function getIdCliente() {
        return $this->idCliente;
    }

    function getNome() {
        return $this->nome;
    }

    function getCidade() {
        return $this->cidade;
    }

    function getCpf() {
        return $this->cpf;
    }

    function getIdade() {
        return $this->idade;
    }

    function getCelular() {
        return $this->celular;
    }

    function getTelefone() {
        return $this->telefone;
    }

    function setIdCliente($idCliente) {
        $this->idCliente = $idCliente;
    }

    function setNome($nome) {
        $this->nome = $nome;
    }

    function setCidade($cidade) {
        $this->cidade = $cidade;
    }

    function setCpf($cpf) {
        $this->cpf = $cpf;
    }

    function setIdade($idade) {
        $this->idade = $idade;
    }

    function setCelular($celular) {
        $this->celular = $celular;
    }

    function setTelefone($telefone) {
        $this->telefone = $telefone;
    }

}
