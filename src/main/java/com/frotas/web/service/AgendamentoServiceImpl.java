package com.frotas.web.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frotas.api.dto.AgendamentoDTO;
import com.frotas.web.domain.Agendamento;
import com.frotas.web.repository.AgendamentoDao;

@Service @Transactional(readOnly = false)
public class AgendamentoServiceImpl implements AgendamentoService {
	@Autowired
	private AgendamentoDao repository;

	@Override
	public Agendamento save(Agendamento agendamento) {
	return repository.save(agendamento);
	}
	@Override
	public Agendamento update(Agendamento agendamento) {
	return repository.save(agendamento);
	}
	@Override
	public void delete(Agendamento agendamento) {
	repository.delete(agendamento);
	}
	
	@Override @Transactional(readOnly = true)
	public Optional<AgendamentoDTO> findById(Long id) {
		return repository.findById(id).map(AgendamentoDTO::create);
	}
	@Override @Transactional(readOnly = true)
	public List<AgendamentoDTO> findAll() {
		return repository.findAll()
				.stream().map(AgendamentoDTO::create)
				.collect(Collectors.toList());
	}
	
	/*	@Override
	public void agendamentoDuplicado(String nomeAgendamento) {
		Optional<Agendamento> agendamento = repository.findByNome(nomeAgendamento);
		if(agendamento.get().getNome().equals(nomeAgendamento)) {
			//exceptions
			throw new RegraDeNegocioException("Agendamento já cadastrado");
		}
		
	}*/
	
	
}
