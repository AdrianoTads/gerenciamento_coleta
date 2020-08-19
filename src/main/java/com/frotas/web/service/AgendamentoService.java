package com.frotas.web.service;

import java.util.List;
import java.util.Optional;

import com.frotas.api.dto.AgendamentoDTO;
import com.frotas.web.domain.Agendamento;

public interface AgendamentoService {
	Agendamento save(Agendamento agendamento);
	Agendamento update(Agendamento agendamento);
	void delete(Agendamento agendamento);
	Optional<AgendamentoDTO> findById(Long id);
	List<AgendamentoDTO> findAll();
	//Regras
	//void agendamentoDuplicado(String nomeAgendamento);
}
