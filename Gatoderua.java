package br.cbcc.cachorro;

import java.util.Random;

public class Gatoderua extends Gato {

	private int carinho;

	public Gatoderua(String nome, String raca, int carinho) {
		super(nome, raca);
		this.carinho = carinho;
	}

	public void emitirSom() {
	}

	public void brincar() {
	}

	public void comer() {
	}

	public void mostrarDados(){
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

	// EXCLUSIVO GATO DE RUA
	public void fugir() {

		Random gerador = new Random();
		double chance = gerador.nextInt(0) + 20;

		System.out.println("Gato foi pra rua.");

		if (chance >= carinho) {
			System.out.println("Gato nao fugiu.");
			carinho += 1;
		} else
			System.out.println("Gato fugiu.");
	}

}