package com.gft.desafio.model;

import java.util.Random;

public class Testemunha {

	Random rand = new Random();
	private String nome;

	public Testemunha() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int darTestemunho(Crime crime, Teoria teoria) {
		// TODO chain of responsability?
		if (teoria.getSuspeito().contentEquals(crime.getAssassino())
				&& teoria.getLocal().contentEquals(crime.getLocalDoCrime())
				&& teoria.getArma().contentEquals(crime.getArmaUtilizada())) {
			return 0;
		} else if (teoria.getLocal().contentEquals(crime.getLocalDoCrime())
				&& (teoria.getArma().contentEquals(crime.getArmaUtilizada()))) {
			return 1;
		} else if (teoria.getSuspeito().contentEquals(crime.getAssassino())
				&& teoria.getArma().contentEquals(crime.getArmaUtilizada())) {
			return 2;
		} else if (teoria.getSuspeito().contentEquals(crime.getAssassino())
				&& teoria.getLocal().contentEquals(crime.getLocalDoCrime())) {
			return 3;
		} else {
			return rand.nextInt(1, 4);
		}

	}

}
