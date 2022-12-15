package main;

import com.Licitacao;
import com.Empresa;
import com.Participante;

import bo.ParticipanteBO;

public class ParticipanteMainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// necessario passar Id da licitacao e o id da empresa
		ParticipanteBO BO = new ParticipanteBO();
	
		Licitacao licitacao = new Licitacao(13);
		Empresa empresa = new Empresa(2);
		Participante participante = new Participante(licitacao, empresa);
		if (BO.existe(participante))
			System.out.println("Licitacao Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}