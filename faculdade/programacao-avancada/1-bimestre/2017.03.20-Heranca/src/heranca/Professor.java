package heranca;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Professor extends Pessoa {
	
	private BigDecimal salario = BigDecimal.ZERO;
	private String especialidade;

	Professor(String nome, LocalDate dtNasc, String sexo, BigDecimal salario,String especialidade) {
		super(nome, dtNasc, sexo);
		// TODO Auto-generated constructor stub
	}

}
