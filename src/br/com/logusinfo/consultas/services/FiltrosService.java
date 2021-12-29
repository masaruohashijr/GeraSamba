package br.com.logusinfo.consultas.services;

import java.util.List;

import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.model.Filtro;
import br.com.logusinfo.consultas.model.Node;
import br.com.logusinfo.consultas.repository.FiltrosRepository;
import br.com.logusinfo.consultas.repository.NodesRepository;

public class FiltrosService {
	public Filtro getFiltro(String idFiltro) {
		FiltrosRepository repository = new FiltrosRepository();
		Filtro filtro = repository.getFiltro(idFiltro);
		return filtro;
	}
}
