package br.com.fiap.jdbc.models;

import java.sql.Connection;
import java.util.List;

public class AreaDeAtuacao {

		private long idArea; 
		private String nome, descricao;
		
		public AreaDeAtuacao(String nome, String descricao) {
			super();
			this.nome = nome;
			this.descricao = descricao;
		}

		public AreaDeAtuacao(Connection connection) {
			// TODO Auto-generated constructor stub
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

		public List<AreaDeAtuacao> selectAreaDeAtuacaoCandidato() {
			// TODO Auto-generated method stub
			return null;
		} 
		
		} 
	
 
		

