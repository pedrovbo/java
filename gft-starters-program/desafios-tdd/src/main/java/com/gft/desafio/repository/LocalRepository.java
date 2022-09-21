package com.gft.desafio.repository;

import java.util.ArrayList;
import java.util.List;

import com.gft.desafio.model.Local;

public interface LocalRepository {

	static List<Local> listaLocais() {

		List<Local> locais = new ArrayList<Local>();
		locais.add(new Local("Redmond"));
		locais.add(new Local("Palo Alto"));
		locais.add(new Local("San Francisco"));
		locais.add(new Local("Tokio"));
		locais.add(new Local("Restaurante no Fim do Universo"));
		locais.add(new Local("São Paulo"));
		locais.add(new Local("Cupertino"));
		locais.add(new Local("Helsinki"));
		locais.add(new Local("Maida Vale"));
		locais.add(new Local("Toronto"));

		return locais;
	}

}
