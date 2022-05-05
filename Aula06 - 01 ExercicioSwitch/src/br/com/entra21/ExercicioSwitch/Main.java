package br.com.entra21.ExercicioSwitch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	byte resposta;
	 System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente.");
	 System.out.println("");
	 System.out.println("1 = Primavera");
	 System.out.println("2 = Outono");
	 System.out.println("3 = Inverno");
	 System.out.println("4 = Verão ");
	 
	 System.out.println("Qual é a sua estação do ano favorita? ");
	 resposta = entrada.nextByte();

	 
	 
	 switch (resposta) {
	 
	 case 1:
		 System.out.println("A primavera é a estação do ano que se segue ao inverno e "
		 		+ "precede o verão e é tipicamente associada ao reflorescimento"
		 		+ " da flora terrestre.");
		 break;
		 
	 case 2:
		 System.out.println("O outono é a estação do ano que sucede o verão e antecede o inverno. ");
		 break;
		 
	 case 3:
		 System.out.println("O inverno é a estação mais fria das quatro estações do ano e é comum que durante esta época.");
		 break;
		 
	 case 4:
		 System.out.println("O verão é uma das quatro estações do ano, caracterizada por ser a estação mais quente. ");
		 break;
	 }
//	 

		System.out.println("Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta\r\n"
				+ "Qual é a sua cor favorita? ");
		String resposta2;
		System.out.println("");

		System.out.println("Verde");
		System.out.println("Azul");
		System.out.println("Amarelo");
		System.out.println("Vermlho");

		System.out.println("Qual cor você prefere?");
		resposta2 = entrada.nextLine();
		resposta2=resposta2.toLowerCase();
		
		
		switch (resposta2) {
		case "verde":
			System.out.println("Verde é legal");
			break;
		case "azul":
			System.out.println("Novembro Azul");
			break;

		case "amarelo":
			System.out.println("Beija Flor amarelo");
			break;

		case "vermelho":
			System.out.println("Vermelho é a cor do sangue");
			break;

		default: {
			System.out.println(
					"Você não escreveu uma opção valida." + "Tente rever o inicio da palavra com letra maiuscula ");
		}

		}

	}
}
