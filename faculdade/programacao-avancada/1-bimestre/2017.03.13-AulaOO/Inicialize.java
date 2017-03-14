package aulaoo;

import java.math.BigDecimal;

public class Inicialize {

	public static void main(String[] args) {
		/* Exemplo Produto
		Produto produto = new Produto();
		produto.setId(1);
		produto.setNome("Moto G5");
		produto.setPreco(900.00);
				
		System.out.println("Id: "+ produto.getId());
		System.out.println("Nome: "+ produto.getNome());
		System.out.println("Preço: "+ produto.getPreco());
		*/
		
		/* Exemplo Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("David");
		aluno.setRg("10.362.309-8");
		aluno.setIdade(27);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("RG: " + aluno.getRg());
		System.out.println("Idade: " + aluno.getIdade());
		*/
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fernando");
		funcionario.setSalario(new BigDecimal("15556.55"));
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
	}

}
