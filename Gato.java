package br.cbcc.cachorro;

public abstract class Gato implements Animal {

	public void som(){
		System.out.println("Miau miau");
	}
	public void brinca(){
		System.out.println("Gato esta brincando");
	}
	public void come(){
		System.out.println("Gato esta comendo");	
	}
	public void dorme(){
		System.out.println("Gato esta dormindo");
	}
	public void acorda(){
		System.out.println("Gato esta acordado");
	}
	void nome(){
	}
	void fazerExames(){
	}
	void raca(){
	}
	void atravessaRua(){
	}

protected	
	int vidas;
	int instinto;
	int fome;
	
}
