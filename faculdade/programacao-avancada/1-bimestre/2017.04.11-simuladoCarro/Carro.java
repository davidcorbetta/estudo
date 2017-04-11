package simulado;

public class Carro {
	
	public String cor;
    public String modelo;
    public double velocidadeAtual = 0;
    public double velocidadeMaxima;
    private String statusMotor = "off";
    private int marchas = 5;
    
    Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima){
    	this.cor = cor;
    	this.modelo = modelo;
    	this.velocidadeAtual = velocidadeAtual;
    	this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean ligar(){
    	if (this.statusMotor == "off"){
    		this.statusMotor = "on";
    	}
    	return true;
    }
    
    public boolean desligar(){
    	if (this.statusMotor == "on") {
    		this.statusMotor = "off";
    	}
    	return false;
    }
    
    public void acelerar(double velocidade){
    	this.velocidadeAtual = velocidade;
    }
    
    public String pegaMarcha(){
    	double entreMarcha = this.velocidadeMaxima / this.marchas;
    	
    	for (int i = 1; i < this.marchas;i++) {
    		if (this.velocidadeAtual <= (entreMarcha * i)) {
				return Integer.toString(i);
			}
		}
    	
    	return Integer.toString(this.marchas);
    }

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
    
}
