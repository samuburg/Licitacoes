package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainAlteracao {

	public static void main(String[] args) {
		
		// Teste Alterar	
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante(1,"Governo de SP");
		BO.alterar(licitante);
		licitante = BO.procurarPorCodigo(licitante);
		System.out.println(licitante);
		
	}
}