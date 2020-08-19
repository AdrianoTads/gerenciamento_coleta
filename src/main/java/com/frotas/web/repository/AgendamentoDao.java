package com.frotas.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.frotas.web.domain.Agendamento;

public interface AgendamentoDao extends JpaRepository<Agendamento, Long> {

	/*void save(Agendamento agendamento);
	void update(Agendamento agendamento);
	void delete(Long id);
	Agendamento findById(Long id);
	List<Agendamento> findAll();	*/
	
}
