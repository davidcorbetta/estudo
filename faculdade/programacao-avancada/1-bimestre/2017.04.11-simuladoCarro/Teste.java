package simulado;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		String cor,mod;
		int ligar;
		double vmax,aceleracao;
		

		cor = JOptionPane.showInputDialog("Qual a cor do carro?");
		mod = JOptionPane.showInputDialog("Qual a modelo do carro?");
		vmax = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade máxima do carro?"));
		
		ligar = JOptionPane.showConfirmDialog(null,"Ligar Carro?","Sistema Carro", JOptionPane.OK_OPTION,JOptionPane.NO_OPTION);
		
		if (ligar == 0) {
			aceleracao = Double.parseDouble(JOptionPane.showInputDialog("Vamos acelerar, digite a velocidade de aceleração:"));
			Carro carro = new Carro(cor, mod, 0, vmax);
			carro.acelerar(aceleracao);
			System.out.println(carro.pegaMarcha());
			
		}	
		/*	
			op2 = JOptionPane.showInputDialog("Digite uma opo abaixo: \n [1] Camarote Superior \n [2] Camarote Inferior");
			
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
		*/
	}
	
}
