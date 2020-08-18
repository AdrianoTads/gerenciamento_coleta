package com.frotas.web.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.api.dto.BairroDTO;
import com.frotas.web.domain.Bairro;
import com.frotas.web.repository.BairroDao;

@Service @Transactional(readOnly = false)
public class BairroServiceImpl implements BairroService {
	@Autowired
	private BairroDao repository;

	@Override
	public Bairro save(Bairro bairro) {
	return repository.save(bairro);
	}
	@Override
	public Bairro update(Bairro bairro) {
	return repository.save(bairro);
	}
	@Override
	public void delete(Bairro bairro) {
	repository.delete(bairro);
	}
	
	@Override @Transactional(readOnly = true)
	public Optional<BairroDTO> findById(Long id) {
		return repository.findById(id).map(BairroDTO::create);
	}
	@Override @Transactional(readOnly = true)
	public List<BairroDTO> findAll() {
		return repository.findAll()
				.stream().map(BairroDTO::create)
				.collect(Collectors.toList());
	}
	
	/*	@Override
	public void bairroDuplicado(String nomeBairro) {
		Optional<Bairro> bairro = repository.findByNome(nomeBairro);
		if(bairro.get().getNome().equals(nomeBairro)) {
			//exceptions
			throw new RegraDeNegocioException("Bairro já cadastrado");
		}
		
	}*/
	
	
}
