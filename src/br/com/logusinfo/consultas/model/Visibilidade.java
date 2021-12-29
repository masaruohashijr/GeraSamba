package br.com.logusinfo.consultas.model;

public class Visibilidade implements Exportavel {
	private String id; 
	private String idCubo; 
	private Cubo cubo;
	private String codigoUsuario;
	private String codigoPerfil;
	private String expressaoFiltro;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cubo getCubo() {
		return cubo;
	}

	public void setCubo(Cubo cubo) {
		this.cubo = cubo;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(String codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}

	public String getExpressaoFiltro() {
		return expressaoFiltro;
	}

	public void setExpressaoFiltro(String expressaoFiltro) {
		this.expressaoFiltro = expressaoFiltro;
	}

	@Override
	public String DML() {
		return "Visibilidade";
	}

	public String getIdCubo() {
		return idCubo;
	}

	public void setIdCubo(String idCubo) {
		this.idCubo = idCubo;
	}
	

}
