package com.frotas.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frotas.api.dto.BairroDTO;
import com.frotas.web.domain.Bairro;
import com.frotas.web.service.BairroService;

import antlr.collections.List;

@RestController
@RequestMapping("/api/bairros")
public class BairroController {

	/*@Autowired
	private BairroService service;
	
	@PostMapping
	public ResponseEntity salvar(@RequestBody BairroDTO dto) {
		service.save(bairro)(Bairro)(dto);
	}*/
	
	public String teste() {
		@GetMapping
		return "Testando a aplicação";
		}
	
	/*@GetMapping()
	public ResponseEntity<List<BairroDTO>> listaDeBairros(){
		return ResponseEntity.ok(service.findAll());
	}*/
	
	/*@GetMapping("/{id}")
	public ResponseEntity buscarBairroPorId(@PathVariable("id") Long id){
		Optional<BairroDTO> bairro = service.findById(id);
		if(!bairro.isPresent()) {
			return ResponseEntity.badRequest().body("Informe um bairro válido");
		} else {
			return ResponseEntity.ok(bairro);
		}
	}*/
	
	
	
	}

