package br.com.fiap;

public class Carro extends Veiculo {
	
	private boolean freioMaoPuxado;
	
	//Conatrutor
	public Carro(
			String placa, int ano, String modelo, String tipoMotor, double potencia, 
			String cor, int velocidadeAtual, char marchaAtual, 
			boolean estaLigado) 
	{
		super(placa, ano, modelo, tipoMotor, potencia, cor, velocidadeAtual, marchaAtual, estaLigado);
		this.freioMaoPuxado = true;
	}
	
		
	@Override //Classe abstrata
	public void exibirInformacoes() {
		System.out.println(
				"--------------------"
				+ "\nPlaca: " + this.getPlaca()
				+ "\nAno: " + this.getAno()
				+ "\nModelo do carro: " + this.getModelo()
				+ "\nTipo do motor: " + this.getTipoMotor()
				+ "\nPotencia: " + this.getPotencia()
				+ "\nCor do carro: " + this.getCor()
				+ "\nVelocidade atual: " + this.getVelocidadeAtual()
				+ "\nMarcha atual: " + this.getMarchaAtual()
				+ "\nCarro esta ligado? " + this.getEstaLigado() 
				+ "\nFreio de mão puxado? " + this.freioMaoPuxado);
	}
	
	
	@Override //Classe abstrata
	public void desligar() {
		if(this.velocidadeAtual == 0){
			if(freioMaoPuxado == true) {
				this.estaLigado = false;
				System.out.println("\nCarro desligado!");
			}
			else
				System.out.println("\nPuxe o freio de mão para desligar o carro.");
		}
		else{
			freiar();
			desligar();
		}
		
	}
	
	
	@Override //Classe abstrata
	public void acelerar() {
		if(this.estaLigado == true){
			if((this.marchaAtual != 'N') && (freioMaoPuxado == false)){
				if((this.velocidadeAtual == 0) && (this.marchaAtual != '1')) {
					System.out.println("\nPara sair com o carro, mude sua marcha para 1.");
					return;
				}
				
				if(this.velocidadeMaxMarcha(this.marchaAtual) == false) {
					this.velocidadeAtual += 5;
					System.out.println("\nAcelerando...");
				}
			}
			else
				if(this.marchaAtual == 'N') 
					System.out.println("\nTroque de marcha para acelerar!");
				else
					if(freioMaoPuxado == true)
						System.out.println("\nDesça o freio de mão!");
		}
		else{
			ligar();
			acelerar();
		}
	}
	
	
	public void descerFreioMao(){
		if(freioMaoPuxado == false) 
			System.out.println("\nFreio de mão já está abaixado!");
		
		else {
			this.setFreioMaoPuxado(false);
			System.out.println("\nDescendo freio de mão...");
		}
	}
	
	
	public void puxarFreioMao(){
		if(freioMaoPuxado == true) {
			System.out.println("\nFreio de mão já está puxado!");
		}
		
		if(this.velocidadeAtual == 0) {
			this.setFreioMaoPuxado(true);
			System.out.println("\nPuxando freio de mão...");
			desligar();
		}
		
		else
			System.out.println("\nPare o carro para puxar o freio de mão");

	}

	
	//Getters e Setters
	public boolean isFreioMaoPuxado() {
		return freioMaoPuxado;
	}

	public void setFreioMaoPuxado(boolean freioMaoPuxado) {
		this.freioMaoPuxado = freioMaoPuxado;
	}
}
