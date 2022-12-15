package main;

import com.Empresa;
import com.Licitacao;
import com.Participante;
import bo.ParticipanteBO;

public class ParticipanteMainInsercao {

	public static void main(String[] args) {
		// Teste Inserir
		ParticipanteBO BO = new ParticipanteBO();
		
		// passar somente o id de um Licitante já cadastrado para Licitante
		Licitacao licitacao = new Licitacao(13);
		Empresa empresa = new Empresa(1);
		
		Participante participante = new Participante(licitacao, empresa, 850, true);
		if (BO.inserir(participante))
			System.out.println("Participante inserido com Sucesso");
		else 
			System.out.println("Erro ao Inserir");
		
		empresa = new Empresa(2);
		participante = new Participante(licitacao, empresa, 850, true);
		if (BO.inserir(participante))
			System.out.println("Participante inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		empresa = new Empresa(3);
		participante = new Participante(licitacao, empresa, 780, false);
		if (BO.inserir(participante))
			System.out.println("Participante inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}