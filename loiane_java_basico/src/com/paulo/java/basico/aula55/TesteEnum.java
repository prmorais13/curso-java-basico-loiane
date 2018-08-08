package com.paulo.java.basico.aula55;

import com.paulo.java.basico.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i] + " - " + dias[i].getValor());
		}
		
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia + " - " + dia.getValor());
		}

	}

}
