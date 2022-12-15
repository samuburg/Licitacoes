package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Empresa;
import com.Licitacao;
import com.Participante;

import conexao.Conexao;

public class ParticipanteDAO {

	final String NOMEDATABELA = "participante";
    public boolean inserir(Participante participante) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (idLicitacao, idEmpresa, preco, conformidade) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, participante.getLicitacao().getIdLicitacao());
            ps.setInt(2, participante.getEmpresa().getId());
            ps.setFloat(3, participante.getPreco());
            ps.setBoolean(4, participante.isConformidade());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Participante participante) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET preco = ?,  conformidade = ? WHERE idLicitacao = ? and idEmpresa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, participante.getPreco());
            ps.setBoolean(2, participante.isConformidade());
            ps.setInt(3, participante.getLicitacao().getIdLicitacao());
            ps.setInt(4, participante.getEmpresa().getId());
            ps	.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Participante participante) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idLicitacao = ? and idEmpresa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, participante.getLicitacao().getIdLicitacao());
            ps.setInt(2, participante.getEmpresa().getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
   
    public Participante procurarPorCodigo(Participante participante) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idLicitacao = ? and idEmpresa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, participante.getLicitacao().getIdLicitacao());
            ps.setInt(2, participante.getEmpresa().getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Licitacao licitacao = new Licitacao();
            	licitacao.setIdLicitacao(rs.getInt(1));
            	Empresa empresa = new Empresa();
            	empresa.setId(rs.getInt(2));
                Participante obj = new Participante();
                obj.setLicitacao(licitacao);
                obj.setEmpresa(empresa);
                obj.setPreco(rs.getFloat(3));
                obj.setConformidade(rs.getBoolean(4));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
  
    public boolean existe(Participante participante) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idEmpresa = ? and idLicitacao = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, participante.getEmpresa().getId());
            ps.setInt(2, participante.getLicitacao().getIdLicitacao());
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public List<Participante> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Participante> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<Participante> pesquisarParticipantesConformes() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " where conformidade = true;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Participante> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<Participante> ordenarParticipantesPorPreco(int idLicitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " where idLicitacao = "+idLicitacao+" ORDER BY preco;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Participante> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Participante> montarLista(ResultSet rs) {
        List<Participante> listObj = new ArrayList<Participante>();
        try {
            while (rs.next()) {
            	Licitacao licitacao = new Licitacao();
            	licitacao.setIdLicitacao(rs.getInt(1));
            	Empresa empresa = new Empresa();
            	empresa.setId(rs.getInt(2));
                Participante obj = new Participante();
                obj.setLicitacao(licitacao);
                obj.setEmpresa(empresa);
                obj.setPreco(rs.getFloat(3));
                obj.setConformidade(rs.getBoolean(4));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
}