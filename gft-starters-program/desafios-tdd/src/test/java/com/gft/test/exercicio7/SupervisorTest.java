package com.gft.test.exercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio7.model.Supervisor;

public class SupervisorTest {

private Supervisor supervisor;
	
	@BeforeEach
	void setup() {
		supervisor = new Supervisor("Astrogildo", 33, 5000d);
	}
	
	
	@Test
	void deveRetornarBonificacao() throws Exception {
		assertEquals(10000d, supervisor.bonificacao());
	}
}
