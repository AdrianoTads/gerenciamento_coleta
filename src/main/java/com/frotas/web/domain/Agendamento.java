package com.frotas.web.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class Agendamento extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 80)
	private String horario;
	
	@OneToMany(mappedBy = "horario")
	
	DiaSemana diaSemana;
	
	TipoColeta tipoColeta;

    Bairro bairro;


		
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	public TipoColeta getTipoColeta() {
		return tipoColeta;
	}

	public void setTipoColeta(TipoColeta tipoColeta) {
		this.tipoColeta = tipoColeta;
	}

	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}	
}
