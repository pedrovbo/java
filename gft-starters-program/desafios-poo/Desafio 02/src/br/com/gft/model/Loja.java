package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (this.getLivros().isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			System.out.println("A loja " + this.getNome() + " possui estes livros para venda:");
			this.getLivros().forEach(livro -> {
				System.out.println(livro);
			});
		}
	}

	public void listaVideoGames() {
		if (this.getVideoGames().isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		} else {
			System.out.println("A loja " + this.getNome() + " possui estes video-games para venda:");
			this.getVideoGames().forEach(videoGame -> {
				System.out.println(videoGame);
			});
		}
	}

	public double calculaPatrimonio() {
		double soma = 0d;

		for (int i = 0; i < this.getLivros().size(); i++) {
			soma += this.getLivros().get(i).getPreco() * this.getLivros().get(i).getQtd();
		}

		for (int i = 0; i < this.getVideoGames().size(); i++) {
			soma += this.getVideoGames().get(i).getPreco() * this.getVideoGames().get(i).getQtd();
		}

		System.out.println("O patrimonio da loja: " + this.getNome() + " é de R$ " + soma);
		return soma;
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
		return this.livros;
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

}
