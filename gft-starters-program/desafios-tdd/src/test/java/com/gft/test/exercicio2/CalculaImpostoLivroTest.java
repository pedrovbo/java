package com.gft.test.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio2.model.Livro;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException;

public class CalculaImpostoLivroTest {
	
	private Livro livroSemPreco;
	private Livro livroNaoEducativo;
	private Livro livroEducativo;
	
	@BeforeEach
	void setup() {
		livroSemPreco = new Livro();
		livroNaoEducativo = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		livroEducativo = new Livro("Java POO", 100, 10, "Guanabara", "educativo", 300);
	}
	
	private void assertValorImposto(double valorEsperado, Livro livro) {
		assertEquals(valorEsperado, livro.calculaImposto(), 0.0001);
	}
	
	@Test
	void NaodeveCalcularImpostoSobreLivroSemPreco() throws Exception {
		assertThrows(ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException.class, () -> livroSemPreco.calculaImposto());
	}
	
	@Test
	void deveCalcularImpostoSobreLivrosEducativos() throws Exception {
		assertValorImposto(0, livroEducativo);
	}
	
	@Test
	void deveCalcularImpostoSobreLivrosNaoEducativos() throws Exception {
		assertValorImposto(4d, livroNaoEducativo);
	}
	
}
