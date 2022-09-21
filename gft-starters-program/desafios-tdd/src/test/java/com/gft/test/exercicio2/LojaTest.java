package com.gft.test.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gft.exercicio2.model.Livro;
import com.gft.exercicio2.model.Loja;
import com.gft.exercicio2.model.VideoGame;
import com.gft.exercicio2.service.EstoqueDeLivrosVazioException;
import com.gft.exercicio2.service.EstoqueDeVideoGamesVazioException;

public class LojaTest {

	
	private Loja loja, lojaVazia;
	@Mock
	private Livro livro = new Livro(10d, 5);
	@Mock
	private VideoGame videoGame = new VideoGame(10d, 5);
	@Mock
	private Loja lojaMockada = new Loja();
	
	private List<Livro> livros = Arrays.asList(livro, livro, livro);
	
	private List<VideoGame> videoGames = Arrays.asList(videoGame, videoGame, videoGame);
	
	

	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		loja = new Loja("Americanas", "00992233112", livros, videoGames);
		lojaVazia = new Loja("Americanas", "00992233112");
		when(livro.getQtd()).thenReturn(5);
		when(videoGame.getPreco()).thenReturn(10d);
		when(videoGame.getQtd()).thenReturn(5);
		when(livro.getPreco()).thenReturn(10d);
	}

	private void assertListaLivros(Loja loja, List<Livro> livros) {
		//TODO implementar assertAll()
		assertTrue(loja.getLivros().size() == livros.size());
		assertTrue(loja.getLivros().containsAll(livros));
	}

	private void assertListaVideoGames(Loja loja, List<VideoGame> videoGames) {
		assertTrue(loja.getVideoGames().size() == videoGames.size());
		assertTrue(loja.getVideoGames().containsAll(videoGames));
	}

	private void assertValorPatrimonioLoja(double valorEsperado, Loja loja) {
		assertEquals(valorEsperado, loja.calculaPatrimonio(), 0.0001);
	}

	@Test
	void naoDeveRetornarListaDeLivrosSemLivrosEmEstoque() throws Exception {
		assertThrows(EstoqueDeLivrosVazioException.class, () -> lojaVazia.listaLivros());
	}

	@Test
	void deveRetornarListaDeLivros() throws Exception {
		assertListaLivros(loja, livros);
	}

	@Test
	void naoDeveRetornarListadeVideoGamesSemVideoGamesEmEstoque() throws Exception {
		assertThrows(EstoqueDeVideoGamesVazioException.class, () -> lojaVazia.listaVideoGames());
	}

	@Test
	void deveRetornarListaDeVideoGames() throws Exception {
		assertListaVideoGames(loja, videoGames);
	}

	@Test
	void deveCalcularPatrimonioDaLoja() throws Exception {
		assertValorPatrimonioLoja(300d, loja);
	}
	
	@Test
	void deveRetornarImpressaoDeListaDeVideoGames() throws Exception {
		lojaMockada.listaLivros();		
		
	}
	
	@Test
	void deveRetornarImpressaoDeListaDeLivros() throws Exception {
		
	}

}
