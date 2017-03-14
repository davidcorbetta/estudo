package aulaoo;

import java.math.BigDecimal;

public class Funcionario {
	String nome;
	BigDecimal salario = BigDecimal.ZERO;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
	
}
