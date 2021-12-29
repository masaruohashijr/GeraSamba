package br.com.logusinfo.consultas.services;

import java.util.List;

import br.com.logusinfo.consultas.model.Cubo;
import br.com.logusinfo.consultas.model.Visibilidade;
import br.com.logusinfo.consultas.repository.VisibilidadesRepository;

public class VisibilidadesService {
	public List<Visibilidade> getVisibilidades(Cubo cubo) {
		String idCubo = cubo.getId();
		VisibilidadesRepository repository = new VisibilidadesRepository();
		List<Visibilidade> visibilidades = repository.getVisibilidades(idCubo);
		return visibilidades;
	}
}
