package com.gft.desafio.model;

public class Crime {

	private String assassino;
	private String localDoCrime;
	private String armaUtilizada;

	public Crime() {
	}

	public Crime(String assassino, String localDoCrime, String armaUtilizada) {
		super();
		this.assassino = assassino;
		this.localDoCrime = localDoCrime;
		this.armaUtilizada = armaUtilizada;
	}

	public String getAssassino() {
		return assassino;
	}

	public void setAssassino(String assassino) {
		this.assassino = assassino;
	}

	public String getLocalDoCrime() {
		return localDoCrime;
	}

	public void setLocalDoCrime(String localDoCrime) {
		this.localDoCrime = localDoCrime;
	}

	public String getArmaUtilizada() {
		return armaUtilizada;
	}

	public void setArmaUtilizada(String armaUtilizada) {
		this.armaUtilizada = armaUtilizada;
	}
	
	@Override
	public String toString() {
		return this.getAssassino() + " " + this.getLocalDoCrime() + " " + this.getArmaUtilizada();
	}

}
