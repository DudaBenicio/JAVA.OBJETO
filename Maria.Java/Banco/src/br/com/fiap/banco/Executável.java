package br.com.fiap.banco;

public class Executável {

	public static void main (String[] args) {
		
		// instancias 
		
		Conta contaMaria = new Conta();
		Conta contaGabriel = new Conta ();
		
		// simulacoes
		contaMaria.depositar(690);
		
		contaGabriel.depositar(80);
		
		contaMaria.sacar(1000);
		contaGabriel.sacar(30); 
		
		contaMaria.consultarSaldo();
		contaGabriel.consultarSaldo();
		
		
		
		
	}
	
}
