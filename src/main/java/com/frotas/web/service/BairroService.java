package com.frotas.web.service;
import java.util.List;
import java.util.Optional;
import com.frotas.api.dto.BairroDTO;
import com.frotas.web.domain.Bairro;

public interface BairroService {
	Bairro save(Bairro bairro);
	Bairro update(Bairro bairro);
	void delete(Bairro bairro);
	Optional<BairroDTO> findById(Long id);
	List<BairroDTO> findAll();
	//Regras
	//void bairroDuplicado(String nomeBairro);
}