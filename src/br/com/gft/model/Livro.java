package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private int qtdPag;
	
	
	public Livro() {
		super();
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		double i;
		if(this.getTema() == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + nome + ".");
		}else {
		i = preco * 0.10;
		preco = preco + i;
		System.out.println("R$" + preco + " de impostos sobre o livro " + nome + ".");
		}
	
		return 0;
	}
		
}