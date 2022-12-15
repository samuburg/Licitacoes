package main;

import com.Empresa;
import com.Licitacao;
import com.Participante;

import bo.ParticipanteBO;

public class ParticipanteMainAlteracao {

	public static void main(String[] args) {
		
		Licitacao licitacao = new Licitacao(13);
		Empresa empresa = new Empresa(2);
		
		ParticipanteBO BO = new ParticipanteBO();
		Participante participante = new Participante(licitacao, empresa, 900, true);
		BO.alterar(participante);
		participante = BO.procurarPorCodigo(participante);
		System.out.println(participante);
		
	}
}