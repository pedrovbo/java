package com.gft.test.exercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio7.model.Vendedor;

public class VendedorTest {
	
	private Vendedor vendedor;
	
	@BeforeEach
	void setup() {
		vendedor = new Vendedor("Alfredo", 33, 5000d);
	}
		
	@Test
	void deveRetornarBonificacao() throws Exception {
		assertEquals(8000d, vendedor.bonificacao());
	}
}
