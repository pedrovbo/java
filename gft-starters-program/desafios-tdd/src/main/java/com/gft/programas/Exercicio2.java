package com.gft.programas;

import java.util.ArrayList;
import java.util.List;

import com.gft.exercicio2.model.Livro;
import com.gft.exercicio2.model.Loja;
import com.gft.exercicio2.model.VideoGame;
import com.gft.exercicio2.service.EstoqueDeLivrosVazioException;
import com.gft.exercicio2.service.EstoqueDeVideoGamesVazioException;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException;
import com.gft.exercicio2.service.ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException;

public interface Exercicio2 {

	public static void start() {

		inicioPrograma();
		try {
			Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
			Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
			Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

			VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
			VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
			VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

			List<Livro> livros = new ArrayList<>();
			livros.add(l1);
			livros.add(l2);
			livros.add(l3);

			List<VideoGame> games = new ArrayList<>();
			games.add(ps4);
			games.add(ps4Usado);
			games.add(xbox);

			Loja americanas = new Loja("Americanas", "12345678", livros, games);

			l2.calculaImposto();
			l3.calculaImposto();

			ps4Usado.calculaImposto();
			ps4.calculaImposto();
			imprimeLinha();

			americanas.listaLivros();
			imprimeLinha();
			americanas.listaVideoGames();
			imprimeLinha();
			americanas.calculaPatrimonio();
		} catch (EstoqueDeLivrosVazioException e) {
			imprimirExcecaoParaUsuario(e);
		} catch (EstoqueDeVideoGamesVazioException e) {
			imprimirExcecaoParaUsuario(e);
		} catch (ImpossivelCalcularImpostoSobreLivroSemValorDefinidoException e) {
			imprimirExcecaoParaUsuario(e);
		} catch (ImpossivelCalcularImpostoSobreVideoGameSemValorDefinidoException e) {
			imprimirExcecaoParaUsuario(e);
		}
		fimPrograma();

	}

	static void imprimeLinha() {
		for (int i = 0; i < 80; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void imprimirExcecaoParaUsuario(Exception e) {
		divisorConsole();
		System.out.println(e.getMessage());
		divisorConsole();
	}

	private static void divisorConsole() {
		System.out.println("###################################");
	}

	private static void inicioPrograma() {
		System.out.println("###### INICIO DO EXERCÍCIO 2 #######");
		System.out.println("####################################");
		System.out.println();
	}

	private static void fimPrograma() {
		System.out.println("####### FIM DO EXERCÍCIO 2 ########");
		System.out.println("###################################");
		System.out.println();
	}

}
