package br.com.logusinfo.consultas.model;

public class Node implements Exportavel {
	private String idConsulta;
	private String idEixo;
	private String seqNo;
	private String seqNoSup;
	private String idNivel;
	private String idFiltro;
	private String idMedida;
	private String idEstiloCab;
	private String idEstiloCel;
	private String codClassificador;
	private String titNo;
	private String numDecimais;
	private String separadorMilhar;
	private String unidMonetaria;
	private String expFiltro;
	private String funcAgregacao;
	private String prioAgregacao;
	private String prioFormatacao;
	private String dispFilhos;
	private String iniciarPagina;
	private String ocultar;
	private String tipoCorte;
	private String tamCorte;
	private String expCorte;
	private Nivel nivel;
	private Filtro filtro;
	private Medida medida;

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getIdEixo() {
		return idEixo;
	}

	public void setIdEixo(String idEixo) {
		this.idEixo = idEixo;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public String getSeqNoSup() {
		return seqNoSup;
	}

	public void setSeqNoSup(String seqNoSup) {
		this.seqNoSup = seqNoSup;
	}

	public String getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}

	public String getIdFiltro() {
		return idFiltro;
	}

	public void setIdFiltro(String idFiltro) {
		this.idFiltro = idFiltro;
	}

	public String getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(String idMedida) {
		this.idMedida = idMedida;
	}

	public String getIdEstiloCab() {
		return idEstiloCab;
	}

	public void setIdEstiloCab(String idEstiloCab) {
		this.idEstiloCab = idEstiloCab;
	}

	public String getIdEstiloCel() {
		return idEstiloCel;
	}

	public void setIdEstiloCel(String idEstiloCel) {
		this.idEstiloCel = idEstiloCel;
	}

	public String getCodClassificador() {
		return codClassificador;
	}

	public void setCodClassificador(String codClassificador) {
		this.codClassificador = codClassificador;
	}

	public String getTitNo() {
		return titNo;
	}

	public void setTitNo(String titNo) {
		this.titNo = titNo;
	}

	public String getNumDecimais() {
		return numDecimais;
	}

	public void setNumDecimais(String numDecimais) {
		this.numDecimais = numDecimais;
	}

	public String getSeparadorMilhar() {
		return separadorMilhar;
	}

	public void setSeparadorMilhar(String separadorMilhar) {
		this.separadorMilhar = separadorMilhar;
	}

	public String getUnidMonetaria() {
		return unidMonetaria;
	}

	public void setUnidMonetaria(String unidMonetaria) {
		this.unidMonetaria = unidMonetaria;
	}

	public String getExpFiltro() {
		return expFiltro;
	}

	public void setExpFiltro(String expFiltro) {
		this.expFiltro = expFiltro;
	}

	public String getFuncAgregacao() {
		return funcAgregacao;
	}

	public void setFuncAgregacao(String funcAgregacao) {
		this.funcAgregacao = funcAgregacao;
	}

	public String getPrioAgregacao() {
		return prioAgregacao;
	}

	public void setPrioAgregacao(String prioAgregacao) {
		this.prioAgregacao = prioAgregacao;
	}

	public String getPrioFormatacao() {
		return prioFormatacao;
	}

	public void setPrioFormatacao(String prioFormatacao) {
		this.prioFormatacao = prioFormatacao;
	}

	public String getDispFilhos() {
		return dispFilhos;
	}

	public void setDispFilhos(String dispFilhos) {
		this.dispFilhos = dispFilhos;
	}

	public String getIniciarPagina() {
		return iniciarPagina;
	}

	public void setIniciarPagina(String iniciarPagina) {
		this.iniciarPagina = iniciarPagina;
	}


	public String getOcultar() {
		return ocultar;
	}

	public void setOcultar(String ocultar) {
		this.ocultar = ocultar;
	}

	public String getTipoCorte() {
		return tipoCorte;
	}

	public void setTipoCorte(String tipoCorte) {
		this.tipoCorte = tipoCorte;
	}

	public String getTamCorte() {
		return tamCorte;
	}

	public void setTamCorte(String tamCorte) {
		this.tamCorte = tamCorte;
	}

	public String getExpCorte() {
		return expCorte;
	}

	public void setExpCorte(String expCorte) {
		this.expCorte = expCorte;
	}

	@Override
	public String DML() {
		return "Node";
	}
	
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;		
	}
	
	public Nivel getNivel() {
		return nivel;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	public Filtro getFiltro() {
		return filtro;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}

	public Medida getMedida() {
		return medida;
	}
	
}
