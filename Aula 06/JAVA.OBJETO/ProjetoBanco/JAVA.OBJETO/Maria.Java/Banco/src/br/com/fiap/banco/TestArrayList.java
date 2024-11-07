package br.com.fiap.banco;

import java.util.LinkedList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<Integer>();
		
		
		long inicio = System.currentTimeMillis();
		for (int i = 1; i <= 1000; i++) {
			lista.add(i); 
			
		}
		 
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio; 
		System.out.println(lista);
		System.out.println("tempo gasto: " + tempo);
				
	}

}
