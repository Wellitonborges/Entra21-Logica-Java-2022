package br.com.entra21.PrimeiraProva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("---~ Prova ~---");
		System.out.println("");
		System.out.println("Crie um programa que informe o signo do usuário");
		System.out.println("");

		byte dia;
		byte mes;
		String nome ="";

		//cadastronome(nome);

		//System.out.println(nome);
		System.out.println("Olá Por favor Digite seu nome");
		nome = entrada.nextLine();
		
		System.out.println(nome+" Qual o dia do seu aniversario? ");
		dia = entrada.nextByte();

		System.out.println(
				"1 - Janeiro  || 2 - Fevereiro ||  3 - Março || 4 - Abril \n5 -  Maio || 6 - Junho || 7 - Julho || 8 - Agosto\n9 - Setembro || 10 - Outubro || 11 - Novembro || 12 - Dezembro");
		System.out.println("");
		System.out.println("Qual o mes do seu aniversario? ");
		mes = entrada.nextByte();
		//nome = cadastronome(nome);
		switch (mes) {

		case 1:
			
			if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) {
				
			}
				System.out.println("Voce é do signo de Aquario");
			break;

		case 2:
			
			if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) {
				
			}
				System.out.println("Voce é do signo de Peixes");
			break;

		case 3:
			
			if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) {
				
			}
				System.out.println("Voce é do signo de Peixes");
			break;

		case 4:
			
			if ((dia >= 21 && mes == 4) || (dia <= 21 && mes == 5)) {
				
			}
				System.out.println("Voce é do signo de Touro");
			break;

		case 5:
		
			if ((dia >= 22 && mes == 5) || (dia <= 21 && mes == 6)) {
				
			}
				System.out.println("Voce é do signo de Gemeos");
			break;

		case 6:
		
			if ((dia >= 21 && mes == 6) || (dia <= 23 && mes == 7)) {
				
			}
				System.out.println("Voce é do signo de Canser");
			break;

		case 7:
		
			if ((dia >= 24 && mes == 7) || (dia <= 23 && mes == 8)) {
				
			}
				System.out.println("Voce é do signo de Leao ");
			break;

		case 8:
		
			if ((dia >= 24 && mes == 7) || (dia <= 23 && mes == 8)) {
				
			}
				System.out.println("Voce é do signo de Leão");
			break;
		case 9:
	
			if ((dia >= 24 && mes == 9) || (dia <= 23 && mes == 10)) {
				
			}
				System.out.println("Voce é do signo de Libra");
			break;

		case 10:
		
			if ((dia >= 24 && mes == 10) || (dia <= 22 && mes == 11)) {
				
			}
				System.out.println("Voce é do signo de Escorpião ");
			break;

		case 11:
	
			if ((dia >= 23 && mes == 11) || (dia <= 21 && mes == 12)) {
				
			}
				System.out.println("Voce é do signo de Sagitario");
			break;

		case 12:
			
			if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) {
				
			}
			System.out.println("Voce é do signo de Capricornio");
			break;
			
			default:
				System.out.println("Digite um mes valido");
		}


	}


//	public static String cadastronome(String nome1) {
//		Scanner entrada = new Scanner(System.in);
//		nome1 = "";
//		System.out.println("Olá Por favor Digite seu nome");
//		nome1 = entrada.nextLine();
//		return nome1;
//	}
}
