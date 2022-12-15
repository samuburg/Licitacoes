package main;

import com.Empresa;

import bo.BO;

public class MainProcurarPorNome {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		BO BO = new BO();
		Empresa empresa = new Empresa("HAVAN RIO DO SUL");
		empresa = BO.procurarPorDescricao(empresa);
		System.out.println(empresa);

	}
}