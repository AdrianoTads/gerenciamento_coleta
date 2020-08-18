package com.frotas.web.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.frotas.web.domain.Agendamento;

public interface AgendamentoDao extends JpaRepositoryImplementation<Agendamento, Long> {

	/*void save(Agendamento agendamento);
	void update(Agendamento agendamento);
	void delete(Long id);
	Agendamento findById(Long id);
	List<Agendamento> findAll();	*/
	
}
