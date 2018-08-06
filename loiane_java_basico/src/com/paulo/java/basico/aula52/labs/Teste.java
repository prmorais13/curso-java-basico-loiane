package com.paulo.java.basico.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = obterOpcaoMenu(sc);
		
		Agenda agenda = new Agenda();
		
		if (opcao == 1) {
			System.out.print("Digite o nome para pesquisar:");
			String nome = sc.nextLine();
			
			try {
				agenda.consultarContatoPorNome(nome);
			} catch (Exception e) {
				throw new ContatoNaoExisteExcecao(nome);
			}		
		}
		else if (opcao == 2) {
			
			Contato contato = adicionar(sc);
			
			agenda.adcionarContato(contato);
		}
		else {
			System.exit(0);
		}
		
		
		sc.close();

	}
	
	public static int obterOpcaoMenu(Scanner sc) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while (!entradaValida) {
			System.out.println("Diigite a opção desejada:");
			System.out.println("1 - Consultar contato");
			System.out.println("2 - Adicionar contato");
			System.out.println("3 - Sair");
			
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
	
	public static Contato adicionar(Scanner sc) {
		System.out.println("Entre com os dados do contato:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		
		Contato contato = new Contato(nome, telefone, email);
		
		return contato;
	}
}
