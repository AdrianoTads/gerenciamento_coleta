package com.frotas.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.frotas.web.domain.Agendamento;
import com.frotas.web.domain.Bairro;
import com.frotas.web.domain.enums.DiaSemana;
import com.frotas.web.domain.enums.TipoColeta;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
	@Query ( value = "select a.bairro, a.diaSemana, a.tipoColeta "
			+ "from Agendamento a"
			+ "where a.bairro = :bairro and diaSemana = :diaSemana"
			+ " and tipoColeta = :tipoColeta")
	Optional<Agendamento> compararAgendamento(
		@Param("bairro") Bairro bairro,
		@Param("diaSemana")DiaSemana diaSemana,
		@Param("tipoColeta")TipoColeta tipoColeta);

}
