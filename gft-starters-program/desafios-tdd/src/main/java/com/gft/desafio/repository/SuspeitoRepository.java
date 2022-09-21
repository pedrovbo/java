package com.gft.desafio.repository;

import java.util.ArrayList;
import java.util.List;

import com.gft.desafio.model.Suspeito;

public interface SuspeitoRepository {

	static List<Suspeito> listaSuspeitos() {

		List<Suspeito> suspeitos = new ArrayList<Suspeito>();
		suspeitos.add(new Suspeito("Charles B. Abbage"));
		suspeitos.add(new Suspeito("Donald Duck Knuth"));
		suspeitos.add(new Suspeito("Ada L. Ovelace"));
		suspeitos.add(new Suspeito("Alan T. Uring"));
		suspeitos.add(new Suspeito("Ivar J. Acobson"));
		suspeitos.add(new Suspeito("Ras Mus Ler Dorf"));

		return suspeitos;
	}
}
