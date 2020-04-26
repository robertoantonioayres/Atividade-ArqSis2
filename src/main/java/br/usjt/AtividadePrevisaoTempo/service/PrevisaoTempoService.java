package br.usjt.AtividadePrevisaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.AtividadePrevisaoTempo.model.PrevisaoTempo;
import br.usjt.AtividadePrevisaoTempo.repository.PrevisaoTempoRepository;

@Service
public class PrevisaoTempoService {
	@Autowired
	private PrevisaoTempoRepository previsaoRepo;
	
	public List <PrevisaoTempo> listar(){
		return previsaoRepo.findAll();
		
	}
}
