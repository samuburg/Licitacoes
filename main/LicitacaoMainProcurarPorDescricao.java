package main;

import com.Licitacao;
import bo.LicitacaoBO;

public class LicitacaoMainProcurarPorDescricao {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		LicitacaoBO BO = new LicitacaoBO();
		Licitacao licitacao = new Licitacao("Tratar as capivaras da cidade");
		licitacao = BO.procurarPorDescricao(licitacao);
		System.out.println(licitacao);

	}
}