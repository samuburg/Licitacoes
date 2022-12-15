package main;

import bo.BO;
import com.Empresa;

public class MainProcurarPorId {

	public static void main(String[] args) {
		
		// Teste Procurar por Codigo
		BO BO = new BO();
		Empresa empresa = new Empresa(2,"");
		empresa = BO.procurarPorCodigo(empresa);
		System.out.println(empresa);
		
	}
}