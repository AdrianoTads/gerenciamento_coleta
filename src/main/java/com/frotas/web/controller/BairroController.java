package com.frotas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.frotas.web.domain.Bairro;
import com.frotas.web.service.BairroService;

@Controller
@RequestMapping("/bairro")
public class BairroController {

	@Autowired
	private BairroService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Bairro bairro) {
		return "bairro/cadastro_bairro";
	}

	@PostMapping("/salvar")
	public String salvar(Bairro bairro, RedirectAttributes attr) {
		service.saveBairro(bairro);
		attr.addFlashAttribute("success", "Bairro adicionado com sucesso!");
		return "redirect:/bairro/cadastrar";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
	model.addAttribute("bairros", service.getBairros());
	return "bairro/lista_bairro";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
	model.addAttribute("bairro", service.getBairroPorId(id));
	return "/bairro/cadastro_bairro";
	}
	
	@PostMapping("/editar")
	public String editar(Bairro bairro, RedirectAttributes attr) {
		service.updateBairro(id, bairro);
		attr.addFlashAttribute("success", "Bairro alterado com sucesso");
		return "redirect:/bairro/cadastrar";
	}
	
	/*@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		service.delete(id);
		model.addAttribute("success", "Bairro removido com sucesso");
		return listar(model);
	}*/
}
