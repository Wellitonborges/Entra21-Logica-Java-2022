package br.com.entra21.lacoDeRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre for");

		Scanner entrada = new Scanner(System.in);
		String opcao;
		System.out.println("Sobre o for escolha uma opção para aprender mais");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for");
		System.out.println(
				"3 - Solicite ao usuário uma quantidade limite e exiba em tela a repetição de 1 até o limite ");
		System.out.println(
				"4 - Solicite ao usuário uma quantidade inicial e final, para exibir em tela a repetição do inicio até o final");
		System.out.println("5 - Solicite ao usuário um valor numero para exibir a contagem regressiva até o zero ");
		System.out.println("6 - Retorne a tabuada do numero escolhido");
		System.out.println("7 -Retornar todas as tabuadas.");
		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {
		case "1", "for simples":
			// função aula for simples
			aulaForSimples();// função do tipo procedimento não tem argumento nem retorno
			break;

		case "2":
			//
		case "for dentro de for":
			aulaForDentrodeFor();// função do tipo procedimento não tem argumento nem retorno
			break;
		case "3":
			exercicioForLimite();
			break;
		case "4":
			exercicioRegressiva();
			break;
		case "5":

			break;
		case "6":
			tabuadaEscolhida();

			break;
		case "7":
			exibirTodasasTabuas();
			break;

		default:
			System.out.println("Escolha uma opção valida");
		}

	}

	public static void aulaForSimples() {
		System.out.println("Aprendendo sobre for simples");
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {
			System.out.println("Repetindo " + contador1);
			System.out.println("~~");
		}
		System.out.println("---------------");

		for (int contador = 1; contador <= 10; contador += 2) {
			System.out.println("reperindo " + contador);
			// System.out.println(contador1);
			// não é possivel usar a variavel contador pois ela so existe no escopo do outro
			// for
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for (int contador = 4; contador <= 10; contador += 2) {
			System.out.println("Contando " + contador);
		}

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		for (int contador = 20; contador >= 1; contador -= 1) {
			System.out.println("Contando ~ " + contador);
		}

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		int numero = 5;
		int contador;
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada  " + contador + " x " + numero + " = " + (contador * numero));
		}
		System.out.println("Olha como o contador ficou " + contador);
	}

	public static void aulaForDentrodeFor() {

		System.out.println("Aprendendo sobre for mais complexa");

		byte nivelMaior = 5, nivelDetalhe = 10;

		for (int contador = 1; contador <= nivelMaior; contador++) {
			System.out.println("Para o nivel maior repetindo pela " + contador + "° vezes");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("\t Para o nivel detalhe repetindo pela " + contadorInterno + "° vezez:");
			}
		}

	}

	public static void exercicioForLimite() {
		Scanner entrada = new Scanner(System.in);
		byte limite;
		System.out.println("Até o numero você quer contar");
		limite = entrada.nextByte();

		for (int contador = 1; contador <= limite; contador++) {
			System.out.println("Sua contagem é : " + contador);

		}

	}

	public static void exercicioRegressiva() {
		Scanner entrada = new Scanner(System.in);
		byte valor;
		System.out.println("Apartir de que numero você quer contar");
		valor = entrada.nextByte();

		for (int contador = valor; contador<= 1; valor--) {
			System.out.println("Sua contagem é : " + valor + "° ");

		}

	}

	public static void exibirTodasasTabuas() {
		Scanner entrada = new Scanner(System.in);
		byte numero = 1;

		for (int contador1 = numero; numero <= 10; numero++) {
			System.out.println("Tabuada do :" + numero);

			for (int contador = numero; contador < 11; contador++) {
				System.out.println(numero + " x " + contador + "= " + (numero * contador));

			}
		}
	}

	public static void tabuadaEscolhida() {
		Scanner entrada = new Scanner(System.in);
		byte numero;
		System.out.println("Qual a tabuada você quer?");
		numero = entrada.nextByte();
 for(int contador = numero; contador <=11; contador ++) {
	 System.out.println(numero+" X "+contador+" : "+(numero*contador));
	 
 }
	}
}
