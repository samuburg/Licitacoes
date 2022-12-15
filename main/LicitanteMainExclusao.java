package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante(3);
		if (BO.excluir(licitante))
			System.out.println("Licitante excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}