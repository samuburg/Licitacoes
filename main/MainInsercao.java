package main;

import com.Empresa;
import bo.BO;


public class MainInsercao {

	public static void main(String[] args) {
		// Teste Inserir
		BO BO = new BO();
		Empresa empresa = new Empresa("Zanella maquinas");
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
	}
}