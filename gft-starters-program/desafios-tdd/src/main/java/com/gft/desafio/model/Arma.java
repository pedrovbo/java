package com.gft.desafio.model;

public class Arma {
	private String modelo;

	public Arma(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return modelo;
	}
	
}
