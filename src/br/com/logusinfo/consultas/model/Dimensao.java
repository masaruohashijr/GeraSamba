package br.com.logusinfo.consultas.model;

public class Dimensao implements Exportavel {
	// ID_DIMENSAO, TIT_DIMENSAO, DES_DIMENSAO, FLG_VALIDO
	private String id;
	private String titulo;
	private String descricao;
	private String valida;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValida() {
		return valida;
	}
	public void setValida(String valida) {
		this.valida = valida;
	}
	public String DML() {
		return "Dimensão";
	}
	
}
