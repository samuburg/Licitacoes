package com;

import java.util.List;

import dao.ParticipanteDAO;

public class Selecao {
	
	public List<Participante> ordenarParticipantesPorPreço(int idLicitacao){
        ParticipanteDAO DAO = new ParticipanteDAO();
        return DAO.ordenarParticipantesPorPreco(idLicitacao);
    }
	
	public List<Participante> listarParticipantesConformes(int idLicitacao){
        ParticipanteDAO DAO = new ParticipanteDAO();
        return DAO.pesquisarParticipantesConformes(idLicitacao);
    }

}
