package main;

import bo.BO;
import com.Empresa;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		BO BO = new BO();
		Empresa empresa = new Empresa(1,"Nova instituicao");
		BO.alterar(empresa);
		empresa = BO.procurarPorCodigo(empresa);
		System.out.println(empresa);
		
	}
}