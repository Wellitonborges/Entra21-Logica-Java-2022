package br.com.entra21.ExercicioMedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Capturar 3 notas do aluno para calcular a m�dia e informar se est� aprovado ou reprovado");
		
		float nota1;
		float nota2;
		float nota3;
		float media;
		float calculo;
		
		
		System.out.println("Qual o valor da media? ");
		media = entrada.nextFloat();
	
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		calculo = (nota1 + nota2 + nota3) / 3;
		
		if (calculo < media) {
			System.out.println("Voce esta REPROVADO sua nota ficou em "+calculo+" e para passar voc� precisava de "+media);
			
		} else if(calculo >= media) {
			System.out.println("Voc� esta aprovado sua media � "+calculo);
		} else {
			
		}
	
		
		
		
		
		

	}

}
