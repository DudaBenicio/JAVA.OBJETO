package exercicos.java;

public class Exercico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VERIFICAR OS PESOS DE CADA UM E QUAL É O MAIOR
		double ouro = 10;
		double prata = 10; 
		double bronze = 30; 
		
		if (ouro>prata) {
			if (ouro>bronze) { 
				System.out.println("O ouro e o mais pesado");
			}else { 
				System.out.println("Bronze e o metal mais pesado");
			}
				}else if (prata>bronze) {
		System.out.println("Prata é o metal mais pesado");
		
				}else {
		System.out.println("Bronze pe o mais é o mais pesado");
		
		// OUTRA OPÇÃO UTILIZANDO O "OU"
		if (ouro>prata && ouro>bronze) {
			if (ouro>bronze) { 
				System.out.println("O ouro é o mais pesado");
			}else { 
				System.out.println("Bronze pe o metal mais pesado");
			}
				}else if (prata>bronze) {
		System.out.println("Prata é o metal mais pesado");
		
				}else {
		System.out.println("Bronze pe o mais é o mais pesado");
			}
			}
		}
		
	}


