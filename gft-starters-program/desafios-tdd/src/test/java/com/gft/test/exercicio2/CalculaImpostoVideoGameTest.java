package com.gft.test.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio2.model.VideoGame;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException;

public class CalculaImpostoVideoGameTest {

	private VideoGame videoGameUsado;
	private VideoGame videoGameNovo;
	private VideoGame videoGameSemPreco;

	// TODO verificar necessidade de implementar mais algum teste
	@BeforeEach
	void setup() {
		videoGameSemPreco = new VideoGame();
		videoGameUsado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		videoGameNovo = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
	}

	private void assertValorImposto(double valorEsperado, VideoGame videoGame) {
		assertEquals(valorEsperado, videoGame.calculaImposto(), 0.0001);
	}
	
	@Test
	void NaodeveCalcularImpostoSobreVideoGameSemPreco() throws Exception {
		assertThrows(ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException.class, () -> videoGameSemPreco.calculaImposto());
	}

	@Test
	void deveCalcularImpostoSobreVideoGamesUsados() throws Exception {
		assertValorImposto(250.0, videoGameUsado);
	}

	@Test
	void deveCalcularImpostoSobreVideoGamesNovos() throws Exception {
		assertValorImposto(810, videoGameNovo);
	}

}
