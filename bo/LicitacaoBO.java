package bo;

import java.util.List;

import com.Licitacao;

import dao.LicitacaoDAO;

public class LicitacaoBO {
	  public boolean inserir(Licitacao licitacao){
	        if (existe(licitacao) != true) {
	            LicitacaoDAO DAO = new LicitacaoDAO();
	            return DAO.inserir(licitacao);
	        }
	        return false;
	    }
	    public boolean alterar(Licitacao licitacao){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.alterar(licitacao);
	    }
	    public boolean excluir(Licitacao licitacao){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.excluir(licitacao);
	    }
	    public Licitacao procurarPorCodigo(Licitacao licitacao){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.procurarPorCodigo(licitacao);
	    }
	    public Licitacao procurarPorDescricao(Licitacao licitacao){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.procurarPorNome(licitacao);
	    }
	    public boolean existe(Licitacao licitacao){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.existe(licitacao);
	    }
	    public List<Licitacao> pesquisarTodos(){
	    	LicitacaoDAO DAO = new LicitacaoDAO();
	        return DAO.pesquisarTodos();
	    }
	}