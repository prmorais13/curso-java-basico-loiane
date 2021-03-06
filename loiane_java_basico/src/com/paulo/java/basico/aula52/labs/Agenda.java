package com.paulo.java.basico.aula52.labs;

public class Agenda {

	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}

	public void adcionarContato(Contato contato) throws AgendaCheiaExcecao {
		boolean cheia = true;
		
		for (int i = 0; i < contatos.length; i++) {
			
			if (contatos[i] == null) {
				contatos[i] = contato;
				cheia = false;
				break;
			}			
		}
		
		if (cheia) {
			throw new AgendaCheiaExcecao();
		}
	}
	
	public boolean consultarContatoPorNome(String nome) throws ContatoNaoExisteExcecao {
		
		/*for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome));
				return i;
			}
		}*/
		
		for (Contato contato : contatos) {
			if (contato != null) {
				if (contato.getNome().equalsIgnoreCase(nome)) {
					return true;
				}
			}
		}
		
		throw new ContatoNaoExisteExcecao(nome);
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Contato contato : contatos) {
			if (contato != null) {
				s += contato.toString() + "\n";
			}		
		}
		return s;
	}

}
