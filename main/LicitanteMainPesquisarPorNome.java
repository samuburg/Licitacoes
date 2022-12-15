package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainPesquisarPorNome {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante("Governo de Santa Catarina");
		licitante = BO.procurarPorDescricao(licitante);
		System.out.println(licitante);

	}
}