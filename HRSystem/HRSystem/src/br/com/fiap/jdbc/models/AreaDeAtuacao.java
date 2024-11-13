package br.com.fiap.jdbc.models;


public class AreaDeAtuacao {

		private long idArea; 
		private String nome, descricao;
		
		public AreaDeAtuacao(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
		}

		public long getIdArea() {
			return idArea;
		}

		public void setIdArea(long idArea) {
			this.idArea = idArea;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		} 
		
		} 
	
 
		

