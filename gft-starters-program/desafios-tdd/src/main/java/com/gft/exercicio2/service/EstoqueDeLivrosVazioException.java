package com.gft.exercicio2.service;

public class EstoqueDeLivrosVazioException extends Exception {
	@Override
	public String getMessage() {
		return "O estoque de livros est� vazio";
	}
	private static final long serialVersionUID = 1L;

}
