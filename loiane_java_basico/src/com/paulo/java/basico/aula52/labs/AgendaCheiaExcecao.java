package com.paulo.java.basico.aula52.labs;

public class AgendaCheiaExcecao extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia!";
	}

	
}
