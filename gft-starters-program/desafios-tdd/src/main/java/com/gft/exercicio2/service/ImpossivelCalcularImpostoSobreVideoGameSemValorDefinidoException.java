package com.gft.exercicio2.service;

public class ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Impossivel calcular imposto sobre video-game sem valor definido";
	}

	private static final long serialVersionUID = 1L;

}
