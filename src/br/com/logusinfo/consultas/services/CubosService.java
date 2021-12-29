package br.com.logusinfo.consultas.services;

import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.model.Cubo;
import br.com.logusinfo.consultas.repository.ConsultasRepository;
import br.com.logusinfo.consultas.repository.CubosRepository;

public class CubosService {
	public Cubo getCubo(Consulta consulta) {
		String idConsulta = consulta.getIdConsulta();
		CubosRepository repository = new CubosRepository();
		Cubo cubo = repository.getCubo(idConsulta);
		return cubo;
	}
}
