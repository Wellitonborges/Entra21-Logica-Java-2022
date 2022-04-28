package br.com.entra21.operadores.igualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores de Igualdade");
		System.out.println("Igual == ");

		byte idadeA,idadeB;
		boolean resultado;
	
		
		idadeA=5;
		idadeB=10;
		
		resultado=idadeA==idadeB;
		
		System.out.println("Ao comparar a igualdade resultou em "+resultado);

		resultado =idadeA !=idadeB;
		
		System.out.println("Ao comparar a desigualdade resultou em "+resultado);
		
		
		
	}

}
