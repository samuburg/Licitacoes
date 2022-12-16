package com;

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
			if (BO.procurarPorCodigo(empresa)!=null) {
				this.empresa = empresa;
			}	
		
		
		
		
	}
	public Licitacao getLicitacao() {
		return licitacao;
	}
	public void setLicitacao(Licitacao licitacao) {
		
		//Só deixa setar uma licitação já cadastrada
		LicitacaoBO bo = new LicitacaoBO();
		if (bo.procurarPorCodigo(licitacao)!=null) {
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
