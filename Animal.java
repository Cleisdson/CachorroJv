package br.cbcc.cachorro;

public abstract class Animal implements Domesticavel {

	protected int energia;
	protected String nome;
	protected String raca;

	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public void comer() {

	}

	public void brincar() {

	}

}