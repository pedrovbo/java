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

import com.gft.exercicio3.model.Guerreiro;

public class GuerreiroTest {

	private Guerreiro guerreiroLevelUm;

	private Guerreiro guerreiroLevelDois;

	@Mock
	private Guerreiro guerreiroMock;

	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		List<String> habilidades = new ArrayList<String>();
		habilidades.add("Ataque Giratório");
		habilidades.add("Investida");
		guerreiroLevelUm = new Guerreiro("Conan", 10, 5, 0f, 2, 5, 1, habilidades);
		guerreiroLevelDois = new Guerreiro("Minsc", 20, 6, 0f, 3, 8, 2, habilidades);

	}

	private void assertSubirNivel(Guerreiro valoresEsperados, Guerreiro guerreiroTestado) throws MultipleFailuresError {
		guerreiroLevelUm.lvlUp();
		assertAll(() -> assertEquals(valoresEsperados.getLevel(), guerreiroTestado.getLevel()),
				() -> assertEquals(valoresEsperados.getForca(), guerreiroTestado.getForca()),
				() -> assertEquals(valoresEsperados.getInteligencia(), guerreiroTestado.getInteligencia()),
				() -> assertEquals(valoresEsperados.getMana(), guerreiroTestado.getMana()),
				() -> assertEquals(valoresEsperados.getVida(), guerreiroTestado.getVida()));
	}

	private void assertModificadorAttack(int esperado, Guerreiro guerreiro) {
		int testaAttack = guerreiro.getForca() * guerreiro.getLevel();
		assertEquals(esperado, testaAttack);
	}

	private void assertAprenderHabilidade(String habilidade, Guerreiro guerreiro) {
		guerreiroLevelUm.aprenderHabilidade(habilidade);
		String teste = guerreiro.getHabilidadePeloNome(habilidade);
		String esperado = habilidade;

		assertTrue(teste.equals(esperado));
	}

	@Test
	void deveSubirLevelDoGuerreiro() throws Exception {
		assertSubirNivel(guerreiroLevelDois, guerreiroLevelUm);
	}

	@Test
	void deveUsarAttack() throws Exception {
		guerreiroMock.attack();
		verify(guerreiroMock, times(1)).attack();
	}

	@Test
	void deveRetornarModificadorAttack() throws Exception {
		assertModificadorAttack(5, guerreiroLevelUm);
	}

	@Test
	void deveAprenderHabilidade() throws Exception {
		assertAprenderHabilidade("Trespassar", guerreiroLevelUm);

	}
	
	//TODO implementar testes randomicos - pesquisar sobre delta

}
