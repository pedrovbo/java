package com.gft.exercicio2.service;

public class EstoqueDeVideoGamesVazioException extends Exception {
	@Override
	public String getMessage() {
		return "O estoque de video-games est� vazio";
	}
	private static final long serialVersionUID = 1L;

}
