package br.com.logusinfo.consultas.services;

import br.com.logusinfo.consultas.model.Dimensao;
import br.com.logusinfo.consultas.model.Nivel;
import br.com.logusinfo.consultas.repository.DimensoesRepository;

public class DimensoesService {

	DimensoesRepository repository = new DimensoesRepository();
	
	public Dimensao getDimensao(Nivel nivel) {
		String idDimensao = nivel.getIdDimensao();
		Dimensao dimensao = repository.getDimensao(idDimensao);
		return dimensao;
	}

}
