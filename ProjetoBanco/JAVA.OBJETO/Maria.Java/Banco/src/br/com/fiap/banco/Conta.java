package br.com.fiap.banco;

public class Conta {
	

	// ATRIBUTOS //
		/*NOME DO CLIENE, CPF DO CLIENTE, NUMERO DA CONTA, SALDO */
	protected Cliente cliente01; // CRIAR UM CLIENTE 
	protected String numeroConta; 
	protected double saldo; 

	
	public Conta (Cliente cliente, String numeroConta) { 
		this.cliente01 = cliente; 
		this.numeroConta = numeroConta; 
		this.saldo = 0.0; 
	}
	
	// MÉTODOS
	
	

	public boolean sacar(double valor) {
		boolean validacao;
		if (this.saldo >= valor) {
			validacao = true;
			this.saldo -= valor; 
			System.out.println("Saque realizado");
		} else {
			validacao = false;
			System.out.println("Saldo insuficiente");
		}
		return validacao;
		
		
	}
	// public void depositar (double valor) {
	// this.saldo = this.saldo + quantidade;
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Deposito Realizado com sucesso.");

	}

	public double consultarSaldo() {
		System.out.println("Numero da Conta: " + numeroConta);
		System.out.println("Nome do Cliente: " + this.cliente01.getNome()); 
		System.out.println("Saldo: " + this.saldo);
		return saldo; 
		/*System.out.println("Data de abertura da conta: " + this.dataAbertura);
		System.out.println("Data de nascimento: " + this.cliente01.getDataNasc());*/
	}
	
// public void tranferir (Conta conta, double calor) {
	// if (this.sacar(valor)){
	public void tranferir (Conta conta, double valor) {
	if (this.sacar(valor)) {
		conta.depositar(valor); 
		
	}
	}
}
