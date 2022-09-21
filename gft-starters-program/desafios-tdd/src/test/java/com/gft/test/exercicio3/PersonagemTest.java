package com.gft.test.exercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.gft.exercicio3.model.Guerreiro;
import com.gft.exercicio3.model.Mago;
import com.gft.exercicio3.model.Personagem;

public class PersonagemTest {
	@Mock
	private Guerreiro guerreiroLevelUm = new Guerreiro();
	@Mock
	private Guerreiro guerreiroLevelDois = new Guerreiro();
	@Mock
	private Mago magoLevelUm = new Mago();
	@Mock
	private Mago magoLevelDois = new Mago();
		
	@Test
	void deveRetornarQuantidadeDePersonagensCriados() throws Exception {
		assertEquals(4, Personagem.quantidadePersonagensCriados());
	}
	
}
