package com.gft.test.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gft.desafio.model.Arma;
import com.gft.desafio.model.Crime;
import com.gft.desafio.model.Local;
import com.gft.desafio.model.Suspeito;
import com.gft.desafio.model.Teoria;
import com.gft.desafio.repository.ArmaRespository;
import com.gft.desafio.repository.LocalRepository;
import com.gft.desafio.repository.SuspeitoRepository;

public class TeoriaTest {

	private Teoria teoria;
	private List<Suspeito> suspeitos;
	private List<Local> locais;
	private List<Arma> armas;
	private Crime crime;
	private String assassino;
	private String localCrime;
	private String armaUtilizada;
	
	@Mock
	private Teoria teoriaMockada;

	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		teoria = new Teoria();
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
		
		
	}

	@Test
	void deveConfirmarATeoria() throws Exception {
		teoria.setSuspeito(assassino);
		teoria.setLocal(localCrime);
		teoria.setArma(armaUtilizada);

		assertEquals(crime.toString(), teoria.toString());
	}
	
	@Test
	void deveChutarUmCrime() throws Exception {
		teoriaMockada.chutarCrime(suspeitos, locais, armas);
		verify(teoriaMockada, times(1)).chutarCrime(suspeitos, locais, armas);
	}
	

}
