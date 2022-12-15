package main;

import com.Licitante;
import com.Licitacao;
import bo.LicitacaoBO;

public class LicitacaoMainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// necessario passar Id do licitante e a descricao da licitacao
		LicitacaoBO BO = new LicitacaoBO();
		//bastar passar o id do licitante
		Licitante licitante = new Licitante(1);
		Licitacao licitacao = new Licitacao("Fornecedor de alimentos para a prefeitura",licitante);
		if (BO.existe(licitacao))
			System.out.println("Licitacao Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}