<?php

/**
 * @Entity
 * @Table(name="grupo")
 */
class Grupo {

    /**
     * @Id
     * @Column(type="integer")
     * @GeneratedValue(strategy="AUTO")
     */
    protected $idGrupo;

    /**
     * @Column(type="string", length=100)
     */
    protected $nome;
    
    
    /**
     * @ManyToMany(targetEntity="Cliente")
     * @JoinTable(name="grupoCliente",
     *    joinColumns={@JoinColumn(name="idGrupo", referencedColumnName="idGrupo")},
     *    inverseJoinColumns={@JoinColumn(name="idCliente", referencedColumnName="idCliente")}
     * )
     */
    
    protected $clientes;

    function getIdGrupo() {
        return $this->idGrupo;
    }

    function getNome() {
        return $this->nome;
    }

    function getClientes() {
        return $this->clientes;
    }

    function setIdGrupo($idGrupo) {
        $this->idGrupo = $idGrupo;
    }

    function setNome($nome) {
        $this->nome = $nome;
    }

    function setClientes($clientes) {
        $this->clientes = $clientes;
    }
    
    function addCliente(Cliente $cliente){
        $this->clientes[] = $cliente;
    }

}
