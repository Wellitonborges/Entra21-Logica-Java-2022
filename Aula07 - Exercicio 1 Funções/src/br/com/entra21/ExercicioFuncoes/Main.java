package br.com.entra21.ExercicioFuncoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha a op��o que deseja executar :");
		System.out.println("");

		String opcao;

		System.out.println("Quer entrar na calculadora?");
		System.out.println("Sim \nN�o");
		opcao = entrada.nextLine();
	

		switch (opcao.toLowerCase()) {

		case "sim":
			calculoCalcularoda(1,2);
			
		
			break;

		case "n�o":
			System.out.println("Obrigado por Participar.");
			break;
		}

	}

	public static float calculoCalcularoda (float numero1, float numero2) {
		
		Scanner entrada = new Scanner(System.in);
		
		String expresao;
		float resultado;
		
		
		System.out.println("Qual o tipo de opera��o vc deseja fazer?");
		System.out.println("+\n-\n*\n/");
		expresao = entrada.nextLine();
		
		System.out.println("Digite o Primeiro numero para calcular: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Digite Segundo numero para calcular");
		numero2 = entrada.nextFloat();
		
		switch(expresao) {
		
		case "+":
		resultado = numero1 + numero2;
		break;
		
		case "-":
			resultado = numero1 - numero2;
			break;
			
		case "*":
			resultado = numero1 * numero2;
		break;
		
		case "/":
			resultado = numero1 / numero2;
			break;
			
			default:
				System.out.println("Voc� n�o digitou uma op��o valida");
				break;
		}
		
		return numero1;
	}

}
