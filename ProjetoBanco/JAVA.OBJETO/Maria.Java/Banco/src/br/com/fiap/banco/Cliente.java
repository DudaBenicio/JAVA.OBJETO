package br.com.fiap.banco;

import java.util.Date; // BIBLIOTECA DATE 

public class Cliente {

	// CTRL + N = CRIA CLASS

// ATRIBUTOS 
	// PRIVATE PARA ENCAPSULAR AS INFORMAÇÕES
	private String nome;
	private String CPF;
	private String endereco;
	private Date dataNasc; // IMPORTAR A CRTL + SHIFT + O

	// CONSTRUTOR
	// ATALHO: CTRL + 3 + generate + Generate Construction...
	public Cliente(String nome, String cPF, String endereco, Date dataNasc) {
		this.nome = nome;
		CPF = CPF;
		this.endereco = endereco;
		this.dataNasc = dataNasc;

		// GETTER / SETTERS
		// CTRL + 3 + GENERATES GETTER AND SETTERS
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
