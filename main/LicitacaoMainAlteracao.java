package main;

import com.Licitacao;
import com.Licitante;
import bo.LicitacaoBO;

public class LicitacaoMainAlteracao {
	public static void main(String[] args) {
		
		// Teste Alterar	
		LicitacaoBO BO = new LicitacaoBO();
		Licitante licitante = new Licitante(1);
		Licitacao licitacao = new Licitacao(13,"Tratar as capivaras da cidade", licitante);
		BO.alterar(licitacao);
		licitacao = BO.procurarPorCodigo(licitacao);
		System.out.println(licitacao);
		
	}
}