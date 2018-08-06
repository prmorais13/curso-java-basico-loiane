package com.paulo.java.basico.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.print("Entre com um número decimal: ");
		try {
			double num = lerNumero();
			System.out.println("Número: " + num);
		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static double lerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		return num;
	}
}
