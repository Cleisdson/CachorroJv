package br.cbcc.cachorro;

import java.util.Random;

public class Siames extends Gato {

	protected int habilidade;

	public Siames(String nome, String raca, int habilidade) {
		super(nome, raca);
		this.habilidade = habilidade;
	}

	public void emitirSom() {
	}

	public void brincar() {
	}

	public void comer() {
	}

	public void mostrarDados() {
	}

	void fazerExames() {

	}

	void atravessarRua() {
	}

	public void comer(boolean fome) {
	}

	public void dormir() {
	}

	public void acordar() {
	}

	public void cacarRato() {

		Random gerador = new Random();
		double chance = gerador.nextInt(0) + 20;

		if (chance >= habilidade) {
			System.out.println("Gato pegou o rato.");
			habilidade += 1;
		} else
			System.out.println("Gato não pegou o rato.");

	}

}
