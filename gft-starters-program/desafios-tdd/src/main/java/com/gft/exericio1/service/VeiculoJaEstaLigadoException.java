package com.gft.exericio1.service;

public class VeiculoJaEstaLigadoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Veiculo j� est� ligado";
	}
	private static final long serialVersionUID = 1L;

}
