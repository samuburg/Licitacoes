package com;

public class Instituicao {
	
	private int id;
	private String nome;

	
	
	public Instituicao() {

	}
	public Instituicao(int id) {
		setId(id);
	}
	public Instituicao(String nome) {
		setNome(nome);
	}
	public Instituicao(int id, String nome) {
		setId(id);
		setNome(nome);
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Instituicao [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
