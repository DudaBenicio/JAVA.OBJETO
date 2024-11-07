package classes;

public class AlunosPosGraduacao extends Alunos{

	public AlunosPosGraduacao(String nome, String matricula) {
		super(nome, matricula);
		
	}

	@Override
	public double calcularMedia() {
		double media = ((nota1 * 3) + (nota2 *2))/5; 
		return media;
		
	
	}

}
