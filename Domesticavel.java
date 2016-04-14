package br.cbcc.cachorro;

public abstract interface Domesticavel {

	void emitirSom();
	void brincar();
	void comer();
	void comer(boolean estarComFome);
	void dormir();
	void acordar();
	void mostrarDados();
	
}
