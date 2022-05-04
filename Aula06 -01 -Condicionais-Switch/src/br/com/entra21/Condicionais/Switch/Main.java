package br.com.entra21.Condicionais.Switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Condicionais - Switch");

		System.out.println("Serve para escolher entre opções pre-definidas");
		System.out.println("Geralmente quando há muitos if else ifs baseados em igualdade");

		float altura = 1.5f;

		if (altura == 1.0) {
			System.out.println("é baixinho");
		} else if (altura == 1.2) {
			System.out.println("continua baixinho");
		} else if (altura == 1.5) {
			System.out.println("Baixinho mais nem tanto");
		} else {
			System.out.println("já não é considerado baixinho");
		}

		System.out.println("1 = Intervalo");
		System.out.println("2 = Exercicio");
		System.out.println("3 = Prova");

		Scanner entrada = new Scanner(System.in);

		byte opcao;

		System.out.println("Selecione a opção 3 se tiver coragem");
		System.out.println("Ou escolha qualquer opção");
		opcao = entrada.nextByte();

		switch (opcao) {
		case 1:
			System.out.println("Vamos para o intervalo");
			break;

		case 2:
			System.out.println("Daqui a pouco tem exercicio");
			break;

		case 3:
			System.out.println("Era dia 5 mais podemos fazer hj");
			break;
			}
			String resposta;
			
			System.out.println("Queremos intervalo?");
			resposta = entrada.next();

			switch (resposta) {

			case "sim":
				System.out.println("Vamos para o intervalo...");
				break;

			case "nao":
				System.out.println("DSaqui a pouco tem exercico...");
				break;

			default:
				System.out.println("Era uma pergunta tão simples...");
				break;
			}
			
			
			System.out.println("Escolha um numero");
			System.out.println("1 = azul");
			System.out.println("2 = vermelho");
			System.out.println("nenhuma = nenhuma");
			resposta= entrada.next();
			
			switch(resposta) {
			case "1":
				System.out.println("azul é bom, mas nada contra quem gosta de vermelho");
				break;
			case "2":
				break;
			case "nenhuma":
				break;
			default:
				System.out.println("opção invalida");
				break;
			
			}
			 
		}
	
	
	
	}


