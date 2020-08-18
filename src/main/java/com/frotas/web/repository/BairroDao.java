package com.frotas.web.repository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.frotas.web.domain.Bairro;
public interface BairroDao extends JpaRepositoryImplementation<Bairro, Long> {
	/*Bairro save(Bairro bairro);
	void update(Bairro bairro);
	void delete(Long id);
	Bairro findById(Long id);
	Optional <Bairro> findByNome(String nome);
	List<Bairro> findAll();*/
}