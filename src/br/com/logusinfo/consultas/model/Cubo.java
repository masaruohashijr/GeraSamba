package br.com.logusinfo.consultas.model;

import java.util.ArrayList;
import java.util.List;

public class Cubo implements Exportavel{
	private String id = "";
	private String titulo = "";
	private String tabelaFato = "";
	private String esquema = "";
	private String valido = "";
	private String scheduleId = "";
	private String descricao = "";
	private List<Nivel> niveis = new ArrayList<Nivel>();
	private List<Visibilidade> visibilidades;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = (id==null)?"":id;
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo = (titulo==null)?"":titulo;
		this.titulo = titulo;
	}
	public String getTabelaFato() {
		return tabelaFato;
	}
	public void setTabelaFato(String tabelaFato) {
		tabelaFato = (tabelaFato==null)?"":tabelaFato;
		this.tabelaFato = tabelaFato;
	}
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema){
		esquema = (esquema==null)?"":esquema;
		this.esquema = esquema;
	}
	public String getValido() {
		return valido;
	}
	public void setValido(String valido) {
		valido = (valido==null)?"":valido;
		this.valido = valido;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		scheduleId = (scheduleId==null)?"":scheduleId;
		this.scheduleId = scheduleId;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		descricao = (descricao==null)?"":descricao;
		this.descricao = descricao;
	}
	public Cubo() {
	}
	public List<Nivel> getNiveis() {
		return niveis;
	}
	public void setNiveis(List<Nivel> niveis) {
		this.niveis = niveis;
	}
	
	public String DML(String esquemaDestino) {
		String dml = "INSERT INTO "+esquemaDestino+".cubo (\r\n"
				+ "    id_cubo,\r\n"
				+ "    tit_cubo,\r\n"
				+ "    tab_fato,\r\n"
				+ "    esquema,\r\n"
				+ "    valido,\r\n"
				+ "    schedule_id,\r\n"
				+ "    des_cubo\r\n"
				+ ")  SELECT \r\n"
				+ "    (SELECT LPAD(MAX(ID_CUBO)+1,6,'0') FROM "+esquemaDestino+".CUBO),\r\n"
				+ "    '"+this.titulo+"',\r\n"
				+ "    '"+this.tabelaFato+"',\r\n"
				+ "    '"+this.esquema+"',\r\n"
				+ "    '"+this.valido+"',\r\n"
				+ "    '"+this.scheduleId+"',\r\n"
				+ "    '"+this.descricao+"'\r\n"
				+ "		FROM DUAL\r\n"
				+ "    	WHERE NOT EXISTS ( "
				+ "		SELECT NULL FROM "
				+ "		"+esquemaDestino+".CUBO "
				+ "		WHERE TIT_CUBO = '"+this.titulo+"')\r\n";
		
		for (Nivel nivel : niveis) {
			dml += "\n-NIVEL CUBO----------------------\n";
			dml += "\r\n";
			dml += "INSERT INTO "+esquemaDestino+".nivel_cubo (\r\n"
					+ "    id_cubo,\r\n"
					+ "    id_nivel,\r\n"
					+ "    col_fato\r\n"
					+ ") SELECT \r\n"
					+ "    (SELECT ID_CUBO FROM \r\n"
					+ "		"+esquemaDestino+".CUBO \r\n"
					+ "		WHERE TIT_CUBO = '"+this.titulo+"'), \r\n"
					+ "    (SELECT ID_NIVEL FROM \r\n"
					+ "		"+esquemaDestino+".NIVEL \r\n"
					+ "		WHERE TIT_NIVEL = '"+nivel.getTitulo()+"'), \r\n"
					+ "    '"+nivel.getTitulo()+"' \r\n"
					+ " FROM DUAL \r\n"
					+ "    	WHERE NOT EXISTS ( \r\n"
					+ "		SELECT NULL FROM \r\n"
					+ "		"+esquemaDestino+".NIVEL_CUBO \r\n"
					+ "		WHERE ID_CUBO = (SELECT ID_CUBO FROM \r\n"
					+ "		"+esquemaDestino+".CUBO \r\n"
					+ "		WHERE TIT_CUBO = '"+this.titulo+"') \r\n"
					+ "     AND ID_NIVEL = (SELECT ID_NIVEL FROM \r\n"
					+ "		"+esquemaDestino+".NIVEL \r\n"
					+ "		WHERE TIT_NIVEL = '"+nivel.getTitulo()+"')); \r\n";
			dml += "-------------------------------\n";
		}
		return dml;
	}
	public void setVisibilidades(List<Visibilidade> visibilidades) {
		this.visibilidades = visibilidades;
	}
	public List<Visibilidade> getVisibilidades() {
		return visibilidades;
	}

	
}

