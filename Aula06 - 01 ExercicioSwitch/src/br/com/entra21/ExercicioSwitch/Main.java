package br.com.entra21.ExercicioSwitch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	byte resposta;
	 System.out.println("Exiba em tela uma lista de op��es para o usu�rio escolher e para cada escolha retornar uma mensagem diferente.");
	 System.out.println("");
	 System.out.println("1 = Primavera");
	 System.out.println("2 = Outono");
	 System.out.println("3 = Inverno");
	 System.out.println("4 = Ver�o ");
	 
	 System.out.println("Qual � a sua esta��o do ano favorita? ");
	 resposta = entrada.nextByte();

	 
	 
	 switch (resposta) {
	 
	 case 1:
		 System.out.println("A primavera � a esta��o do ano que se segue ao inverno e "
		 		+ "precede o ver�o e � tipicamente associada ao reflorescimento"
		 		+ " da flora terrestre.");
		 break;
		 
	 case 2:
		 System.out.println("O outono � a esta��o do ano que sucede o ver�o e antecede o inverno. ");
		 break;
		 
	 case 3:
		 System.out.println("O inverno � a esta��o mais fria das quatro esta��es do ano e � comum que durante esta �poca.");
		 break;
		 
	 case 4:
		 System.out.println("O ver�o � uma das quatro esta��es do ano, caracterizada por ser a esta��o mais quente. ");
		 break;
	 }
//	 

		System.out.println("Com o mesmo formato do exerc�cio 1 , agora aceite apenas String como resposta\r\n"
				+ "Qual � a sua cor favorita? ");
		String resposta2;
		System.out.println("");

		System.out.println("Verde");
		System.out.println("Azul");
		System.out.println("Amarelo");
		System.out.println("Vermlho");

		System.out.println("Qual cor voc� prefere?");
		resposta2 = entrada.nextLine();
		resposta2=resposta2.toLowerCase();
		
		
		switch (resposta2) {
		case "verde":
			System.out.println("Verde � legal");
			break;
		case "azul":
			System.out.println("Novembro Azul");
			break;

		case "amarelo":
			System.out.println("Beija Flor amarelo");
			break;

		case "vermelho":
			System.out.println("Vermelho � a cor do sangue");
			break;

		default: {
			System.out.println(
					"Voc� n�o escreveu uma op��o valida." + "Tente rever o inicio da palavra com letra maiuscula ");
		}

		}

	}
}
