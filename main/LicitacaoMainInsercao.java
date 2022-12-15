package main;

import com.Licitacao;
import com.Licitante;

import bo.LicitacaoBO;

public class LicitacaoMainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		LicitacaoBO BO = new LicitacaoBO();
		
		// passar somente o id de um Licitante já cadastrado para Licitante
		Licitante licitante = new Licitante(4);
		
		Licitacao licitacao = new Licitacao("Fornecedor de alimentos para a prefeitura",licitante);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		
		licitacao = new Licitacao("Empresa para realizar a manutenção das estradas da cidade", licitante);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitacao = new Licitacao("Empresa para prestar serviço de limpeza das ruas da cidade", licitante);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}