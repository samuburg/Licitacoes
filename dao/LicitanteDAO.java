package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.Licitante;
import conexao.Conexao;

public class LicitanteDAO {
	  final String NOMEDATABELA = "licitante";
	    public boolean inserir(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (nome) VALUES (?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitante.getNome());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean alterar(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE idLicitante = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitante.getNome());
	            ps.setInt(2, licitante.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public boolean excluir(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idLicitante = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, licitante.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Licitante procurarPorCodigo(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idLicitante = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, licitante.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Licitante obj = new Licitante();
	                obj.setId(rs.getInt(1));
	                obj.setNome(rs.getString(2));
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
	    public Licitante procurarPorNome(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitante.getNome());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Licitante obj = new Licitante();
	                obj.setId(rs.getInt(1));
	                obj.setNome(rs.getString(2));
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
	    public boolean existe(Licitante licitante) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, licitante.getNome());
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
	    public List<Licitante> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Licitante> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Licitante> montarLista(ResultSet rs) {
	        List<Licitante> listObj = new ArrayList<Licitante>();
	        try {
	            while (rs.next()) {
	            	Licitante obj = new Licitante();
	                obj.setId(rs.getInt(1));
	                obj.setNome(rs.getString(2));
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