package br.com.logusinfo.consultas.services;

import java.util.List;

import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.model.Node;
import br.com.logusinfo.consultas.model.Propriedade;
import br.com.logusinfo.consultas.repository.NodesRepository;
import br.com.logusinfo.consultas.repository.PropriedadesRepository;

public class PropriedadesService {
	public List<Propriedade> getPropriedades(Consulta consulta) {
		String idConsulta = consulta.getIdConsulta();
		PropriedadesRepository repository = new PropriedadesRepository();
		List<Propriedade> propriedades = repository.getPropriedades(idConsulta);
		return propriedades;
	}
}
