package com.gft.exericio1.service;

public class AcimaDoLimiteDoTanqueDeCombustivelException extends RuntimeException {
	@Override
	public String getMessage() {
		return "N�o � poss�vel abastecer acima da capacidade do tanque de combust�vel";
	}
	private static final long serialVersionUID = 1L;

}
