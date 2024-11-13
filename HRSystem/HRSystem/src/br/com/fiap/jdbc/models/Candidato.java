package br.com.fiap.jdbc.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidato {

	public long idCandidato; 
	public String nome, formacao, email, endereco; 
	public LocalDate datNasc;  
	public float tempoExp; 
	long idArea;  
	genero genero;
	long Telefone; 
	
	// Ctrl + 3 
	public Candidato(String nome, String formacao, String email, String endereco, String datNasc, float tempoExp,
			genero genero) {

		this.nome = nome;
		this.formacao = formacao;
		this.email = email;
		this.endereco = endereco;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.datNasc = LocalDate.parse(datNasc, format);
		this.tempoExp = tempoExp;
		this.genero = genero;}

		public Candidato() {
		this.genero	= genero.Feminino;
		
			}

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
		return datNasc;
	}

	public void setDatNasc(LocalDate datNasc) {
		this.datNasc = datNasc;
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

	public genero getGenero() {
		return genero;
	}

	public void setGenero(genero genero) {
		this.genero = genero;
	} 
}
