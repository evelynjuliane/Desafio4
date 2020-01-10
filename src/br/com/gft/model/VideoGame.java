package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	public VideoGame() {
		super();
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	

	@Override
	
	public double calculaImposto() {
		
		double i; 
		if(isUsado == true) {
			i = preco*0.25;
			preco = preco + i;
			System.out.println("Imposto " + nome + " " + modelo + " Usado, R$" + i + ".");
		}else {
			i = preco*0.45;
			preco = preco + i;
			System.out.println("Imposto " + nome + " " + modelo + " , R$" + i + ".");
		}
		return 0;
	}





	
	
	

}
