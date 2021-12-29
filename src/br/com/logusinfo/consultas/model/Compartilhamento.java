package br.com.logusinfo.consultas.model;

public class Compartilhamento implements Exportavel {
	// ID_COMPARTILHAMENTO, ID_CUBO, ID_CONSULTA, COD_USUARIO, COD_PERFIL, ID_DASHBOARD
	private String id;
	private String idCubo;
	private String idConsulta;
	private String idDashboard;
	private String codigoUsuario;
	private String codigoPerfil;
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
	public String getIdDashboard() {
		return idDashboard;
	}
	public void setIdDashboard(String idDashboard) {
		this.idDashboard = idDashboard;
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
	@Override
	public String DML() {		
		return "Compartilhamento";
	}
	

}
