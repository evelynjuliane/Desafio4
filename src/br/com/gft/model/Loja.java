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
	
	
	public void listaLivros() {
		System.out.println("A loja " + nome + "possui esses livros: ");
		for (Livro index : livros) {
			if(index.getQtd() == 0) {
				System.out.println("A loja não tem livros no seu estoque!");
			}else {
			System.out.println("Titulo:" + index.getNome() + " preço:" + index.getPreco() + " quantidade: " + index.getQtd() + " em estoque");
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}
	
	public void listaVideoGames() {
		System.out.println("A loja " + nome + "possui esses video-games: ");
		for (VideoGame index : videoGames) {
			if(index.getQtd() == 0) {
				System.out.println("A loja não tem video-games no seu estoque!");
			}
			System.out.println("Video-game:" + index.getNome() + " preço:" + index.getPreco() + " quantidade: " + index.getQtd() + " em estoque");
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
	}
	
	public double calculaPatrimonio() {
		double soma = 0;
		for (Livro index : livros) {
			soma += (double)index.getQtd() * index.getPreco();
		}
		for (VideoGame index : videoGames) {
			soma += (double)index.getQtd() * index.getPreco();
		}
		System.out.println("O patrimonio da loja: " + nome + " é de R$" + soma + ".");
		return soma;
		
	}
	
}
