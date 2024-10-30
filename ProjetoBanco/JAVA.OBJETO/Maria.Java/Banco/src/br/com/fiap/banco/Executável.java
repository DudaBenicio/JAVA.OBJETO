package br.com.fiap.banco;

public class Executável {

	public static void main (String[] args) {
		
		// instancias 
	// CRIAR OS CLIENTES 
		Cliente cliente1 = new Cliente("Joao", "3774828728", "Av. Joao Dias" , null); 
		Cliente cliente2 = new Cliente ("Icaro", "377898728", "Av. Joao Batista" , null);
		
		Conta contaJoao = new Conta(cliente1 , "67778");
		Conta contaIcaro= new Conta (cliente2, "58867");
		
		contaIcaro.depositar(2000);
		contaIcaro.tranferir(contaJoao, 100);
		
		contaJoao.depositar(100);
		contaJoao.sacar(50);
		contaJoao.consultarSaldo();
		
		
		
		
		
		
		
	}
	
}
