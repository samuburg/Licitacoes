package main;

import bo.BO;
import com.Empresa;


public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		BO BO = new BO();
		Empresa empresa = new Empresa("Prefeitura de Imbuia");
		if (BO.existe(empresa))
			System.out.println("Instituição Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}