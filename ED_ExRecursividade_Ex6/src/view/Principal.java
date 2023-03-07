package view;

import controller.SomaFatoriais;

public class Principal {

	public static void main(String[] args) {
		
		SomaFatoriais sf = new SomaFatoriais ();
		
		System.out.println("Soma Fatorial: " + SomaFatoriais.somaFatorial(5));
		
	}

}
