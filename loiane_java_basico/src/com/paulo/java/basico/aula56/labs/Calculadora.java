package com.paulo.java.basico.aula56.labs;

public class Calculadora {

	public static void main(String[] args) {
		
		double x = 10.0;
		double y = 5.0;
		
		for (Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
	}
}
