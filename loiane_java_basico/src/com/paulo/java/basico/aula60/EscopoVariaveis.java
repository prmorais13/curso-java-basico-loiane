package com.paulo.java.basico.aula60;

public class EscopoVariaveis {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calcularValor(int valor) {
		valor = valor + 10;
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		if (true) {
			valor--;
		}
		return valor;
	}
	
	public void outroTeste() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		int j;
		for(j = 0; j < 10; j++) {
			System.out.print(j);
		}
		
		System.out.println();
		System.out.println(j);
	}

}
