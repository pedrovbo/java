package com.gft.desafio.repository;

import java.util.ArrayList;
import java.util.List;

import com.gft.desafio.model.Arma;

public interface ArmaRespository {

	static List<Arma> listaArmas() {

		List<Arma> armas = new ArrayList<Arma>();
		armas.add(new Arma("Peixeira"));
		armas.add(new Arma("DynaTAC 8000X"));
		armas.add(new Arma("Trezoit�o"));
		armas.add(new Arma("Trebuchet"));
		armas.add(new Arma("Ma�a"));
		armas.add(new Arma("Gl�dio"));

		return armas;
	}
}
