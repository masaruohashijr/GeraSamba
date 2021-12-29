package br.com.logusinfo.consultas.services;

import java.util.List;

import br.com.logusinfo.consultas.model.Compartilhamento;
import br.com.logusinfo.consultas.model.Consulta;
import br.com.logusinfo.consultas.repository.CompartilhamentosRepository;

public class CompartilhamentosService {
	public List<Compartilhamento> getCompartilhamentos(Consulta consulta) {
		String idConsulta = consulta.getIdConsulta();
		CompartilhamentosRepository repository = new CompartilhamentosRepository();
		List<Compartilhamento> compartilhamentos = repository.getCompartilhamentos(idConsulta);
		return compartilhamentos;
	}
}
