package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante("Prefeitura de Vidal Ramos");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("Governo de Santa Catarina");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("União");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}