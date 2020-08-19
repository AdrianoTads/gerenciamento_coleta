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

import com.frotas.web.domain.Bairro;
import com.frotas.api.dto.BairroDTO;
import com.frotas.web.service.BairroService;

@RestController
@RequestMapping("/api/bairros")
public class BairroController {
	
	public String teste() {
		//@GetMapping
		return "Testando a aplicação";
		}
	
	@Autowired
	private BairroService service;
	
	@GetMapping()
	public ResponseEntity<BairroService> List(){
		return ResponseEntity.ok(service);
	}
	@GetMapping("/{id}")
	public ResponseEntity<BairroDTO> getBairro(@PathVariable("id") Long id){
		Optional<BairroDTO> bairro = service.findById(id);
		if(bairro.isPresent()) {
			return ResponseEntity.ok(bairro.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<BairroDTO> save(@RequestBody Bairro bairro){
		try {
			Bairro x = service.save(bairro);
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
	public ResponseEntity<Bairro> update(@PathVariable("id") Long id, @RequestBody Bairro bairro){
		bairro.setId(id);
		Bairro x = service.update(bairro);
		if(x != null) {
			return ResponseEntity.ok(x);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	/*@DeleteMapping
	public ResponseEntity<BairroDTO> delete(@PathVariable("id") Long id){
		if(service.delete(id)) {
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}*/
}