package br.com.logusinfo.consultas.services;

import java.util.List;

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
		Cubo cubo = consulta.getCubo();
		List<Nivel> niveis = cubo.getNiveis();
		for (Nivel nivel : niveis) {
			Dimensao dimensao = nivel.getDimensao();
			if(null!=dimensao && !dimensao.getTitulo().isBlank()) {
				scriptDML.append("--DIMENSAO-----------------\n");
				scriptDML.append(dimensao.DML(esquemaDestino)+"\n");
				scriptDML.append("--------------------------\n");
			}
			scriptDML.append("--NIVEL--------------------\n");
			scriptDML.append(nivel.DML(esquemaDestino)+"\n");
			scriptDML.append("--------------------------\n");
		}
		scriptDML.append("--CUBO--------------------\n");
		scriptDML.append(cubo.DML(esquemaDestino)+"\n");
		scriptDML.append("--------------------------\n");
		scriptDML.append("--CONSULTA-----------------\n");
		scriptDML.append(consulta.DML(esquemaDestino)+"\n");
		scriptDML.append("--------------------------\n");
		List<Node> nodes = consulta.getNodes();
		for (Node node : nodes) {
			Nivel nivel = node.getNivel();
			if(null != nivel && !nivel.getTitulo().isBlank()) {
				Dimensao dimensao = nivel.getDimensao();
				if(null != dimensao && null!=dimensao.getTitulo() && !dimensao.getTitulo().isBlank()) {		
					scriptDML.append("--DIMENSAO-----------------\n");
					scriptDML.append(dimensao.DML(esquemaDestino)+"\n");
					scriptDML.append("--------------------------\n");
					scriptDML.append("--NIVEL--------------------\n");
					scriptDML.append(nivel.DML(esquemaDestino)+"\n");
					scriptDML.append("--------------------------\n");
					Filtro filtro = node.getFiltro();
					if(null != filtro && null!=filtro.getTituloFiltro() && !filtro.getTituloFiltro().isBlank()) {
						scriptDML.append("--FILTRO-------------------\n");
						scriptDML.append(filtro.DML(esquemaDestino)+"\n");
						scriptDML.append("--------------------------\n");
					}
					Medida medida = node.getMedida();
					if(null != medida && null!=medida.getTituloMedida() && !medida.getTituloMedida().isBlank()) {
						scriptDML.append("--MEDIDA-------------------\n");
						scriptDML.append(medida.DML(esquemaDestino)+"\n");
						scriptDML.append("--------------------------\n");
					}
				}
			}
			scriptDML.append("--NODE-------------------\n");
			scriptDML.append(node.DML(esquemaDestino)+"\n");
			scriptDML.append("--------------------------\n");
			
		}
		/*
		List<Propriedade> propriedades = consulta.getPropriedades();
		for (Propriedade propriedade : propriedades) {
			Nivel nivel = propriedade.getNivel();
			Dimensao dimensao = nivel.getDimensao();
			scriptDML.append(dimensao.DML()+"\n");
			scriptDML.append(nivel.DML()+"\n");
			scriptDML.append(propriedade.DML()+"\n");
		}
		
		scriptDML.append(consulta.DML()+"\n");
		consulta.getCubo().getVisibilidades().stream().forEach(
				visibilidade->{
					scriptDML.append(visibilidade.DML()+"\n");
				});
		consulta.getCompartilhamentos().stream().forEach(
				compartilhamento->{
					scriptDML.append(compartilhamento.DML()+"\n");
				});*/
		return scriptDML;
	}

}
