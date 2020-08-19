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

import com.frotas.api.dto.AgendamentoDTO;
import com.frotas.web.domain.Agendamento;
import com.frotas.web.service.AgendamentoService;

import antlr.collections.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

	/*@Autowired
	private AgendamentoService service;
	
	@PostMapping
	public ResponseEntity salvar(@RequestBody AgendamentoDTO dto) {
		service.save(agendamento)(Agendamento)(dto);
	}*/
	
	public String teste() {
		@GetMapping
		return "Testando a aplicação";
		}
	
	/*@GetMapping()
	public ResponseEntity<List<AgendamentoDTO>> listaDeAgendamentos(){
		return ResponseEntity.ok(service.findAll());
	}*/
	
	/*@GetMapping("/{id}")
	public ResponseEntity buscarAgendamentoPorId(@PathVariable("id") Long id){
		Optional<AgendamentoDTO> agendamento = service.findById(id);
		if(!agendamento.isPresent()) {
			return ResponseEntity.badRequest().body("Informe um agendamento válido");
		} else {
			return ResponseEntity.ok(agendamento);
		}
	}*/
	
	
	
	}

