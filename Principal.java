
package br.cbcc.cachorro;

public class Principal {
	
	public static void main(String[] args){
		
		Gatoderua gatoderua = new Gatoderua("Mandachuva","Gato de rua",10);
		Siames siames = new Siames("Garfield","Siames",10);
		Persa persa = new Persa("Snow Bell","Persa");
		Mainecoon mainecoon = new Mainecoon("Tom","Maine Coon");
		Sphynx sphynx = new Sphynx("Bast","Sphynx");
		
		Animal animais[] = new Animal[5]; 
		
//		animais[0] = new Gatoderua();
		
		animais[0] = gatoderua;
		animais[1] = siames;
		animais[2] = persa;
		animais[3] = mainecoon;
		animais[4] = sphynx;
		
		for(int i = 0; i < animais.length; i++){
			animais[i].mostrarDados();
		}
		
		
		
	}
}
