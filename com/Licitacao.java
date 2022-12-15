package com;

import java.util.ArrayList;
import java.util.List;
import bo.LicitanteBO;


public class Licitacao {
	
	private int idLicitacao;
	private String descricao;
	protected Licitante licitante;
	
	public Licitacao(){	
	}
	
	public Licitacao(int idLicitacao){	
		setIdLicitacao(idLicitacao);
	}
	
	public Licitacao(String descricao){	
		setDescricao(descricao);
	}
	
	
	public Licitacao(int idLicitacao, Licitante licitante) {
		setIdLicitacao(idLicitacao);
		setLicitante(licitante);
	}
	
	public Licitacao(String descricao, Licitante licitante) {
		setDescricao(descricao);
		setLicitante(licitante);
	}
	
	public Licitacao(int idLicitacao, String descricao, Licitante licitante) {
		setIdLicitacao(idLicitacao);
		setDescricao(descricao);
		setLicitante(licitante);
	}
	
	public Licitante getLicitante() {
		return licitante;
	}
	public void setLicitante(Licitante licitante) {
		// Só Pode colocar um Licitante já cadastrado previamente
				LicitanteBO BO = new LicitanteBO();
				List<Licitante> lista = new ArrayList<Licitante>();
				List<Integer> idList = new ArrayList<Integer>();
				lista = BO.pesquisarTodos();	
				for (Licitante lici : lista) {
					idList.add(lici.getId());
				}
				
				if (licitante.getId()<=idList.get(idList.size()-1)) {
					setLicitante(licitante);
				}	
		
		
		
	}
	
	
	public int getIdLicitacao() {
		return idLicitacao;
	}
	public void setIdLicitacao(int id) {
		if(id>0) {
			this.idLicitacao = id;
		}
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao.length()>0) {
			this.descricao = descricao;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Licitacao [idLicitacao=");
		builder.append(idLicitacao);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("; idLicitante=");
		builder.append(licitante.getId());
		builder.append("]");
		return builder.toString();
	}
	
	

}
