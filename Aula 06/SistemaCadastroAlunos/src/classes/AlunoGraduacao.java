package classes;

public class AlunoGraduacao extends Alunos{

	public AlunoGraduacao(String nome, String matricula) {
		super(nome, matricula);
	}

	@Override
	public double calcularMedia() {
		double media = nota1 + nota2 /2; 
		return media;
	}
	

}
