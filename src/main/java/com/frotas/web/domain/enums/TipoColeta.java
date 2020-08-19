package com.frotas.web.domain.enums;

public enum TipoColeta {

	COLETASELETIVA(1, "Coleta Seletiva"), COLETACOMUM(2, "Coleta Comum");

	private int codigo;
	private String descricao;

	private TipoColeta(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoColeta toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoColeta x : TipoColeta.values()) {
			if (codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("código invalido: "+ codigo);
	}

}
