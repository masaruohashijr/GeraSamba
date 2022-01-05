package br.com.logusinfo.consultas.services;

import br.com.logusinfo.consultas.model.Medida;
import br.com.logusinfo.consultas.model.Node;
import br.com.logusinfo.consultas.repository.MedidasRepository;

public class MedidasService {
	private String esquemaOrigem;

	public MedidasService(String esquemaOrigem) {
		this.esquemaOrigem = esquemaOrigem;
		// TODO Auto-generated constructor stub
	}

	public Medida getMedida(Node node) {
		String idMedida = node.getIdMedida();
		if(idMedida.isBlank()) {
			return new Medida();
		}
		MedidasRepository repository = new MedidasRepository(esquemaOrigem);
		Medida medida = repository.getMedida(idMedida);
		return medida;
	}
}
