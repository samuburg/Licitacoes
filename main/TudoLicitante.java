package main;

import java.util.ArrayList;
import java.util.List;

import com.Licitante;

import bo.LicitanteBO;

public class TudoLicitante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante("Prefeitura de Vidal Ramos");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("Governo de Santa Catarina");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("União");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("Prefeitura de Vidal Ramos");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		licitante = new Licitante("Prefeitura de Rio do Sul");
		if (BO.inserir(licitante))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		
		//Alteracao
		System.out.println("");
		System.out.println("Alterar id 1 ");
		licitante = new Licitante(1,"Governo de SP");
		BO.alterar(licitante);
		licitante = BO.procurarPorCodigo(licitante);
		System.out.println(licitante);
		
		
		//Excluir
		System.out.println("");
		System.out.println("Excluir id 3 ");
		licitante = new Licitante(3);
		if (BO.excluir(licitante))
			System.out.println("Licitante excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		
		//Existe
		System.out.println("");
		System.out.println("Existe Governo de SP");
		licitante = new Licitante("Governo de SP");
		if (BO.existe(licitante))
			System.out.println("Licitante Encontrado");
		else
			System.out.println("Nao Encontrada");
		
		
		//Procurar por nome
		System.out.println("");
		System.out.println("Procurar por nome: Governo de Santa Catarina");		
		licitante = new Licitante("Governo de Santa Catarina");
		licitante = BO.procurarPorDescricao(licitante);
		System.out.println(licitante);
		
		//Procurar por id
		System.out.println("");
		System.out.println("Procurar por id: 2");	
		licitante = new Licitante(2,"");
		licitante = BO.procurarPorCodigo(licitante);
		System.out.println(licitante);
		
		System.out.println("");
		System.out.println("Procurar todos: ");
		List<Licitante> lista = new ArrayList<Licitante>();
		lista = BO.pesquisarTodos();	
		for (Licitante licita : lista) {
			System.out.println(licita.toString());
		}

		
		
		
		
		
		
		
	}

}
