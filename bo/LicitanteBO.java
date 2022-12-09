package bo;

import java.util.List;

import com.Licitante;

import dao.LicitanteDAO;

public class LicitanteBO {
	  public boolean inserir(Licitante licitante){
	        if (existe(licitante) != true) {
	            LicitanteDAO DAO = new LicitanteDAO();
	            return DAO.inserir(licitante);
	        }
	        return false;
	    }
	    public boolean alterar(Licitante licitante){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.alterar(licitante);
	    }
	    public boolean excluir(Licitante licitante){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.excluir(licitante);
	    }
	    public Licitante procurarPorCodigo(Licitante licitante){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.procurarPorCodigo(licitante);
	    }
	    public Licitante procurarPorDescricao(Licitante licitante){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.procurarPorNome(licitante);
	    }
	    public boolean existe(Licitante licitante){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.existe(licitante);
	    }
	    public List<Licitante> pesquisarTodos(){
	    	LicitanteDAO DAO = new LicitanteDAO();
	        return DAO.pesquisarTodos();
	    }
	}