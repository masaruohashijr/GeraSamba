package br.com.logusinfo.consultas.model;

public class Medida implements Exportavel{
	private String id = "";
	private String idCubo = "";
	private Cubo cubo;
	private String colMedida = "";
	private String tituloMedida = "";
	private String expressaoFiltro = "";
	private String ehPadrao = "";
	private String descricaoMedida = "";

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
	public String DML(String esquemaDestino) {
		return "INSERT INTO "+esquemaDestino+".medida (\r\n"
				+ "    id_medida,\r\n"
				+ "    id_cubo,\r\n"
				+ "    col_medida,\r\n"
				+ "    tit_medida,\r\n"
				+ "    exp_filtro,\r\n"
				+ "    e_padrao,\r\n"
				+ "    des_medida\r\n"
				+ ") SELECT \r\n"
				+ "    (SELECT LPAD(MAX(ID_MEDIDA)+1,6,'0') FROM "+esquemaDestino+".MEDIDA),\r\n"
				+ "    (SELECT ID_CUBO FROM \r\n"
				+ "		"+esquemaDestino+".CUBO \r\n"
				+ "		WHERE TIT_CUBO = '"+this.cubo.getTitulo()+"'), \r\n"
				+ "    '"+this.colMedida+"',\r\n"
				+ "    '"+this.tituloMedida+"',\r\n"
				+ "    '"+this.expressaoFiltro+"',\r\n"
				+ "    '"+this.ehPadrao+"',\r\n"
				+ "    '"+this.descricaoMedida+"'\r\n"
				+ " FROM DUAL \r\n" 
				+ " WHERE NOT EXISTS \r\n" 
				+ " (SELECT NULL FROM "+esquemaDestino+".medida WHERE tit_medida = '"+this.tituloMedida+"');\r\n"; 
	}
	
}
