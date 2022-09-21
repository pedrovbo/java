package com.gft.desafio.model;

import java.util.List;
import java.util.Random;

public class Teoria {

	private String suspeito;
	private String local;
	private String arma;
	private static Random rand = new Random();
	public Teoria() {
	}

	public Teoria(String suspeito, String local, String arma) {
		this.suspeito = suspeito;
		this.local = local;
		this.arma = arma;
	}

	public String getSuspeito() {
		return suspeito;
	}

	public void setSuspeito(String suspeito) {
		this.suspeito = suspeito;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	//TODO faz uso de dados aleatórios, como testar?
	public String chutarCrime(List<Suspeito> suspeitos, List<Local> locais, List<Arma> armas) { 
		chutarSuspeito(suspeitos);
		chutarLocal(locais);
		chutarArma(armas);
		
		return this.toString(); 
	}

	public String chutarSuspeito(List<Suspeito> suspeitos) {
		this.setSuspeito(suspeitos.get(gerarSuspeito(suspeitos)).toString());
		return this.getSuspeito();
	}

	public String chutarArma(List<Arma> armas) {
		this.setArma(armas.get(gerarArma(armas)).toString());
		return this.getArma();
	}

	public String chutarLocal(List<Local> locais) {
		this.setLocal(locais.get(gerarLocal(locais)).toString());
		return this.getLocal();
	}
	
	private int gerarArma(List<Arma> armas) {
		int palpiteArma = rand.nextInt(armas.size());
		return palpiteArma;
	}

	private int gerarLocal(List<Local> locais) {
		int palpiteLocal = rand.nextInt(locais.size());
		return palpiteLocal;
	}

	private int gerarSuspeito(List<Suspeito> suspeitos) {
		int palpiteSuspeito = rand.nextInt(suspeitos.size());
		return palpiteSuspeito;
	}
	
	
	
	@Override
	public String toString() {
		return this.getSuspeito() + " " + this.getLocal() + " " + this.getArma();
	}

}
