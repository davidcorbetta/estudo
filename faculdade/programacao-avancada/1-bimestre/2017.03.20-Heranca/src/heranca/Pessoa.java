package heranca;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dtNasc;
	private String sexo;
	
	Pessoa(String nome, LocalDate dtNasc, String sexo){
		this.nome = nome;
		this.dtNasc = dtNasc;//LocalDate.now();
		this.sexo = sexo;
	}
	
	public String fazerNiver(){
		return "Feliz aniversário";
	}
	
	public String getNome() {
		return nome;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public String getSexo() {
		return sexo;
	}

	

	

}
