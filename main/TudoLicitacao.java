package main;

import java.util.ArrayList;
import java.util.List;

import com.Licitacao;
import com.Licitante;

import bo.LicitacaoBO;

public class TudoLicitacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		//Existe
		System.out.println("");
		System.out.println("Existe: Fornecedor de alimentos para a prefeitura, licitante id 4");
		licitante = new Licitante(4);
		licitacao = new Licitacao("Fornecedor de alimentos para a prefeitura",licitante);
		if (BO.existe(licitacao))
			System.out.println("Licitacao Encontrada");
		else
			System.out.println("Nao Encontrada");
		
		
		//Alteracao
		System.out.println("");
		System.out.println("Alterar: licitacao com id 3 para -> Tratar as capivaras da cidade licitante");
		licitante = new Licitante(4);
		licitacao = new Licitacao(3,"Tratar as capivaras da cidade", licitante);
		BO.alterar(licitacao);
		licitacao = BO.procurarPorCodigo(licitacao);
		System.out.println(licitacao);
		
		//Excluir 
		System.out.println("");
		System.out.println("Excluir: licitacao com id 1");
		licitacao = new Licitacao(1);
		if (BO.excluir(licitacao))
			System.out.println("Licitacao excluida com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		//Procurar por descricao
		System.out.println("");
		System.out.println("Procurar por descricao: Tratar as capivaras da cidade");
		licitacao = new Licitacao("Tratar as capivaras da cidade");
		licitacao = BO.procurarPorDescricao(licitacao);	
		System.out.println(licitacao);
		
		//Procurar por id
		System.out.println("");
		System.out.println("Procurar por id: 2");
		licitacao = new Licitacao(2);
		licitacao = BO.procurarPorCodigo(licitacao);
		System.out.println(licitacao);
		
		//buscar todos
		System.out.println("");
		System.out.println("Procurar todos");
		List<Licitacao> lista = new ArrayList<Licitacao>();
		lista = BO.pesquisarTodos();	
		for (Licitacao lici : lista) {
			System.out.println(lici.toString());
		}
	
		
		
		
		
		

	}

}
