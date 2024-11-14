package br.com.fiap.jdbc.models;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidato {

	public long idCandidato; 
	public String nome, formacao, email, endereco; 
	public LocalDate DatNasc;  
	public float tempoExp; 
	long idArea;  
	Genero Genero;
	String Telefone; 
	
	// Ctrl + 3 
	public Candidato(String nome, String formacao, String email, String endereco, String datNasc, float tempoExp,
			Genero genero) {

		this.nome = nome;
		this.formacao = formacao;
		this.email = email;
		this.endereco = endereco;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.DatNasc = LocalDate.parse(datNasc, format);
		this.tempoExp = tempoExp;
		this.Genero = genero;}



	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDatNasc() {
		return DatNasc;
	}

	public void setDatNasc(LocalDate datNasc) {
		this.DatNasc = datNasc;
	}

	public float getTempoExp() {
		return tempoExp;
	}

	public void setTempoExp(float tempoExp) {
		this.tempoExp = tempoExp;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public Genero getGenero() {
		return Genero;
	}	
		public void setTelefone(Genero genero) {
			this.Genero = genero;
	}


	public String getTelefone() {
		// TODO Auto-generated method stub
		return null;
	} 
	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}

	public void setGenero(String string) {
	
		
	}
}
