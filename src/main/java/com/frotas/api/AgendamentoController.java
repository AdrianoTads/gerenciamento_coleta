package com.frotas.api;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.frotas.web.domain.Agendamento;
import com.frotas.api.dto.AgendamentoDTO;
import com.frotas.api.dto.BairroDTO;
import com.frotas.web.service.AgendamentoService;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {
	
	public String teste() {
		//@GetMapping
		return "Testando a aplicação";
		}
	
	@Autowired
	private AgendamentoService service;
	
	
	@GetMapping()
	public ResponseEntity<List<AgendamentoDTO>> listaDeAgendamentos(){
		return ResponseEntity.ok(service.findAll());
	}
		
	@GetMapping()
	public ResponseEntity<AgendamentoService> List(){
		return ResponseEntity.ok(service);
	}
	@GetMapping("/{id}")
	public ResponseEntity<AgendamentoDTO> getAgendamento(@PathVariable("id") Long id){
		Optional<AgendamentoDTO> agendamento = service.findById(id);
		if(agendamento.isPresent()) {
			return ResponseEntity.ok(agendamento.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<AgendamentoDTO> saveAgendamento(@RequestBody Agendamento agendamento){
		try {
			Agendamento x = service.save(agendamento);
			URI location = getUri(x.getId());
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	private URI getUri(Long id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Agendamento> update(@PathVariable("id") Long id, @RequestBody Agendamento agendamento){
		agendamento.setId(id);
		Agendamento x = service.update(agendamento);
		if(x != null) {
			return ResponseEntity.ok(x);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	/*@DeleteMapping
	public ResponseEntity<AgendamentoDTO> delete(@PathVariable("id") Long id){
		if(service.delete(id)) {
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}*/
}
