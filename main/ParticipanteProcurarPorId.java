package main;

import com.Licitacao;
import com.Empresa;
import com.Participante;

import bo.ParticipanteBO;

public class ParticipanteProcurarPorId {

	public static void main(String[] args) {
		
		// Teste Procurar por Co	digo
		ParticipanteBO BO = new ParticipanteBO();
		
		Empresa empresa = new Empresa(2);
		Licitacao licitacao = new Licitacao(13);
		Participante participante = new Participante(licitacao, empresa);
		participante = BO.procurarPorCodigo(participante);
		System.out.println(participante);
		
	}
}