package com.gft.test.exercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio7.model.Gerente;

public class GerenteTest {
	
	private Gerente gerente;
	
	@BeforeEach
	void setup() {
		gerente = new Gerente("Godofredo", 33, 5000d);
	}
	
	
	@Test
	void deveRetornarBonificacao() throws Exception {
		//double bonificacao = gerente.bonificacao();
		assertEquals(15000d, gerente.bonificacao());
	}
}
