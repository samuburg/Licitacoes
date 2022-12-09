package main;

import bo.BO;
import com.Empresa;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		BO BO = new BO();
		Empresa empresa = new Empresa(1);
		if (BO.excluir(empresa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}