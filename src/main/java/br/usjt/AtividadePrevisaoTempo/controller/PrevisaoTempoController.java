package br.usjt.AtividadePrevisaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.AtividadePrevisaoTempo.model.PrevisaoTempo;
import br.usjt.AtividadePrevisaoTempo.repository.PrevisaoTempoRepository;

@Controller
public class PrevisaoTempoController {
	@Autowired
	PrevisaoTempoRepository previsao;
	PrevisaoTempo pre;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisao() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		mv.addObject(new PrevisaoTempo());
		List<PrevisaoTempo> previsaoTempo = previsao.findAll();
		mv.addObject("previsaoTempo",previsaoTempo);
		return mv;
		
	}
}
