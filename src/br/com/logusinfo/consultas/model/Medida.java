package br.com.logusinfo.consultas.model;

public class Medida implements Exportavel{
	private String id;
	private String idCubo;
	private Cubo cubo;
	private String colMedida;
	private String tituloMedida;
	private String expressaoFiltro;
	private String ehPadrao;
	private String descricaoMedida;

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
	public Cubo getCubo() {
		return cubo;
	}
	public void setCubo(Cubo cubo) {
		this.cubo = cubo;
	}
	public String getColMedida() {
		return colMedida;
	}
	public void setColMedida(String colMedida) {
		this.colMedida = colMedida;
	}
	public String getTituloMedida() {
		return tituloMedida;
	}
	public void setTituloMedida(String tituloMedida) {
		this.tituloMedida = tituloMedida;
	}
	public String getExpressaoFiltro() {
		return expressaoFiltro;
	}
	public void setExpressaoFiltro(String expressaoFiltro) {
		this.expressaoFiltro = expressaoFiltro;
	}
	public String getEhPadrao() {
		return ehPadrao;
	}
	public void setEhPadrao(String ehPadrao) {
		this.ehPadrao = ehPadrao;
	}
	public String getDescricaoMedida() {
		return descricaoMedida;
	}
	public void setDescricaoMedida(String descricaoMedida) {
		this.descricaoMedida = descricaoMedida;
	}
	
	@Override
	public String DML() {
		return "Medida";
	}
	
}
