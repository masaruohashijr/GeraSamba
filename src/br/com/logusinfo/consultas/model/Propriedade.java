package br.com.logusinfo.consultas.model;

public class Propriedade implements Exportavel {
	private String id;
	private String idNivel;
	private Nivel nivel;
	private String nomeColuna;
	private String titPropriedade;
	private String chave;
	private String descricaoPadrao;
	private String tipoPropriedade;
	private String ehOculta;
	private String geoRef;
	private Consulta consulta;
	private String idConsulta;
	private String idEstilo;
	private String idEixo;
	private String seqNo;
	private String seqPropriedadeNo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public String getNomeColuna() {
		return nomeColuna;
	}
	public void setNomeColuna(String nomeColuna) {
		this.nomeColuna = nomeColuna;
	}
	public String getTitPropriedade() {
		return titPropriedade;
	}
	public void setTitPropriedade(String titPropriedade) {
		this.titPropriedade = titPropriedade;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getDescricaoPadrao() {
		return descricaoPadrao;
	}
	public void setDescricaoPadrao(String descricaoPadrao) {
		this.descricaoPadrao = descricaoPadrao;
	}
	public String getTipoPropriedade() {
		return tipoPropriedade;
	}
	public void setTipoPropriedade(String tipoPropriedade) {
		this.tipoPropriedade = tipoPropriedade;
	}
	public String getEhOculta() {
		return ehOculta;
	}
	public void setEhOculta(String ehOculta) {
		this.ehOculta = ehOculta;
	}
	public String getGeoRef() {
		return geoRef;
	}
	public void setGeoRef(String geoRef) {
		this.geoRef = geoRef;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
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
	public String getSeqPropriedadeNo() {
		return seqPropriedadeNo;
	}
	public void setSeqPropriedadeNo(String seqPropriedadeNo) {
		this.seqPropriedadeNo = seqPropriedadeNo;
	}
	public String getIdEstilo() {
		return idEstilo;
	}
	public void setIdEstilo(String idEstilo) {
		this.idEstilo = idEstilo;
	}
	@Override
	public String DML() {
		return "Propriedade";
	}	
}
