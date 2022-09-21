package com.gft.desafio.repository;

import java.util.ArrayList;
import java.util.List;

import com.gft.desafio.model.Arma;

public interface ArmaRespository {

	static List<Arma> listaArmas() {

		List<Arma> armas = new ArrayList<Arma>();
		armas.add(new Arma("Peixeira"));
		armas.add(new Arma("DynaTAC 8000X"));
		armas.add(new Arma("Trezoitão"));
		armas.add(new Arma("Trebuchet"));
		armas.add(new Arma("Maça"));
		armas.add(new Arma("Gládio"));

		return armas;
	}
}
