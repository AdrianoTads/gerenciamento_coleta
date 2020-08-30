package com.frotas.web.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frotas.api.dto.AgendamentoDTO;
import com.frotas.web.domain.Agendamento;
import com.frotas.web.repository.AgendamentoRepository;


@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository repository;

	public List<AgendamentoDTO> getAgendamentos() {
		return repository.findAll().stream().map(AgendamentoDTO::create).collect(Collectors.toList());
	}

	public Optional<AgendamentoDTO> getAgendamentoPorId(Long id) {
		return repository.findById(id).map(AgendamentoDTO::create);
	}

	public AgendamentoDTO saveAgendamento(Agendamento agendamento) {
		Assert.isNull(agendamento.getId(), "Não foi possivel salvar o agendamento");
		return AgendamentoDTO.create(repository.save(agendamento));
	}

	public AgendamentoDTO updateAgendamento(Long id, Agendamento agendamento) {
		Assert.isNull(id, "Não foi possivel alterar o agendamento");
		Optional<Agendamento> optional = repository.findById(id);
		if (optional.isPresent()) {
			Agendamento a = optional.get();
			a.setHorario(agendamento.getHorario());
			a.setTipoColeta(agendamento.getTipoColeta());
			a.setDiaSemana(agendamento.getDiaSemana());
			repository.save(a);
			return AgendamentoDTO.create(a);
		} else {
			return null;
		}
	}

	public boolean deleteAgendamento(Long id) {
		if (getAgendamentoPorId(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
}