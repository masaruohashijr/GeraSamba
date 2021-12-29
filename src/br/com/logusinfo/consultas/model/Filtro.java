package br.com.logusinfo.consultas.model;

import java.util.ArrayList;
import java.util.List;

public class Filtro implements Exportavel {
	private String id;
	private String idCubo;
	private String idConsulta;
	private String tituloFiltro;
	private String expressaoFiltro;
	private String descricaoFiltro;
	private String colunaNivel;
	private String colunaTitulo;
	private String colunasFato;
	private String mascara;
	private String esquema;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdCubo() {
		return idCubo;
	}

	public void setIdCubo(String idCubo) {
		this.idCubo = idCubo;
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getTituloFiltro() {
		return tituloFiltro;
	}

	public void setTituloFiltro(String tituloFiltro) {
		this.tituloFiltro = tituloFiltro;
	}

	public String getExpressaoFiltro() {
		return expressaoFiltro;
	}

	public void setExpressaoFiltro(String expressaoFiltro) {
		this.expressaoFiltro = expressaoFiltro;
	}

	public String getDescricaoFiltro() {
		return descricaoFiltro;
	}

	public void setDescricaoFiltro(String descricaoFiltro) {
		this.descricaoFiltro = descricaoFiltro;
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

	public String getColunasFato() {
		return colunasFato;
	}

	public void setColunasFato(String colunasFato) {
		this.colunasFato = colunasFato;
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

	public String DML() {
		return "";
	}	
}

