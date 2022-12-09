package main;

import com.Licitacao;

import bo.LicitacaoBO;

public class LicitacaoMainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		LicitacaoBO BO = new LicitacaoBO();
		Licitacao licitacao = new Licitacao("Fornecedor de alimentos para a prefeitura",1);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		licitacao = new Licitacao("Empresa para realizar a manutenção das estradas da cidade",2);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitacao = new Licitacao("Empresa para prestar serviço de limpeza das ruas da cidade",5);
		if (BO.inserir(licitacao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}