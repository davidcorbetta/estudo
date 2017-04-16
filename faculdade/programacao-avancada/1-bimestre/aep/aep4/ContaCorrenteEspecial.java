package aep4;

import java.math.BigDecimal;



public class ContaCorrenteEspecial extends ContaCorrente{
	
	@Override
	public BigDecimal TaxaOperacao() {
		return new BigDecimal("0.01");
	}

}
