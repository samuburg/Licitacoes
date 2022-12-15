package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante("Governo de SP");
		if (BO.existe(licitante))
			System.out.println("Licitante Encontrado");
		else
			System.out.println("Nao Encontrada");

	}
}