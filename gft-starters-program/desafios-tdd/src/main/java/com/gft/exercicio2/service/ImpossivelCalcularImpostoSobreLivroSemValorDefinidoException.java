package com.gft.exercicio2.service;

public class ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Imposs�vel calcular imposto sobre livro sem valor definido";
	}
	private static final long serialVersionUID = 1L;

}
