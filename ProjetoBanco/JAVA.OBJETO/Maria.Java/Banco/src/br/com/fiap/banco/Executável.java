package br.com.fiap.banco;

public class Executável {

	public static void main (String[] args) {
		
		// INSTÂNCIAS
	// CRIAR OS CLIENTES 
		Cliente cliente1 = new Cliente("Joao", "3774828728", "Av. Joao Dias" , "28/12/2005"); 
		Cliente cliente2 = new Cliente ("Icaro", "377898728", "Av. Joao Batista" , "11/01/2001");
		
		Conta contaJoao = new Conta(cliente1 , "67778");
		Conta contaIcaro= new Conta (cliente2, "58867");
		
		contaIcaro.depositar(2000);
		contaIcaro.tranferir(contaJoao, 100);
		
		
		contaJoao.depositar(100);
		contaJoao.sacar(50);
		contaJoao.consultarSaldo();
		
		
		
		
		
		
		
	}
	
}
