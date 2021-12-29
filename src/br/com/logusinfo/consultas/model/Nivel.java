package br.com.logusinfo.consultas.model;

import java.util.ArrayList;
import java.util.List;

public class Nivel implements Exportavel {
	private String idNivel;
	private String idCubo;
	private String idDimensao;
	private Dimensao dimensao;
	private String titulo;
	private String abreviacao;
	private String tabelaNivel;
	private String colunaNivel;
	private String colunaTitulo;
	private String colunasFato;
	private String mascara;
	private String esquema;
	private Cubo cubo = new Cubo();
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	public String getTabelaNivel() {
		return tabelaNivel;
	}
	public void setTabelaNivel(String tabelaNivel) {
		this.tabelaNivel = tabelaNivel;
	}
	public String getColunaNivel() {
		return colunaNivel;
	}
	public void setColunaNivel(String colunaNivel) {
		this.colunaNivel = colunaNivel;
	}
	public String getColunaTitulo() {
		return colunaTitulo;
	}
	public void setColunaTitulo(String colunaTitulo) {
		this.colunaTitulo = colunaTitulo;
	}
	public String getMascara() {
		return mascara;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}
	public String getColunasFato() {
		return colunasFato;
	}
	public void setColunasFato(String colunasFato) {
		this.colunasFato = colunasFato;
	}
	public Cubo getCubo() {
		return cubo;
	}
	public void setCubo(Cubo cubo) {
		this.cubo = cubo;
	}
	public String getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}
	public String getIdCubo() {
		return idCubo;
	}
	public void setIdCubo(String idCubo) {
		this.idCubo = idCubo;
	}
	public String getIdDimensao() {
		return idDimensao;
	}
	public void setIdDimensao(String idDimensao) {
		this.idDimensao = idDimensao;
	}
	public String DML() {
		// Criar script para Nivel_Cubo e Nivel.
		return "Nível: "+this.titulo;
	}

	
}

