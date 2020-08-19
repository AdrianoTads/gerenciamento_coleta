package com.frotas.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.frotas.web.domain.enums.DiaSemana;
import com.frotas.web.domain.enums.TipoColeta;
import com.frotas.web.domain.Bairro;


@SuppressWarnings("serial")
@Entity
public class Agendamento extends AbstractEntity<Long> {

	@Column(nullable = false, length = 20)
	private String horario;
	@Column(name = "tipo_coleta", nullable = false)
	private Integer tipoColeta;
	@Column(name = "dia_semana", nullable = false)
	private Integer diaSemana;


	@ManyToOne
	@JoinColumn(name = "bairro_id")
	private Bairro bairro;
	
	//DiaSemana diaSemana;
	
	//TipoColeta tipoColeta;

    
	public String getHorario() {
		return horario;
	}

	public void setData(String horario) {
		this.horario = horario;
	}

	public TipoColeta getTipoColeta() {
		return TipoColeta.toEnum(tipoColeta);
	}

	public void setTipoColeta(TipoColeta tipoColeta) {
		this.tipoColeta = tipoColeta.getCodigo();
	}
	
	public DiaSemana getDiaSemana() {
		return DiaSemana.toEnum(diaSemana);
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana.getCodigo();
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}
