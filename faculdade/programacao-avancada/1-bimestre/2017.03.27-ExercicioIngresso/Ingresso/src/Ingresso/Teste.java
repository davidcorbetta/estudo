package Ingresso;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		String op1,op2;

		op1 = JOptionPane.showInputDialog("Digite uma opção abaixo: \n [1] Normal \n [2] VIP");
		
		if (op1.equals("2")) {
			
			op2 = JOptionPane.showInputDialog("Digite uma opção abaixo: \n [1] Camarote Superior \n [2] Camarote Inferior");
			
			if (op2.equals("2")) {
				CamaroteInferior camaroteInferior = new CamaroteInferior();
				camaroteInferior.setLocalizacao("Setor A");
				System.out.println("Valor: "+camaroteInferior.imprimeValor());
				System.out.println("Local: "+camaroteInferior.imprimeLocalizacao());
			} else {
				CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
				camaroteSuperior.setValorAdicional(new BigDecimal("12.65"));
				System.out.println("Valor: "+camaroteSuperior.imprimeValor());
			}
		} else {
		  Normal normal = new Normal();
		  System.out.println("Valor: "+normal.imprimeValor());
		}
		
		

	}

}
