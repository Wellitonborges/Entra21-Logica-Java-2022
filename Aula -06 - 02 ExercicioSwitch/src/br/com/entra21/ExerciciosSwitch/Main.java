package br.com.entra21.ExerciciosSwitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		
		
		System.out.println("Defina como constante a altura minima permitida para entrar em um brinquedo"
				+ " (Atenção a nomenclatura e utilize a constante no IF)");
		System.out.println("");
		
		System.out.println("Nosso brinquedo é permitio altura maxima de 1.5m de altura");
		System.out.println("");
		float alturaminima =1.5f;
		String nome;
		float altura;
		
		System.out.println("Qual o Nome  do Usuaio do brinquedo? ");
		nome = entrada.nextLine();
		
		System.out.println("Ola "+nome+" Seja bem vindo!!!");
		System.out.println(nome+" Por Favor me informe sua altura?");
		altura = entrada.nextFloat();
		
		
		if (altura <= alturaminima){
			System.out.println("Tenha um Otimo divertmento "+nome);
			
		} else if (altura > alturaminima){
				System.out.println("Tivemos um proble "+nome+" sua altura é "+altura+" e a altura permitida"
						+ " é de no maximo  "+alturaminima );
	} else {
		
	}
	}

}
