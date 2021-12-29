package br.com.logusinfo.consultas.model;

import java.util.ArrayList;
import java.util.List;

public class Cubo implements Exportavel{
/*ID_CUBO
TIT_CUBO
TAB_FATO
ESQUEMA
VALIDO
SCHEDULE_ID
DES_CUBO*/
	private String id;
	private String titulo;
	private String tabelaFato;
	private String esquema;
	private String valido;
	private String scheduleId;
	private String descricao;
	private List<Nivel> niveis = new ArrayList<Nivel>();
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
	public String getTabelaFato() {
		return tabelaFato;
	}
	public void setTabelaFato(String tabelaFato) {
		this.tabelaFato = tabelaFato;
	}
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}
	public String getValido() {
		return valido;
	}
	public void setValido(String valido) {
		this.valido = valido;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
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
	
	public String DML() {
		return "INSERT INTO flex_divida_pi.cubo (\r\n"
				+ "    id_cubo,\r\n"
				+ "    tit_cubo,\r\n"
				+ "    tab_fato,\r\n"
				+ "    esquema,\r\n"
				+ "    valido,\r\n"
				+ "    schedule_id,\r\n"
				+ "    des_cubo\r\n"
				+ ")  SELECT \r\n"
				+ "    (SELECT LPAD(MAX(ID_CUBO)+1,6,'0') FROM FLEX_DIVIDA_PI.CUBO),\r\n"
				+ "    'TESTE DML - "+this.titulo+"',\r\n"
				+ "    '"+this.tabelaFato+"',\r\n"
				+ "    '"+this.esquema+"',\r\n"
				+ "    '"+this.valido+"',\r\n"
				+ "    '"+this.scheduleId+"',\r\n"
				+ "    '"+this.descricao+"'\r\n"
				+ "		FROM DUAL\r\n"
				+ "    	WHERE NOT EXISTS ( "
				+ "		SELECT NULL FROM "
				+ "		FLEX_DIVIDA_PI.CUBO "
				+ "		WHERE TIT_CUBO = '"+this.titulo+"')";
	}

	
}

