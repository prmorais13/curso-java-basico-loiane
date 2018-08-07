package com.paulo.java.basico.aula55;

import com.paulo.java.basico.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana dia : dias) {
			System.out.println(dia + " - " + dia.getValor());
		}

	}

}
