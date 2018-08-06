package com.paulo.java.basico.aula52.labs;

public class ContatoNaoExisteExcecao extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String nomeContato;
	
	public ContatoNaoExisteExcecao(String nomeContato) {
		this.nomeContato = nomeContato;
	}



	@Override
	public String getMessage() {
		return "Contato " + nomeContato + "não existe na agenda!";
	}

}
