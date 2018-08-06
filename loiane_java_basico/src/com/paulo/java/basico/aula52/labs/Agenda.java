package com.paulo.java.basico.aula52.labs;

public class Agenda {

	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[10];
	}

	public void adcionarContato(Contato contato) throws AgendaCheiaExcecao {
		boolean cheia = true;
		
		for (int i = 0; i < contatos.length; i++) {
			
			if (contatos[i] != null) {
				contatos[i] = contato;
				cheia = false;
			}			
		}
		
		if (cheia) {
			throw new AgendaCheiaExcecao();
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteExcecao {
		
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome));
				return i;
			}
		}
		
		throw new ContatoNaoExisteExcecao(nome);
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Contato contato : contatos) {
			s += contato.toString() + "\n";
		}
		return s;
	}

}
