package br.com.entra21.ExercicioSwitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Defina como constante a quantidade de notas de um aluno");

		System.out.println("Capture nome e cada uma das notas");
		System.out.println("Calcule a média");

		final float MEDIAFINAL = 7;
		String nome;
		float nota1;
		float nota2;
		float nota3;
	
		System.out.println("Digite Seu Nome: ");
		nome = entrada.next();

		System.out.println(nome+" Digite Sua nota para calcular a media: ");
		nota1 = entrada.nextFloat();
		
		
	}
}
