package com.frotas.api.dto;

import org.modelmapper.ModelMapper;

import com.frotas.web.domain.Bairro;

public class BairroDTO {
private Long id;
private String nome;

public static BairroDTO create(Bairro bairro) {
	ModelMapper modelMapper = new ModelMapper();
	return modelMapper.map(bairro, BairroDTO.class);
	//return null;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}



}
