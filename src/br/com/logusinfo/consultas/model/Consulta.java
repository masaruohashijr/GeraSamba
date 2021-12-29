package br.com.logusinfo.consultas.model;

public class Consulta implements Exportavel{

	private String idConsulta;
	private String idCubo;
	private Cubo cubo;
	private String tituloConsulta;
	private String desConsulta;
	private String tipVisualizacao;
	private String expFiltro;
	private String codUsuario;
	private String tipoFiltroDados;
	private String idCategory;

	private String indicadorQuebraHierarquiaLinhas;
	private String indicadorQuebraHierarquiaColunas;
	private String tipoCorteLinhas;
	private String tamanhoCorteLinhas;
	private String expressaoCorteLinhas;
	private String tipoCorteColunas;
	private String tamanhoCorteColunas;
	private String expressaoCorteColunas;
	private String tipoOrientacao;

	private String tamanhoLarguraGrafico;
	private String tamanhoAlturaGrafico;
	private String tipoGrafico;
	private String tipoGrafico3D;
	private String merclarCelEixoY;
	private String usarTitCustomEixoY;
	private String tituloCustomEixoY;
	private String vazioLugarZero;
	private String repetirHeaderPag;
	private String codHeader;
	private String codFooter;
	private String inSqlANSI;
	private String indicadorForcaOnline;
	private String congelarCelularEixoY;
	private String indicadorPermiteOnline;
	private String indicadorSQLANSI;
	public String getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}
	public String getIdCubo() {
		return idCubo;
	}
	public void setIdCubo(String idCubo) {
		this.idCubo = idCubo;
	}
	public String getDesConsulta() {
		return desConsulta;
	}
	public void setDesConsulta(String desConsulta) {
		this.desConsulta = desConsulta;
	}
	public String getTipVisualizacao() {
		return tipVisualizacao;
	}
	public void setTipVisualizacao(String tipVisualizacao) {
		this.tipVisualizacao = tipVisualizacao;
	}
	public String getExpFiltro() {
		return expFiltro;
	}
	public void setExpFiltro(String expFiltro) {
		this.expFiltro = expFiltro;
	}
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getTipoFiltroDados() {
		return tipoFiltroDados;
	}
	public void setTipoFiltroDados(String tipoFiltroDados) {
		this.tipoFiltroDados = tipoFiltroDados;
	}
	public String getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}
	public String getIndicadorQuebraHierarquiaLinhas() {
		return indicadorQuebraHierarquiaLinhas;
	}
	public void setIndicadorQuebraHierarquiaLinhas(String indicadorQuebraHierarquiaLinhas) {
		this.indicadorQuebraHierarquiaLinhas = indicadorQuebraHierarquiaLinhas;
	}
	public String getIndicadorQuebraHierarquiaColunas() {
		return indicadorQuebraHierarquiaColunas;
	}
	public void setIndicadorQuebraHierarquiaColunas(String indicadorQuebraHierarquiaColunas) {
		this.indicadorQuebraHierarquiaColunas = indicadorQuebraHierarquiaColunas;
	}
	public String getTipoCorteLinhas() {
		return tipoCorteLinhas;
	}
	public void setTipoCorteLinhas(String tipoCorteLinhas) {
		this.tipoCorteLinhas = tipoCorteLinhas;
	}
	public String getTamanhoCorteLinhas() {
		return tamanhoCorteLinhas;
	}
	public void setTamanhoCorteLinhas(String tamanhoCorteLinhas) {
		this.tamanhoCorteLinhas = tamanhoCorteLinhas;
	}
	public String getExpressaoCorteLinhas() {
		return expressaoCorteLinhas;
	}
	public void setExpressaoCorteLinhas(String expressaoCorteLinhas) {
		this.expressaoCorteLinhas = expressaoCorteLinhas;
	}
	public String getTipoCorteColunas() {
		return tipoCorteColunas;
	}
	public void setTipoCorteColunas(String tipoCorteColunas) {
		this.tipoCorteColunas = tipoCorteColunas;
	}
	public String getTamanhoCorteColunas() {
		return tamanhoCorteColunas;
	}
	public void setTamanhoCorteColunas(String tamanhoCorteColunas) {
		this.tamanhoCorteColunas = tamanhoCorteColunas;
	}
	public String getExpressaoCorteColunas() {
		return expressaoCorteColunas;
	}
	public void setExpressaoCorteColunas(String expressaoCorteColunas) {
		this.expressaoCorteColunas = expressaoCorteColunas;
	}
	public String getTipoOrientacao() {
		return tipoOrientacao;
	}
	public void setTipoOrientacao(String tipoOrientacao) {
		this.tipoOrientacao = tipoOrientacao;
	}
	public String getTamanhoLarguraGrafico() {
		return tamanhoLarguraGrafico;
	}
	public void setTamanhoLarguraGrafico(String tamanhoLarguraGrafico) {
		this.tamanhoLarguraGrafico = tamanhoLarguraGrafico;
	}
	public String getTamanhoAlturaGrafico() {
		return tamanhoAlturaGrafico;
	}
	public void setTamanhoAlturaGrafico(String tamanhoAlturaGrafico) {
		this.tamanhoAlturaGrafico = tamanhoAlturaGrafico;
	}
	public String getTipoGrafico() {
		return tipoGrafico;
	}
	public void setTipoGrafico(String tipoGrafico) {
		this.tipoGrafico = tipoGrafico;
	}
	public String getTipoGrafico3D() {
		return tipoGrafico3D;
	}
	public void setTipoGrafico3D(String tipoGrafico3D) {
		this.tipoGrafico3D = tipoGrafico3D;
	}
	public String getMerclarCelEixoY() {
		return merclarCelEixoY;
	}
	public void setMerclarCelEixoY(String merclarCelEixoY) {
		this.merclarCelEixoY = merclarCelEixoY;
	}
	public String getUsarTitCustomEixoY() {
		return usarTitCustomEixoY;
	}
	public void setUsarTitCustomEixoY(String usarTitCustomEixoY) {
		this.usarTitCustomEixoY = usarTitCustomEixoY;
	}
	public String getTituloCustomEixoY() {
		return tituloCustomEixoY;
	}
	public void setTituloCustomEixoY(String tituloCustomEixoY) {
		this.tituloCustomEixoY = tituloCustomEixoY;
	}
	public String getVazioLugarZero() {
		return vazioLugarZero;
	}
	public void setVazioLugarZero(String vazioLugarZero) {
		this.vazioLugarZero = vazioLugarZero;
	}
	public String getRepetirHeaderPag() {
		return repetirHeaderPag;
	}
	public void setRepetirHeaderPag(String repetirHeaderPag) {
		this.repetirHeaderPag = repetirHeaderPag;
	}
	public String getCodHeader() {
		return codHeader;
	}
	public void setCodHeader(String codHeader) {
		this.codHeader = codHeader;
	}
	public String getCodFooter() {
		return codFooter;
	}
	public void setCodFooter(String codFooter) {
		this.codFooter = codFooter;
	}
	public String getInSqlANSI() {
		return inSqlANSI;
	}
	public void setInSqlANSI(String inSqlANSI) {
		this.inSqlANSI = inSqlANSI;
	}
	public String getIndicadorForcaOnline() {
		return indicadorForcaOnline;
	}
	public void setIndicadorForcaOnline(String indicadorForcaOnline) {
		this.indicadorForcaOnline = indicadorForcaOnline;
	}
	public String getCongelarCelularEixoY() {
		return congelarCelularEixoY;
	}
	public void setCongelarCelularEixoY(String congelarCelularEixoY) {
		this.congelarCelularEixoY = congelarCelularEixoY;
	}
	public String getIndicadorPermiteOnline() {
		return indicadorPermiteOnline;
	}
	public void setIndicadorPermiteOnline(String indicadorPermiteOnline) {
		this.indicadorPermiteOnline = indicadorPermiteOnline;
	}
	public Consulta() {
		super();
	}
	public String getTituloConsulta() {
		return tituloConsulta;
	}
	public void setTituloConsulta(String tituloConsulta) {
		this.tituloConsulta = tituloConsulta;
	}
	public void setIndicadorSQLANSI(String IndicadorSQLANSI) {
		this.indicadorSQLANSI = IndicadorSQLANSI;		
	}
	public String getIndicadorSQLANSI() {
		return indicadorSQLANSI;
	}
	public Cubo getCubo() {
		return cubo;
	}
	public void setCubo(Cubo cubo) {
		this.cubo = cubo;
	}
	@Override
	public String DML() {
		// TODO Auto-generated method stub
		return null;
	}	

}
