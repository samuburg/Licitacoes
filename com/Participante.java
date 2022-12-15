package com;

import java.util.ArrayList;
import java.util.List;

import bo.BO;
import bo.LicitacaoBO;

public class Participante {
	protected Empresa empresa;
	protected Licitacao licitacao;
	private float preco;
	private boolean conformidade;
	
	
	public Participante(){
		
	}
	public Participante(Licitacao licitacao, Empresa empresa){
		setLicitacao(licitacao);
		setEmpresa(empresa);
		
	}
	
	public Participante(Licitacao licitacao, Empresa empresa,float preco, boolean conformidade) {
		setEmpresa(empresa);
		setPreco(preco);
		setConformidade(conformidade);
		setLicitacao(licitacao);
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
			//Deixa setar somente uma empresa já cadastrada previamente
			BO BO = new BO();
			List<Empresa> lista = new ArrayList<Empresa>();
			List<Integer> idList = new ArrayList<Integer>();
			lista = BO.pesquisarTodos();	
			for (Empresa emp : lista) {
				idList.add(emp.getId());
			}
				
			if (empresa.getId()<=idList.get(idList.size()-1)) {
				this.empresa = empresa;
			}
		
		
		
		
	}
	public Licitacao getLicitacao() {
		return licitacao;
	}
	public void setLicitacao(Licitacao licitacao) {
		
		//Só deixa setar uma licitação já cadastrada
		LicitacaoBO BO = new LicitacaoBO();
		List<Licitacao> lista = new ArrayList<Licitacao>();
		List<Integer> idList = new ArrayList<Integer>();
		lista = BO.pesquisarTodos();	
		for (Licitacao lici : lista) {
			idList.add(lici.getIdLicitacao());
		}
		
		if (licitacao.getIdLicitacao()<=idList.get(idList.size()-1)) {
			this.licitacao = licitacao;
		}
		
		
		
		
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if (preco>0) {
			this.preco = preco;
		}
		
	}
	public boolean isConformidade() {
		return conformidade;
	}
	public void setConformidade(boolean conformidade) {
		this.conformidade = conformidade;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Participante [idLicitacao =");
		builder.append(licitacao.getIdLicitacao());
		builder.append(", idEmpresa=");
		builder.append(empresa.getId());
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", conformidade=");
		builder.append(conformidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
