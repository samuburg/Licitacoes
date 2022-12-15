package main;

import java.util.ArrayList;
import java.util.List;

import com.Licitacao;
import bo.LicitacaoBO;

public class LicitacaoMainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todas 
		LicitacaoBO BO = new LicitacaoBO();
		List<Licitacao> lista = new ArrayList<Licitacao>();
		lista = BO.pesquisarTodos();	
		for (Licitacao licitacao : lista) {
			System.out.println(licitacao.toString());
		}
	
	}
}