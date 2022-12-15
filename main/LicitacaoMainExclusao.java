package main;

import com.Licitacao;
import com.Licitante;
import bo.LicitacaoBO;


public class LicitacaoMainExclusao {
	public static void main(String[] args) {

		// Teste Excluir
		LicitacaoBO BO = new LicitacaoBO();
		// passar somente o id do Licitante 
		Licitante licitante = new Licitante(5);
		// Necessário setar os dois Ids(licitacao e licitante) para o sistema encontrar a chave composta na associativa
		Licitacao licitacao = new Licitacao(22,licitante);
		if (BO.excluir(licitacao))
			System.out.println("Licitacao excluida com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}