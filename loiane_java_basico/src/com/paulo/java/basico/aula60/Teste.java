package com.paulo.java.basico.aula60;

public class Teste {

	public static void main(String[] args) {
		
		EscopoVariaveis ev = new EscopoVariaveis();
		ev.setValor(10);
		
		System.out.println(ev.getValor());
		
		System.out.println(ev.calcularValor(20));
		
		System.out.println(ev.getValor());

		System.out.println(ev.teste());
		
		ev.outroTeste();
	}

}
