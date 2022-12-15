package com;

public class Licitante extends Instituicao {
	
	public Licitante() {

	}
	public Licitante(int id) {	
		setId(id);		
	}
	public Licitante(String nome) {
		setNome(nome);
	}
	public Licitante(int id, String nome) {
			setId(id);
			setNome(nome);	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Licitante [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}