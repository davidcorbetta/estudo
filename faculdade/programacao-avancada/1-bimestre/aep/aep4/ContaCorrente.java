package aep4;

import java.math.BigDecimal;

public class ContaCorrente {
	
	private BigDecimal saldo = BigDecimal.ZERO;
	
	public void depositar(BigDecimal valor){
		setSaldo(this.saldo.add(valor));
	}
	public void sacar(BigDecimal valor){
		setSaldo(this.saldo.subtract(valor));
		setSaldo(this.saldo.subtract(valor.multiply(TaxaOperacao())));
	}
	public BigDecimal TaxaOperacao() {
		return new BigDecimal("0.05");
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	private void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
}
