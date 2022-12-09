package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Licitacao;

import conexao.Conexao;

public class LicitacaoDAO {
	   final String NOMEDATABELA = "licitacao";
	    public boolean inserir(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (nome) VALUES (?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitacao.getDescricao() );
	            ps.setInt(2, licitacao.getLicitanteId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean alterar(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE id = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitacao.getDescricao());
	            ps.setInt(2, licitacao.getId());
	            ps.setInt(3, licitacao.getLicitanteId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public boolean excluir(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE id = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, licitacao.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Licitacao procurarPorCodigo(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, licitacao.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Licitacao obj = new Licitacao();
	                obj.setId(rs.getInt(1));
	                obj.setDescricao(rs.getString(2));
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
	    public Licitacao procurarPorNome(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitacao.getDescricao());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Licitacao obj = new Licitacao();
	                obj.setId(rs.getInt(1));
	                obj.setDescricao(rs.getString(2));
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
	            return null;
	        }
	    }
	    public boolean existe(Licitacao licitacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitacao.getDescricao());
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
	    public List<Licitacao> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Licitacao> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Licitacao> montarLista(ResultSet rs) {
	        List<Licitacao> listObj = new ArrayList<Licitacao>();
	        try {
	            while (rs.next()) {
	            	Licitacao obj = new Licitacao();
	                obj.setId(rs.getInt(1));
	                obj.setDescricao(rs.getString(2));
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