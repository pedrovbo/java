package com.gft.exericio1.service;

public class VeiculoNaoPodeSerDesligadoEmMovimentoException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Veiculo não pode ser desligado em movimento";
	}

	private static final long serialVersionUID = 1L;

}
