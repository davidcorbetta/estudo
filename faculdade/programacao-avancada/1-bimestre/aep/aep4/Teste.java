package aep4;

import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		  ContaCorrente normal = new ContaCorrente();
		  normal.depositar(new BigDecimal("200"));
		  normal.depositar(new BigDecimal("200"));
		  normal.depositar(new BigDecimal("200"));
		  normal.sacar(new BigDecimal("500"));

		  ContaCorrenteEspecial especial = new ContaCorrenteEspecial();
		  especial.depositar(new BigDecimal("200"));
		  especial.depositar(new BigDecimal("200"));
		  especial.depositar(new BigDecimal("200"));
		  especial.sacar(new BigDecimal("500"));
		  
		  System.out.println("Normal Valor: "+normal.getSaldo());
		  System.out.println("Especial Valor: "+especial.getSaldo());
	}

}
