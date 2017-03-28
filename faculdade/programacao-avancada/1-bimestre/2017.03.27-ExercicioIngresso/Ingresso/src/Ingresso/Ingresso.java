package Ingresso;

import java.math.BigDecimal;

public class Ingresso {
	private BigDecimal valor = BigDecimal.ZERO;
	
	Ingresso(){
		this.valor = new BigDecimal("65.00");
	}

	public BigDecimal imprimeValor(){
		return valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	
	

}
