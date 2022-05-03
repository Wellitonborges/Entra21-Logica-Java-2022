package br.com.entra21.Exercicio.Calculo.IMC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

	float peso;
	float altura;
	float calculo;
	
	
	System.out.println("Capturar peso e altura para calcular o IMC e exibir o resultado e em qual faixa de peso ");
	
	System.out.println("Vamos medir seu IMC");
	
	System.out.println("Por favor informe quantos Kg você pesa? ");
		peso = entrada.nextFloat();
		
		
		System.out.println("Informe também qual é sua altura? ");
		altura =entrada.nextFloat();
		
		
		calculo = altura/peso;
		
		if (calculo < 18.5f){
			System.out.println("Voce com IMC "+calculo+"  esta abaixo do peso ideal");
			
		} else if ((calculo>= 18.5f) && (calculo <= 24.9f) ){
			System.out.println("Você esta com IMC "+calculo+"  normal dentro do peso ideal PARABÈNS");
			
		}else if ((calculo >= 25) && calculo <=29.9 ){
			System.out.println("Voê esta com com IMC "+calculo+" Sobreso ");
			
		}else if ((calculo >= 30) && (calculo <= 39.9)){
			System.out.println("Você esta com com IMC "+calculo+"Obesidade");
			
		}else if (calculo >40)  {
			System.out.println("Você esta com obesidade Grave");
			System.out.println("Procure um medico urgente");
		}else {
			
		}
		
		
	

	}

}
