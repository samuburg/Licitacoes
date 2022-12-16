package main;

import java.util.ArrayList;
import java.util.List;

import com.Empresa;

import bo.BO;

public class TudoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MainInsercao
		BO BO = new BO();
		Empresa empresa = new Empresa("ical");
		if (BO.inserir(empresa))
			System.out.println("Inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		empresa = new Empresa("Maquinas omil");
		if (BO.inserir(empresa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		empresa = new Empresa("Passig alimentos");
		if (BO.inserir(empresa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		empresa = new Empresa("Tabajara veiculos");
		if (BO.inserir(empresa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		empresa = new Empresa("Clube de regatas flamengo");
		if (BO.inserir(empresa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		//MainAlteracao
		System.out.println("");
		System.out.println("Alterar id 1");
		empresa = new Empresa(1,"HAVAN RIO DO SUL");
		BO.alterar(empresa);
		empresa = BO.procurarPorCodigo(empresa);
		System.out.println(empresa);
		
		
		//MainExclusao
		System.out.println("");
		System.out.println("Excluir empresa com id 3");
		empresa = new Empresa(3);
		if (BO.excluir(empresa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		//mainExiste
		
		System.out.println("");
		System.out.println("Pesquisa se existe MAQUINAS OMIL");
		empresa = new Empresa("Maquinas omil");
		if (BO.existe(empresa))
			System.out.println("Empresa Encontrada");
		else
			System.out.println("Nao Encontrada");
		
		//pesquisar todos
		System.out.println("");
		System.out.println("Pesquisar todos");
		List<Empresa> lista = new ArrayList<Empresa>();
		lista = BO.pesquisarTodos();	
		for (Empresa empre : lista) {
			System.out.println(empre.toString());
		}
		
		//Pesquisar ID
		System.out.println("");
		System.out.println("Pesquisar Por id 2");
		empresa = new Empresa(2,"");
		empresa = BO.procurarPorCodigo(empresa);
		System.out.println(empresa);
		
		//Pesquisar por nome
		System.out.println("");
		System.out.println("Pesquisar Por nome HAVAN RIO DO SUL");
		empresa = new Empresa("HAVAN RIO DO SUL");
		empresa = BO.procurarPorDescricao(empresa);
		System.out.println(empresa);

	}

}
