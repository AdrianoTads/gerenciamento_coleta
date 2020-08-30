package com.frotas.api.dto;

import org.modelmapper.ModelMapper;

import com.frotas.web.domain.Agendamento;
import com.frotas.web.domain.Bairro;

public class AgendamentoDTO {
private Long id;
private String horario;
private Integer tipoColeta;
private Integer diaSemana;
private Bairro bairro;

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

public Integer getTipoColeta() {
	return tipoColeta;
}

public void setTipoColeta(Integer tipoColeta) {
	this.tipoColeta = tipoColeta;
}

public Integer getDiaSemana() {
	return diaSemana;
}

public void setDiaSemana(Integer diaSemana) {
	this.diaSemana = diaSemana;
}

public Bairro getBairro() {
	return bairro;
}

public void setBairro(Bairro bairro) {
	this.bairro = bairro;
}



}
