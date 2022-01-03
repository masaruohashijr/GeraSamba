package br.com.logusinfo.consultas.model;

public class Compartilhamento implements Exportavel {
	// ID_COMPARTILHAMENTO, ID_CUBO, ID_CONSULTA, COD_USUARIO, COD_PERFIL, ID_DASHBOARD
	private String id;
	private String idCubo;
	private String idConsulta;
	private String idDashboard;
	private String codigoUsuario;
	private String codigoPerfil;
	private Consulta consulta;
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
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	@Override
	public String DML(String esquemaDestino) {		
		return "INSERT INTO "+esquemaDestino+".compartilhamento (\r\n"
				+ "    id_compartilhamento,\r\n"
				+ "    id_consulta,\r\n"
				+ "    cod_usuario,\r\n"
				+ "    cod_perfil,\r\n"
				+ "    id_dashboard\r\n"
				+ ") SELECT \r\n"
				+ " (SELECT 'Q'||\r\n"
				+ " (SELECT ID_CONSULTA FROM "+esquemaDestino+".FV_CONSULTA WHERE TIT_CONSULTA='Dívida - Espelho da Operação')||'_'||\r\n"
				+ " CASE WHEN SEQUENCIAL IS NULL THEN 0 ELSE SEQUENCIAL END AS SEQUENCIAL FROM \r\n"
				+ " (SELECT  SUBSTR(MAX(ID_COMPARTILHAMENTO),INSTR(MAX(ID_COMPARTILHAMENTO),'_',3)+1)+1 AS SEQUENCIAL FROM "+esquemaDestino+".COMPARTILHAMENTO\r\n"
				+ " WHERE id_consulta = '009091') FROM DUAL),"
				+ "    (SELECT ID_CONSULTA FROM \r\n"
				+ "		"+esquemaDestino+".FV_CONSULTA \r\n"
				+ "		WHERE TIT_CONSULTA = '"+this.consulta.getTituloConsulta()+"'), \r\n"
				+ "    '"+this.codigoUsuario+"', \r\n"
				+ "    '"+this.codigoPerfil+"', \r\n"
				+ "    '"+this.idDashboard+"'\r\n"
				+ ")";
	}
}
