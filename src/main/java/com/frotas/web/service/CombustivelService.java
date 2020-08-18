package com.frotas.web.service;

import java.util.List;

import com.frotas.web.domain.Combustivel;

public interface CombustivelService {
	void save(Combustivel combustivel);

	void update(Combustivel combustivel);

	void delete(Long id);

	Combustivel findById(Long id);

	List<Combustivel> findAll();
}
