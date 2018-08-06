package com.paulo.java.basico.aula47;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exceção");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção ao acessar índice do vetor que não existe");
		}
		
		System.out.println("Esse texto será impresso após a exceção");
	}

}
