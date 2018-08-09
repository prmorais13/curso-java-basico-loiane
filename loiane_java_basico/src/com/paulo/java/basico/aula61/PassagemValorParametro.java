package com.paulo.java.basico.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Paulo", "987015547", "prmorais");
		int valor = 10;

		System.out.println("**** Valores originais");
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("**** Exemplo 1");
		testePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("**** Exemplo 2");
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);

	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Fernanda", "987361339", "nanda");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Fernanda" + valor);
	}

}
