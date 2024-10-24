package br.com.fiap.banco;

public class Conta {
	
	// ATRIBUTOS //
	/*NOME DO CLIENE, CPF DO CLIENTE, NUMERO DA CONTA, SALDO */
	String clienteNome;
	String cpf;
	long numeroConta;
	double saldo;

	// METODOS
	
	/* O COD DO PROFESSOR */
	// public void (BOOLEAN)  sacar (double valor){  --- MUDA O VOID PARA BOOLEAN PARA COLOCAR O RETURN 
	// if (this.saldo >= valor) { 
	// saldo = saldo - valor; 
	//System.out.println("Saque realizado");
	// return true; 
	// System.out.println("Saldo insuficiente");
	// return false 
	
	public boolean sacar(double valor) {
		boolean validacao;
		if (saldo >= valor) {
			validacao = true;
			System.out.println("Saque realizado");
		} else {
			validacao = false;
			System.out.println("Saldo insuficiente");
		}
		return validacao;
		
		
	}
	// public void depositar (double valor) {
	// this.saldo = this.saldo + quantidade;
	public double depositar(double quantidade) {
		saldo =saldo + quantidade;
		return saldo;

	}

	public double consultarSaldo() {
		System.out.println("nome: " + clienteNome); 
		System.out.println("Saldo: " + saldo);
		
		
	return saldo; 
	
	}
	
// public void tranferir (Conta conta, double calor) {
	// if (this.sacar(valor)){
	
	public void tranferir (Conta conta, double valor) {
	if (this.sacar(valor)) {
		conta.depositar(valor); 
		
	}
	}
}
