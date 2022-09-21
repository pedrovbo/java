package com.gft.exericio1.service;

public class VeiculoNaoPodeAcelerarDesligadoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Veículo não pode acelerar desligado";
	}
	private static final long serialVersionUID = 1L;

}
