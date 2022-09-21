package com.gft.exercicio2.model;

import java.util.ArrayList;
import java.util.List;

import com.gft.exercicio2.service.EstoqueDeLivrosVazioException;
import com.gft.exercicio2.service.EstoqueDeVideoGamesVazioException;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros = new ArrayList<Livro>();
	private List<VideoGame> videoGames = new ArrayList<VideoGame>();

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros.addAll(livros);
		this.videoGames.addAll(videoGames);
	}

	public Loja(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	//TODO como testar o else desse método?
	public void listaLivros() throws EstoqueDeLivrosVazioException {
		if (this.getLivros().isEmpty()) {
			throw new EstoqueDeLivrosVazioException();
		} else {
			imprimirListaLivros();
		}
	}
	
	//TODO testar usando outputstream!
	
	//TODO como testar o else desse método?
	public void listaVideoGames() throws EstoqueDeVideoGamesVazioException {
		if (this.getVideoGames().isEmpty()) {
			throw new EstoqueDeVideoGamesVazioException();
		} else {
			imprimirListaVideoGames();
		}
	}

	public double calculaPatrimonio() {
		double soma = 0d;
		soma = somaLivros(this.getLivros()) + somaVideoGames(this.getVideoGames());
		imprimirPatrimonio(soma);
		return soma;
	}
	
	//TODO dúvida, como testar método void privado?
	private void imprimirListaLivros() {
		System.out.println("A loja " + this.getNome() + " possui estes video-games para venda:");
		this.getLivros().forEach(videoGame -> {
			System.out.println(videoGame);
		});
	}

	private void imprimirListaVideoGames() {
		System.out.println("A loja " + this.getNome() + " possui estes video-games para venda:");
		this.getVideoGames().forEach(videoGame -> {
			System.out.println(videoGame);
		});
	}

	private void imprimirPatrimonio(double soma) {
		System.out.println("O patrimonio da loja: " + this.getNome() + " é de R$ " + soma);
	}

	private double somaVideoGames(List<VideoGame> videoGames) {
		double soma = 0d;
		for (VideoGame videoGame : videoGames) {
			soma += videoGame.getPreco() * videoGame.getQtd();
		}
		return soma;
	}

	private double somaLivros(List<Livro> livros) {
		double soma = 0d;
		for (Livro livro : livros) {
			soma += livro.getPreco() * livro.getQtd();
		}
		return soma;
	}

}
