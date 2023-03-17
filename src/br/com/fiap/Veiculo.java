package br.com.fiap;

public abstract class Veiculo {
	
	//Atributos
	private String placa;		//Placa do veiculo
	private int ano;			//Ano do veiculo
	private String modelo;		//Modelo do veiculo
	private String tipoMotor;	//Tipo de motos
	private double potencia;  	//Cavalos
	private String cor;			//Cor do veiculo
	
	protected int velocidadeAtual;
	
	protected char marchaAtual; 
	protected boolean estaLigado = false;
	
	//Construtor
	public Veiculo(String placa, int ano, String modelo, String tipoMotor, 
			double potencia, String cor,
			int velocidadeAtual, char marchaAtual, boolean estaLigado) 
	{
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
		this.cor = cor;
		this.velocidadeAtual = velocidadeAtual;
		this.marchaAtual = marchaAtual;
		this.estaLigado = estaLigado;
	}

	//Metodos
	public void ligar(){
		if((this.velocidadeAtual == 0) && (this.marchaAtual == 'N')){
			this.estaLigado = true;
			System.out.println("\nCarro ligado!");
		}
		else
			if(this.marchaAtual != 'N') {
				System.out.println("\nMude a marcha para N para ligar seu carro!");
			}
	}
	
	
	public void freiar(){
		if(this.velocidadeAtual > 0) {
			System.out.println("\nFreiando...");
			this.velocidadeAtual -= 5;
		}
		else
			System.out.println("\nO Carro já está parado!");
	}
	
	
	public void mudarMarcha() {
		if((this.estaLigado == false) && (this.marchaAtual != 'N')) {
			this.marchaAtual = 'N';
			System.out.println("\nMarcha N");
		}
		
		if(this.estaLigado == true) {
			if(this.velocidadeAtual == 0) {
				this.marchaAtual = '1';
				System.out.println("\nMarcha 1");
			}
			if(this.velocidadeAtual == 10) {
				this.marchaAtual = '2';
				System.out.println("\nMarcha 2");
			}
			if(this.velocidadeAtual == 20) {
				this.marchaAtual = '3';
				System.out.println("\nMarcha 3");
			}
		}
	}
	
	
	public boolean velocidadeMaxMarcha(char marchaAtual){
		if(marchaAtual == '1') {
			if(this.velocidadeAtual < 10) {
				System.out.println("\n1");
				return false;
			}
			else {
				System.out.println("\nMude de marcha para acelerar mais!");
			}
		}
		if(marchaAtual == '2') {
			if(this.velocidadeAtual < 20) {
				System.out.println("\n2");
				return false;
			}
			else {
				System.out.println("\nMude de marcha para acelerar mais!");
			}
		}
		if(marchaAtual == '3') {
			if(this.velocidadeAtual < 30) {
				System.out.println("\n3");
				return false;
			}
			else {
				System.out.println("\nMude de marcha para acelerar mais!");
			}
		}
		return true;
	}
	
	
	public abstract void acelerar();
	
	public abstract void exibirInformacoes();
	
	public abstract void desligar();
	
	
	//Getters e Setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public char getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(char marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	public boolean getEstaLigado() {
		return estaLigado;
	}
	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}
}
