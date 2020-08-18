package com.frotas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/combustivel")
public class CombustivelController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/combustivel/cadastro_categoria";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/combustivel/lista_categoria";
	}
}
