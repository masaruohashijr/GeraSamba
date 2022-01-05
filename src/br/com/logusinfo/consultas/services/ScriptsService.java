package br.com.logusinfo.consultas.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.model.Cubo;
import br.com.logusinfo.consultas.model.Dimensao;
import br.com.logusinfo.consultas.model.Filtro;
import br.com.logusinfo.consultas.model.Medida;
import br.com.logusinfo.consultas.model.Nivel;
import br.com.logusinfo.consultas.model.Node;
import br.com.logusinfo.consultas.model.Propriedade;

public class ScriptsService {

	private String esquemaDestino;

	public ScriptsService(String esquemaDestino) {
		this.esquemaDestino = esquemaDestino;
	}

	public StringBuilder generate(StringBuilder scriptDML, Consulta consulta) {
		Set<String> jahEscritos = new HashSet<String>();
		Cubo cubo = consulta.getCubo();
		List<Nivel> niveis = cubo.getNiveis();
		String chave = "";
		for (Nivel nivel : niveis) {
			Dimensao dimensao = nivel.getDimensao();
			if(null!=dimensao && !dimensao.getTitulo().isBlank()) {
				scriptDML.append("--DIMENSAO-----------------\n");
				chave = dimensao.getClass().getTypeName()+dimensao.getId();
				if(!jahEscritos.contains(chave)) {
					scriptDML.append(dimensao.DML(esquemaDestino)+"\n");
					jahEscritos.add(chave);
				}
				scriptDML.append("--------------------------\n");
			}
			scriptDML.append("--NIVEL--------------------\n");
			chave = nivel.getClass().getTypeName()+nivel.getIdNivel();
			if(!jahEscritos.contains(chave)) {
				scriptDML.append(nivel.DML(esquemaDestino)+"\n");
				jahEscritos.add(chave);
			}
			scriptDML.append("--------------------------\n");
		}
		scriptDML.append("--CUBO--------------------\n");
		chave = cubo.getClass().getTypeName()+cubo.getId();
		if(!jahEscritos.contains(chave)) {
			scriptDML.append(cubo.DML(esquemaDestino)+"\n");
			jahEscritos.add(chave);
		}
		scriptDML.append("--------------------------\n");
		scriptDML.append("--CONSULTA-----------------\n");
		chave = consulta.getClass().getTypeName()+consulta.getIdConsulta();
		if(!jahEscritos.contains(chave)) {
			scriptDML.append(consulta.DML(esquemaDestino)+"\n");
			jahEscritos.add(chave);
		}
		scriptDML.append("--------------------------\n");
		List<Node> nodes = consulta.getNodes();
		for (Node node : nodes) {
			Nivel nivel = node.getNivel();
			if(null != nivel && !nivel.getTitulo().isBlank()) {
				Dimensao dimensao = nivel.getDimensao();
				if(null != dimensao && null!=dimensao.getTitulo() && !dimensao.getTitulo().isBlank()) {		
					scriptDML.append("--DIMENSAO-----------------\n");
					chave = dimensao.getClass().getTypeName()+dimensao.getId();
					if(!jahEscritos.contains(chave)) {
						scriptDML.append(dimensao.DML(esquemaDestino)+"\n");
						jahEscritos.add(chave);
					}
					scriptDML.append("--------------------------\n");
					scriptDML.append("--NIVEL--------------------\n");
					chave = nivel.getClass().getTypeName()+nivel.getIdNivel();
					if(!jahEscritos.contains(chave)) {
						scriptDML.append(nivel.DML(esquemaDestino)+"\n");
						jahEscritos.add(chave);
					}
					scriptDML.append("--------------------------\n");
				}
			}
			Filtro filtro = node.getFiltro();
			if(null != filtro && null!=filtro.getTituloFiltro() && !filtro.getTituloFiltro().isBlank()) {
				scriptDML.append("--FILTRO-------------------\n");
				chave = filtro.getClass().getTypeName()+filtro.getId();
				if(!jahEscritos.contains(chave)) {
					scriptDML.append(filtro.DML(esquemaDestino)+"\n");
					jahEscritos.add(chave);
				}
				scriptDML.append("--------------------------\n");
			}
			Medida medida = node.getMedida();
			if(null != medida && null!=medida.getTituloMedida() && !medida.getTituloMedida().isBlank()) {
				scriptDML.append("--MEDIDA-------------------\n");
				chave = medida.getClass().getTypeName()+medida.getId();
				if(!jahEscritos.contains(chave)) {
					scriptDML.append(medida.DML(esquemaDestino)+"\n");
					jahEscritos.add(chave);
				}
				scriptDML.append("--------------------------\n");
			}
			scriptDML.append("--NODE-------------------\n");
			
			chave = node.getClass().getTypeName()+node.getIdConsulta()+node.getIdEixo()+node.getSeqNo();
			if(!jahEscritos.contains(chave)) {
				scriptDML.append(node.DML(esquemaDestino)+"\n");
				jahEscritos.add(chave);
			}
			scriptDML.append("--------------------------\n");
			
		}
		List<Propriedade> propriedades = consulta.getPropriedades();
		for (Propriedade propriedade : propriedades) {
			Nivel nivel = propriedade.getNivel();
			Dimensao dimensao = nivel.getDimensao();
			chave = dimensao.getClass().getTypeName()+dimensao.getId();
			if(!jahEscritos.contains(chave)) {
				scriptDML.append(dimensao.DML(esquemaDestino)+"\n");
				jahEscritos.add(chave);
			}
			chave = nivel.getClass().getTypeName()+nivel.getIdNivel();
			if(!jahEscritos.contains(chave)) {
				scriptDML.append(nivel.DML(esquemaDestino)+"\n");
				jahEscritos.add(chave);
			}
			chave = propriedade.getClass().getTypeName()+propriedade.getId();
			if(!jahEscritos.contains(chave)) {
				scriptDML.append(propriedade.DML(esquemaDestino)+"\n");
				jahEscritos.add(chave);
			}
		}
		
		consulta.getCubo().getVisibilidades().stream().forEach(
				visibilidade->{
					scriptDML.append(visibilidade.DML(esquemaDestino)+"\n");
				});
		consulta.getCompartilhamentos().stream().forEach(
				compartilhamento->{
					scriptDML.append(compartilhamento.DML(esquemaDestino)+"\n");
				});
		return scriptDML;
	}

}
