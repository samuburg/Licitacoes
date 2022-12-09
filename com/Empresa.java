package com;

public class Empresa extends Instituicao {
	public Empresa() {

	}
	public Empresa(int id) {
		setId(id);
	}
	public Empresa(String nome) {
		setNome(nome);
	}
	public Empresa(int id, String nome) {
		setId(id);
		setNome(nome);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empresa ");
		builder.append("; ID ");
		builder.append(super.getId());
		builder.append("; nome ");
		builder.append(super.getNome());
		return builder.toString();
	}
}
