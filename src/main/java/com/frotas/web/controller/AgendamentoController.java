package com.frotas.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.frotas.web.domain.Agendamento;
import com.frotas.web.service.AgendamentoService;

@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

	@Autowired
	private AgendamentoService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Agendamento agendamento) {
		return "agendamento/cadastro_agendamento";
	}

	@PostMapping("/salvar")
	public String salvar(Agendamento agendamento, RedirectAttributes attr) {
		service.saveAgendamento(agendamento);
		attr.addFlashAttribute("success", "Agendamento adicionado com sucesso!");
		return "redirect:/agendamento/cadastrar";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
	model.addAttribute("agendamentos", service.getAgendamentos());
	return "agendamento/lista_agendamento";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
	model.addAttribute("agendamento", service.getAgendamentoPorId(id));
	return "/agendamento/cadastro_agendamento";
	}
	
	@PostMapping("/editar")
	public String editar(Agendamento agendamento, RedirectAttributes attr) {
		service.updateAgendamento(id, agendamento);
		attr.addFlashAttribute("success", "Agendamento alterado com sucesso");
		return "redirect:/agendamento/cadastrar";
	}
	
	/*@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		service.delete(id);
		model.addAttribute("success", "Agendamento removido com sucesso");
		return listar(model);
	}*/
}

