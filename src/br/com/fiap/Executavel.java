package br.com.fiap;

public class Executavel {
	public static void main(String[] args) {
								//Placa   Ano   Modelo  Motor Potencia  Cor    Velocidade  Marcha  Carro ligado
		Carro carro1 = new Carro("123A", 2010, "Slim", "V6", 260, "Amarelo", 0, 'N', false);
		
		Carro carro2 = new Carro("789A", 1980, "Ret", "V2", 400, "Roxo", 0, 'N', false);
		
		
		carro2.ligar();
		
		carro2.acelerar();
		
		//carro2.mudarMarcha();
		//carro2.acelerar();
		
		carro2.descerFreioMao();
		
		carro2.exibirInformacoes();
		
		carro2.acelerar();
		
		carro2.exibirInformacoes();
		//carro2.acelerar();
		//carro2.acelerar();
		
	}
}
