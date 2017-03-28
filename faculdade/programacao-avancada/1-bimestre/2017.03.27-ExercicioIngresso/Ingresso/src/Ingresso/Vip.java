package Ingresso;

import java.math.BigDecimal;

public class Vip extends Ingresso {
	
	private  BigDecimal valorAdicional = BigDecimal.ZERO;

	@Override
	public BigDecimal imprimeValor(){
		return super.getValor().add(valorAdicional) ;
	}
	
	public BigDecimal getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(BigDecimal valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	

}
