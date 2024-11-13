package br.com.fiap.jdbc.models;

public enum genero {

	Feminino, Masculino, naoBinario; 
	
	private final String codigo; 
	
	
	// construtor do enum para associar codigo com a string 
	
	genero(String codigo) { 
		this.codigo = codigo; 
		
		// METODO PARA OBTER O CODIGO ASSOCIADO AO ENUM (o valor que seta salvo no banco
		
		public String getCodigo(){
			return codigo; 
		}
	}
}
