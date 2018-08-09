package com.paulo.java.basico.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while (opcao != 3) {
			opcao = obterOpcaoMenu(sc);
			
			if (opcao == 1) {		
				consultarContato(sc, agenda);
			}
			else if (opcao == 2) {	
				adicionar(sc, agenda);		
			}
			else if (opcao == 3) {	
				System.exit(0);
			}
		}

		sc.close();
	}
	
	public static int obterOpcaoMenu(Scanner sc) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while (!entradaValida) {
			System.out.println("Digite a opção desejada: 1 - Consultar contato "
								+ "2 - Adicionar contato 3 - Sair");
			try {
				String entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;	
				}
				else {
					throw new Exception("Entrada inválida!");
				}
			} 
			catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente.\n");
			}
			
		}
		return opcao;
	}
	
	public static String lerInformacaoString(Scanner sc, String msg) {
		System.out.print(msg);
		String entrada = sc.nextLine();
		return entrada;
	}
	
	public static void adicionar(Scanner sc, Agenda agenda) {		
		try {
			System.out.println("Entre com os dados do contato:");
			
			String nome = lerInformacaoString(sc, "Nome: ");
			String telefone = lerInformacaoString(sc, "Telefone: ");
			String email = lerInformacaoString(sc, "E-mail: ");
			
			Contato contato = new Contato(nome, telefone, email);
			
			System.out.println("---------------------");
			System.out.println("Contato a ser criado:");
			System.out.println(contato);
			System.out.println("---------------------");
	
			agenda.adcionarContato(contato);
		} catch (AgendaCheiaExcecao e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos cadastrados na agenda:");
			System.out.println(agenda);
			System.out.println();
		}

	}
	
	public static void consultarContato(Scanner sc, Agenda agenda) {
		
		String nomeContato = lerInformacaoString(sc, "Entre com o nome do contato para pesquisar: ");
		
		try {
			if (agenda.consultarContatoPorNome(nomeContato)) {
				System.out.println("Contato já cadastrado!");
				System.out.println();
			}
			
		} catch (ContatoNaoExisteExcecao e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		
	}
}
