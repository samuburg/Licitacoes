package main;

import java.util.ArrayList;
import java.util.List;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainPesquisarTodos {
	public static void main(String[] args) {
		
		// Teste Pesquisar Todos
		LicitanteBO BO = new LicitanteBO();
		List<Licitante> lista = new ArrayList<Licitante>();
		lista = BO.pesquisarTodos();	
		for (Licitante licitante : lista) {
			System.out.println(licitante.toString());
		}
	
	}
}