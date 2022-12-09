package main;

import java.util.ArrayList;
import java.util.List;
import bo.BO;
import com.Empresa;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		BO BO = new BO();
		List<Empresa> lista = new ArrayList<Empresa>();
		lista = BO.pesquisarTodos();	
		for (Empresa empresa : lista) {
			System.out.println(empresa.toString());
		}
	
	}
}