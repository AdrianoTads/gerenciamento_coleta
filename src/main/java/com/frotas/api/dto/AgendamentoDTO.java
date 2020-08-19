package com.frotas.api.dto;

import org.modelmapper.ModelMapper;

import com.frotas.web.domain.Agendamento;

public class AgendamentoDTO {
private Long id;
private String horario;

public static AgendamentoDTO create(Agendamento agendamento) {
	ModelMapper modelMapper = new ModelMapper();
	return modelMapper.map(agendamento, AgendamentoDTO.class);
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getHorario() {
	return horario;
}

public void setHorario(String horario) {
	this.horario = horario;
}



}
