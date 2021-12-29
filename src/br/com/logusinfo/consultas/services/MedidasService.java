package br.com.logusinfo.consultas.services;

import br.com.logusinfo.consultas.model.Medida;
import br.com.logusinfo.consultas.repository.MedidasRepository;

public class MedidasService {
	public Medida getMedida(String idMedida) {
		MedidasRepository repository = new MedidasRepository();
		Medida medida = repository.getMedida(idMedida);
		return medida;
	}
}
