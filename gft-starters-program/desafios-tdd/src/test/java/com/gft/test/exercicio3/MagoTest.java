package com.gft.test.exercicio3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.opentest4j.MultipleFailuresError;

import com.gft.exercicio3.model.Mago;

public class MagoTest {

	private Mago magoLevelUm;

	private Mago magoLevelDois;

	@Mock
	private Mago magoMock;

	@BeforeEach
	void setup() {

		MockitoAnnotations.openMocks(this);
		List<String> magias = new ArrayList<String>();
		magias.add("Bola de Fogo");
		magias.add("Dardos Místicos");
		magoLevelUm = new Mago("Gandalf", 5, 10, 0f, 5, 2, 1, magias);
		magoLevelDois = new Mago("Gandalf", 10, 13, 0f, 8, 3, 2, magias);

	}

	private void assertSubirNivel(Mago valoresEsperados, Mago magoTestado) throws MultipleFailuresError {
		magoLevelUm.lvlUp();
		assertAll(() -> assertEquals(valoresEsperados.getLevel(), magoTestado.getLevel()),
				() -> assertEquals(valoresEsperados.getForca(), magoTestado.getForca()),
				() -> assertEquals(valoresEsperados.getInteligencia(), magoTestado.getInteligencia()),
				() -> assertEquals(valoresEsperados.getMana(), magoTestado.getMana()),
				() -> assertEquals(valoresEsperados.getVida(), magoTestado.getVida()));
	}

	private void assertModificadorAttack(int esperado, Mago mago) {
		int testaAttack = mago.getInteligencia() * mago.getLevel();

		assertEquals(esperado, testaAttack);
	}

	private void assertAprenderMagia(String magia, Mago mago) {
		magoLevelUm.aprenderMagia(magia);
		String teste = mago.getMagiaPeloNome(magia);
		String esperado = magia;

		assertTrue(teste.equals(esperado));
	}

	@Test
	void deveSubirLevelDoMago() throws Exception {
		assertSubirNivel(magoLevelDois, magoLevelUm);
	}

	@Test
	void deveUsarAttack() throws Exception {
		magoMock.attack();
		verify(magoMock, times(1)).attack();
	}

	@Test
	void deveRetornarModificadorAttack() throws Exception {
		assertModificadorAttack(5, magoLevelUm);
	}

	@Test
	void deveAprenderMagia() throws Exception {
		assertAprenderMagia("Incinerar", magoLevelUm);

	}

}
