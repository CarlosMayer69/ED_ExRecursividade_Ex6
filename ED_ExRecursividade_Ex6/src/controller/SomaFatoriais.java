package controller;

public class SomaFatoriais {

	public SomaFatoriais() {
		super();
	}
	
	public static double somaFatorial(int n){
	    
		// Condição de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    
	    // Chama a função somaFatorial passando n-1
	    // e soma ao resultado 1/n!
	    return somaFatorial(n-1) + (1.0/fatorial(n));
	}

	// Função auxiliar para calcular o fatorial
	public static double fatorial(int n){
	    // Condição de parada: quando n for igual a 1
	    if (n == 1)
	        return 1;
	    // Chama a função fatorial passando n-1
	    // e multiplica numero por n
	    return fatorial(n-1) * n;
	}

}
