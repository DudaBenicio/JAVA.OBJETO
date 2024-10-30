package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; // BIBLIOTECA DATE 


public class Cliente {

	// CTRL + N = CRIA CLASS

// ATRIBUTOS 
	// PRIVATE PARA ENCAPSULAR AS INFORMAÇÕES
	private String nome;
	private String CPF;
	private String endereco;
	private Date dataNasc = new Date(); // IMPORTAR A CRTL + SHIFT + O

	// CONSTRUTOR
	// ATALHO: CTRL + 3 + generate + Generate Construction...
	public Cliente(String nome, String CPF, String endereco, String dataNasc) {
		this.nome = nome;
		this.CPF= CPF;
		this.endereco = endereco;
		
		SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy"); // IMPORTAR CLASS
		try {
			this.dataNasc = format.parse(dataNasc);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + dataNasc);
			e.printStackTrace();
			
		}

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
		CPF = CPF;
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
