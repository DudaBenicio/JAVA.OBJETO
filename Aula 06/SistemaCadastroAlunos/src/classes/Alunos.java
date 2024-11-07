package classes;

public abstract class Alunos {
	
	String nome, matricula; 
	double nota1;
	double nota2;
	
	// METODOS

	public boolean verificarAprovacao() {
		if (calcularMedia() > 6) {
		return true;
	}
		else {return false; }
	}
	public void exibirInfo() {	
	System.out.println("nome" + nome);
	System.out.println("matricula: " + matricula);
	System.out.println("Media" + calcularMedia());
	System.out.println(" Status de aprovação: " + verificarAprovacao());
	} 
	
	public abstract double calcularMedia();
	public Alunos(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	}


	

		

	

