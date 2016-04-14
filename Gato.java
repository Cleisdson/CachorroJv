package br.cbcc.cachorro;

public abstract class Gato extends Animal {

	protected int vidas;
	protected int instinto;
	protected boolean fome;
	protected boolean dormindo;

	public Gato(String nome, String raca) {
		super(nome, raca);
	}

	public Gato(int vidas, int instinto, boolean fome, boolean dormindo, String nome, String raca) {
		super(nome, raca);
		this.vidas = 9;
		this.instinto = 10;
		this.fome = false;
		this.dormindo = true;
	}

	public void emitirSom() {
		System.out.println("Miau miau");
	}

	public void brincar() {
		if (fome == true)
			System.out.println("Gato nao vai brincar com voce, ele esta com fome.");
		else {
			System.out.println("Gato esta brincando.");
			fome = true;
			System.out.println("Gato esta com fome.");
		}
	}

	public void comer() {
		if (fome == true) {
			System.out.println("Gato esta comendo");
			fome = false;
		} else
			System.out.println("Gato esta cheio");
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Raca: " + raca);
	}
	
	/*
	 * public void dorme(){ if(estado == true) System.out.println(
	 * "Gato esta acordado"); else System.out.println("Gato esta dormindo"); }
	 */

	// ABSTRAÇÃO GATO

	void fazerExames() {
	}

	void atravessaRua(int vidas) {
	}
	
}
