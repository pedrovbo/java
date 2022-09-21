package com.gft.exericio1.service;

public class AcimaDoLimiteDoTanqueDeCombustivelException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Não é possível abastecer acima da capacidade do tanque de combustível";
	}
	private static final long serialVersionUID = 1L;

}
