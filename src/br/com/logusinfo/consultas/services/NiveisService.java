package br.com.logusinfo.consultas.services;

import java.util.List;

import br.com.logusinfo.consultas.model.Nivel;
import br.com.logusinfo.consultas.repository.NiveisRepository;

public class NiveisService {
	public List<Nivel> getNiveis(String idCubo) {
		NiveisRepository repository = new NiveisRepository();
		List<Nivel> niveis = repository.getNiveisCubo(idCubo);
		return niveis;
	}

	public Nivel getNivel(String idNivel) {
		NiveisRepository repository = new NiveisRepository();
		Nivel nivel = repository.getNivel(idNivel);
		return nivel;
	}
}
