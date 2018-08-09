package com.paulo.java.basico.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(2, 4));
		System.out.println(soma(2, 4, 6));

		int[] vetor = { 1, 2, 5, 7, 9 };
		System.out.println(soma(vetor));
		
		System.out.println(soma(3, 5, 7, 10, 35));
	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {

			total += vetor[i];
		}

		return total;
	}

	static int soma(Integer... vetor) {
		
		int total = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			total += vetor[i];
		}
		
		return total;
	}	
		

}
