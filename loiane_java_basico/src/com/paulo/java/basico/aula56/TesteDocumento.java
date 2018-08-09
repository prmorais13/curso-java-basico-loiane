package com.paulo.java.basico.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		
		System.out.println("----------------DADOS DO FOREACH---------------------");
		
		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}
		
		System.out.println("----------------DADOS SOLUÇÃO 1---------------------");
		
		Pessoa pf = new Pessoa(TipoDocumento.CPF, TipoDocumento.CPF.geraNumeroTeste());
		Pessoa pj = new Pessoa(TipoDocumento.CNPJ, TipoDocumento.CNPJ.geraNumeroTeste());
		
		System.out.println(pf);
		System.out.println(pj);
		
		System.out.println("----------------DADOS SOLUÇÃO 2---------------------");
		
		Pessoa pf2 = new Pessoa();
		pf2.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf2.setNumeroDocumento(pf2.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf2);
		
		Pessoa pj2 = new Pessoa();
		pj2.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj2.setNumeroDocumento(pj2.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj2);
		
		System.out.println("----------------DADOS SOLUÇÃO 3---------------------");
		
		Pessoa pf3 = new Pessoa();
		pf3.setTipoDocumento(TipoDocumento.CPF);
		pf2.setNumeroDocumento(TipoDocumento.CPF.geraNumeroTeste());
		System.out.println(pf2);
		
		Pessoa pj3 = new Pessoa();
		pj3.setTipoDocumento(TipoDocumento.CNPJ);
		pj3.setNumeroDocumento(TipoDocumento.CNPJ.geraNumeroTeste());
		System.out.println(pj3);
	}
}
