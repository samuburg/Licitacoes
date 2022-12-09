package bo;

import com.Empresa;
import dao.DAO;
import java.util.List;

public class BO {

    public boolean inserir(Empresa empresa){
        if (existe(empresa) != true) {
            DAO DAO = new DAO();
            return DAO.inserir(empresa);
        }
        return false;
    }
    public boolean alterar(Empresa empresa){
        DAO DAO = new DAO();
        return DAO.alterar(empresa);
    }
    public boolean excluir(Empresa empresa){
        DAO DAO = new DAO();
        return DAO.excluir(empresa);
    }
    public Empresa procurarPorCodigo(Empresa empresa){
        DAO DAO = new DAO();
        return DAO.procurarPorCodigo(empresa);
    }
    public Empresa procurarPorDescricao(Empresa empresa){
        DAO DAO = new DAO();
        return DAO.procurarPorNome(empresa);
    }
    public boolean existe(Empresa empresa){
        DAO DAO = new DAO();
        return DAO.existe(empresa);
    }
    public List<Empresa> pesquisarTodos(){
        DAO DAO = new DAO();
        return DAO.pesquisarTodos();
    }
}