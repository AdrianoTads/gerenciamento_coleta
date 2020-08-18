package com.frotas.web.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "combustivel")
public class Combustivel extends AbstractEntity<Long> {
	@Column(name = "tipo_combustivel", nullable = false, unique = true, length = 60)
	private String tipoCombustivel;
	
	@OneToMany(mappedBy = "tipoCombustivel")
	private List<Veiculo> veiculos;
//Getters and Setters

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
}
