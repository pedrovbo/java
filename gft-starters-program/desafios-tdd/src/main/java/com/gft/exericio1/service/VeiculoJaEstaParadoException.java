package com.gft.exericio1.service;

public class VeiculoJaEstaParadoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "O veículo já está parado";
	}
	private static final long serialVersionUID = 1L;

}
