package br.com.fiap.banco;

public class Conta {
	
	
	/* A classe Conta deve conter:
a) atributos: nome do cliente, cpf do cliente, numero de
conta e saldo */
	
	private Cliente cliente01; // CRIAR UM CLIENTE 
	private String numeroConta; 
	private double saldo; 

	
	public Conta (Cliente cliente01, String numeroConta) { 
		this.cliente01 = cliente01; 
		this.numeroConta = numeroConta; 
		this.saldo = 0.0; 
	}
	
	
	// ATRIBUTOS //
	/*NOME DO CLIENE, CPF DO CLIENTE, NUMERO DA CONTA, SALDO */

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
		System.out.println("Deposito Realizado com sucesso. ");

	}

	public double consultarSaldo() {
		System.out.println("Numero da Conta: " + numeroConta);
		System.out.println("Nome do Cliente: " + this.cliente01.getNome()); 
		System.out.println("Saldo: " + this.saldo);
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
