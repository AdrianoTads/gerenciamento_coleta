package com.frotas.web.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.frotas.web.domain.Combustivel;

@Repository
public interface CombustivelDao{
	void save(Combustivel combustivel);

	void update(Combustivel combustivel);

	void delete(Long id);

	Combustivel findById(Long id);

	List<Combustivel> findAll();

}
