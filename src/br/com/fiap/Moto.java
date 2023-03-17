package br.com.fiap;

public class Moto extends Veiculo {
	
	public Moto(
			String placa, int ano, String modelo, String tipoMotor, double potencia, 
			String cor, int velocidadeAtual, char marchaAtual, 
			boolean estaLigado) 
	{
		super(placa, ano, modelo, tipoMotor, potencia, cor, velocidadeAtual, marchaAtual, estaLigado);
		
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("\n"
				+ "Placa: " + this.getPlaca()
				+ "\nAno: " + this.getAno()
				+ "\nModelo do carro: " + this.getModelo()
				+ "\nTipo do motor: " + this.getTipoMotor()
				+ "\nPotencia: " + this.getPotencia()
				+ "\nCor do carro: " + this.getCor()
				+ "\nVelocidade atual: " + this.getVelocidadeAtual()
				+ "\nMarcha atual: " + this.getMarchaAtual()
				+ "\nCarro esta ligado? " + this.getEstaLigado());
	}
	
	@Override //Classe abstrata
	public void acelerar() {
		if((estaLigado == true) && (marchaAtual != 'N')){
			velocidadeAtual += 2;
		}
		
	}

	@Override //Classe abstrata
	public void desligar() {
		if(this.velocidadeAtual == 0){
			this.estaLigado = false;
			System.out.println("\nMoto desligado!");
		}
		else{
			freiar();
			desligar();
		}
	}
}
