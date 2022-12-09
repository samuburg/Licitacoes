package com;

public class Licitacao {
	
	private int id;
	private String descricao;
	private int LicitanteId;
	
	public Licitacao(){
		
	}
	public Licitacao(String descricao, int licitanteId) {
		setDescricao(descricao);
		setLicitanteId(licitanteId);	
	}
	
	public Licitacao(int id, String descricao, int licitanteId) {
		setId(id);
		setDescricao(descricao);
		setLicitanteId(licitanteId);	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getLicitanteId() {
		return LicitanteId;
	}
	public void setLicitanteId(int licitanteId) {
		LicitanteId = licitanteId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Licitacao [id=");
		builder.append(id);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", LicitanteId=");
		builder.append(LicitanteId);
		builder.append("]");
		return builder.toString();
	}
	
	

}
