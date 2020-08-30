package com.frotas.web.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frotas.api.dto.BairroDTO;
import com.frotas.web.domain.Bairro;
import com.frotas.web.repository.BairroRepository;

@Service
public class BairroService {
	@Autowired
	private BairroRepository repository;

	public List<BairroDTO> getBairros() {
		return repository.findAll().stream().map(BairroDTO::create).collect(Collectors.toList());
	}

	public Optional<BairroDTO> getBairroPorId(Long id) {
		return repository.findById(id).map(BairroDTO::create);
	}

	public BairroDTO saveBairro(Bairro bairro) {
		Assert.isNull(bairro.getId(), "Não foi possivel salvar o bairro");
		return BairroDTO.create(repository.save(bairro));
	}

	public BairroDTO updateBairro(Long id, Bairro bairro) {
		Assert.isNull(id, "Não foi possivel alterar o bairro");
		Optional<Bairro> optional = repository.findById(id);
		if (optional.isPresent()) {
			Bairro b = optional.get();
			b.setNome(bairro.getNome());
			return BairroDTO.create(repository.save(b));
		} else {
			return null;
		}
	}

	public boolean deleteBairro(Long id) {
		if (getBairroPorId(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
}