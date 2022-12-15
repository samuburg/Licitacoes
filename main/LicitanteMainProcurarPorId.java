package main;

import com.Licitante;

import bo.LicitanteBO;

public class LicitanteMainProcurarPorId {
	public static void main(String[] args) {
		
		// Teste Procurar por Codigo
		LicitanteBO BO = new LicitanteBO();
		Licitante licitante = new Licitante(2,"");
		licitante = BO.procurarPorCodigo(licitante);
		System.out.println(licitante);
		
	}
}