package bo;

import java.util.List;

import com.Participante;

import dao.ParticipanteDAO;

public class ParticipanteBO {

	   public boolean inserir(Participante participante){
	        if (existe(participante) != true) {
	        	ParticipanteDAO DAO = new ParticipanteDAO();
	            return DAO.inserir(participante);
	        }
	        return false;
	    }
	  
	    public boolean alterar(Participante participante){
	    	ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.alterar(participante);
	    }
	    
	    public boolean excluir(Participante participante){
	    	ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.excluir(participante);
	    }
	    
	    public Participante procurarPorCodigo(Participante participante){
	    	ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.procurarPorCodigo(participante);
	    }
	    /*
	    public Empresa procurarPorDescricao(Participante participante){
	    	ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.procurarPorNome(participante);
	    }
	    */
	    public boolean existe(Participante participante){
	    	ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.existe(participante);
	    }
	    
	    public List<Participante> pesquisarTodos(){
	        ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.pesquisarTodos();
	    }
	    public List<Participante> pesquisarParticipantesConformes(){
	        ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.pesquisarParticipantesConformes();
	    }
	    public List<Participante> ordenarParticipantesPorPreco(int idLicitacao){
	        ParticipanteDAO DAO = new ParticipanteDAO();
	        return DAO.ordenarParticipantesPorPreco(idLicitacao);
	    }
	    
	    
	}