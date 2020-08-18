package com.frotas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fipe")
public class FipeController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/fipe/cadastro_categoria";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/fipe/lista_categoria";
	}
}
