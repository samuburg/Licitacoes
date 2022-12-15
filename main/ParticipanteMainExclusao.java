package main;

import com.Empresa;
import com.Licitacao;
import com.Participante;

import bo.ParticipanteBO;

public class ParticipanteMainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		ParticipanteBO BO = new ParticipanteBO();
		// passar somente o id do Licitante 
		Licitacao licitacao = new Licitacao(13);
		Empresa empresa = new Empresa(3);
		Participante participante = new Participante(licitacao, empresa);
		

		if (BO.excluir(participante))
			System.out.println("Participante excluído com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}