package com.gft.exericio1.service;

public class VeiculoJaEstaDesligadoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Veiculo já está desligado";
	}
	private static final long serialVersionUID = 1L;

}
