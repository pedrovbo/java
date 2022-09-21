package com.gft.test.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.desafio.model.Arma;
import com.gft.desafio.model.Crime;
import com.gft.desafio.model.Local;
import com.gft.desafio.model.Suspeito;
import com.gft.desafio.model.Teoria;
import com.gft.desafio.model.Testemunha;
import com.gft.desafio.repository.ArmaRespository;
import com.gft.desafio.repository.LocalRepository;
import com.gft.desafio.repository.SuspeitoRepository;

public class TestemunhaTest {

	private Teoria correta, somenteAssassinoIncorreto, somenteLocalIncorreto, somenteArmaIncorreta;
	private List<Suspeito> suspeitos;
	private List<Local> locais;
	private List<Arma> armas;
	private Crime crime;
	private String assassino;
	private String localCrime;
	private String armaUtilizada;
	private Testemunha testemunha;

	@BeforeEach
	void setup() {
		suspeitos = new ArrayList<Suspeito>();
		locais = new ArrayList<Local>();
		armas = new ArrayList<Arma>();

		suspeitos.addAll(SuspeitoRepository.listaSuspeitos());
		locais.addAll(LocalRepository.listaLocais());
		armas.addAll(ArmaRespository.listaArmas());
		
		assassino = suspeitos.get(4).toString();
		localCrime = locais.get(8).toString();
		armaUtilizada = armas.get(2).toString();

		crime = new Crime(assassino, localCrime, armaUtilizada);
		correta = new Teoria(assassino, localCrime, armaUtilizada);
		testemunha = new Testemunha();
		somenteAssassinoIncorreto = new Teoria("Asdrubal", localCrime, armaUtilizada);
		somenteLocalIncorreto = new Teoria(assassino, "Albania", armaUtilizada);
		somenteArmaIncorreta = new Teoria(assassino, localCrime, "Marreta");
	}
	
	@Test
	void deveRetornarUmSeSomenteOAssassinoForIncorreto() throws Exception {
		assertEquals(1, testemunha.darTestemunho(crime, somenteAssassinoIncorreto));
	}
	
	@Test
	void deveRetornarDoisSeSomenteOLocalForIncorreto() throws Exception {
		assertEquals(2, testemunha.darTestemunho(crime, somenteLocalIncorreto));
	}
	
	@Test
	void deveRetornarTresSeSomenteAArmaForIncorreta() throws Exception {
		assertEquals(3, testemunha.darTestemunho(crime, somenteArmaIncorreta));
	}
	
	@Test
	void deveRetornarZeroSeOPalpiteForCorreto() throws Exception {
		assertEquals(0, testemunha.darTestemunho(crime, correta));
	}
}
