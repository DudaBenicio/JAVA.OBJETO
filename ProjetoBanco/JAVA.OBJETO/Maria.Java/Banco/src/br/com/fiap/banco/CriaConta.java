package br.com.fiap.banco;
//CODIGO DANDO ERRADO

public class CriaConta {

	public static void main(String[] args) {
		
		Cliente clienteIcaro = new Cliente ("Icaro", "rua abc" , "494938", "748292833");
		
		Conta contaIcaro = new Conta ( clienteIcaro, "1");
		contaIcaro.depositar(99999);
		contaIcaro.consultarSaldo();
		
		
		

		
	}

}
