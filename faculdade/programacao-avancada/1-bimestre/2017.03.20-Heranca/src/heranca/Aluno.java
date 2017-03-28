package heranca;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	
	Aluno(String nome, LocalDate dtNasc, String sexo, String matricula, String curso) {
		super(nome, dtNasc, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}

	
	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}
	
	
	

}
