package br.com.entra21.exercicio.aritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 System.out.println("Fa�a um programa que solicite a base e altura de um retangulo e informe sua area e perimetro");
		 System.out.println("Sabendo que a �rea � culculada com base no produto entre base e altura");
		 System.out.println("O perimetro � obtido ao somar todos os vertices do retangulo");
		
		 // criar variaveis 
		 
		 float base,altura,area,perimetro; //boas praticas de nomeclatura
		 
		 Scanner entrada= new Scanner(System.in);
		 
		 //definir valores as variaveis 
		 
		 
		 System.out.println("informe a casa do retangulo ");
		 base = entrada.nextFloat();
		 
		 
		 System.out.println("Informe a altura do retangulo");
		 altura =entrada.nextFloat();
		 
		 // momento de processaento 
		 area = base * altura;
		 perimetro = base * 2 + altura *2;
		 
		 
		 
		 System.out.println("Area � "+base+" + "+altura);
		 System.out.println("Perimetro � "+base+" + "+base+" + "+altura+" + ");
		 System.out.println("O resultado da sua area �: "+area+" , o resultado do perimetro �: "+perimetro);
		 
		 
		
		 
		 
		 

	}

}
