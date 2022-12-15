package main;

import com.Licitante;
import com.Licitacao;

import bo.LicitacaoBO;

public class LicitacaoMainProcurarPorId {
	public static void main(String[] args) {
		
		// Teste Procurar por Co	digo
		LicitacaoBO BO = new LicitacaoBO();
		// Licitante passar somente o id
		Licitante licitante = new Licitante(1);
		//Necessário passar os dois ids pois é uma chave composta no banco
		Licitacao licitacao = new Licitacao(19,licitante);
		licitacao = BO.procurarPorCodigo(licitacao);
		System.out.println(licitacao);
		
	}
}