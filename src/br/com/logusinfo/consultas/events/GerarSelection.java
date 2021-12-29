package br.com.logusinfo.consultas.events;

import java.util.List;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

import br.com.logusinfo.consultas.model.Compartilhamento;
import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.model.Cubo;
import br.com.logusinfo.consultas.model.Dimensao;
import br.com.logusinfo.consultas.model.Filtro;
import br.com.logusinfo.consultas.model.Medida;
import br.com.logusinfo.consultas.model.Nivel;
import br.com.logusinfo.consultas.model.Node;
import br.com.logusinfo.consultas.model.Propriedade;
import br.com.logusinfo.consultas.model.Visibilidade;
import br.com.logusinfo.consultas.services.CompartilhamentosService;
import br.com.logusinfo.consultas.services.ConsultasService;
import br.com.logusinfo.consultas.services.CubosService;
import br.com.logusinfo.consultas.services.DimensoesService;
import br.com.logusinfo.consultas.services.FiltrosService;
import br.com.logusinfo.consultas.services.MedidasService;
import br.com.logusinfo.consultas.services.NiveisService;
import br.com.logusinfo.consultas.services.NodesService;
import br.com.logusinfo.consultas.services.PropriedadesService;
import br.com.logusinfo.consultas.services.VisibilidadesService;

public class GerarSelection implements SelectionListener {

	private Text textArea;
	private Combo c;
	private String idConsulta;

	public GerarSelection(Combo c, Text textArea) {
		this.c = c;
		this.textArea = textArea;
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent arg0) {
		System.out.println("selected");
	}

	@Override
	public void widgetSelected(SelectionEvent evt) {
		// Script.
		StringBuilder scriptDML = new StringBuilder("--SAMBA\n");
		// Inicializo serviços.
		ConsultasService consultasService = new ConsultasService();
		CompartilhamentosService compartilhamentosService = new CompartilhamentosService();
		CubosService cubosService = new CubosService();
		VisibilidadesService visibilidadesService = new VisibilidadesService();
		MedidasService medidasService = new MedidasService();
		NodesService nodesService = new NodesService();
		FiltrosService filtrosService = new FiltrosService();
		PropriedadesService propriedadesService = new PropriedadesService();
		// Recupero o ID da Consulta.
		idConsulta = getIdConsulta(this.c.getText());
		// Recupero o Objeto Consulta.
		Consulta consulta = consultasService.getConsulta(idConsulta);
		List<Compartilhamento> compartilhamentos = compartilhamentosService.getCompartilhamentos(consulta);
		for (Compartilhamento compartilhamento : compartilhamentos) {
			scriptDML.append(compartilhamento.DML()+"\n");
		}
		Cubo cubo = cubosService.getCubo(consulta);
		scriptDML.append(cubo.DML()+"\n");

		List<Visibilidade> visibilidades = visibilidadesService.getVisibilidades(cubo);
		for (Visibilidade visibilidade : visibilidades) {
			scriptDML.append(visibilidade.DML()+"\n");
		}
		// Recupero o Objeto Consulta.		
		NiveisService niveisService = new NiveisService();
		List<Nivel> niveis = niveisService.getNiveis(cubo.getId());
		DimensoesService dimensoesService = new DimensoesService();
		for (Nivel nivel : niveis) {			
			Dimensao dimensao = dimensoesService.getDimensao(nivel);
			scriptDML.append(dimensao.DML()+"\n");
			nivel.setDimensao(dimensao);
			scriptDML.append(nivel.DML()+"\n");
		}
		List<Node> nodes = nodesService.getNodes(consulta);
		for (Node node : nodes) {
			Nivel nivel = niveisService.getNivel(node.getIdNivel());
			node.setNivel(nivel);
			Filtro filtro = filtrosService.getFiltro(node.getIdFiltro());
			node.setFiltro(filtro);
			Medida medida = medidasService.getMedida(node.getIdMedida());
			node.setMedida(medida);
			scriptDML.append(node.DML()+"\n");
		}
		List<Propriedade> propriedades = propriedadesService.getPropriedades(consulta);
		for (Propriedade propriedade : propriedades) {
			scriptDML.append(propriedade.DML()+"\n");
		}		
		print(scriptDML.toString());
	}

	private void print(String text) {
		textArea.append(text+"\n");
	}

	private String getIdConsulta(String text) {
		return text.split("-")[0].trim();
	}

}
