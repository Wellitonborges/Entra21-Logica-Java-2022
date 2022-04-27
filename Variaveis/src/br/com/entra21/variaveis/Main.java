package br.com.entra21.variaveis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		byte idade;
		idade = 30;

		byte Outraidade = 31;

		short ano = 2022;

		short anoPassado;

		anoPassado = 2021;

		System.out.println("Minha idade é " + (idade + Outraidade));

		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil = 212060000;

		System.out.println("No Brasil em " + ano + " temos exatamente " + habitantesBrasil + " habitantes");
		
		long habitanteMundoTerra1500;
		habitanteMundoTerra1500=7900000;
		
		double habitantesAtualmente =790000000.00;
		
		float peso =70.5f, altura=1.72f;
		
		System.out.println("meu peso é "+peso+ " Minha altura é "+altura+".");
		
		char letra='R';
		
		boolean IntervaloAntesdasOito=false;
		boolean IntervaloAgora=true;
		
		String nomeCompleto="";
		
		String nome;
		byte minhaIdade;
		float minhaaltura,salario;
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Por Favor qual é o seu nome?");
		nome = entrada.next();
		
		System.out.println("Me informe sua idade: ");
		minhaIdade = entrada.nextByte();
		
		
		System.out.println("Bem Vindo "+nome+" Agora consigo interagir com usuario");
		System.out.println("Agora ja sei que você tem "+minhaIdade+" Anos de idade.");
		
     	System.out.println(nome+" Para melhor atender preciso saber qual é sua altura");
		altura = entrada.nextFloat();
		
		System.out.println("Então "+nome+" você tem"+minhaIdade+ " e você tem "+altura+" de altura.");
		
		System.out.println("Qual é seu sdalario que pretende Ganhar Programando?");
		salario = entrada.nextFloat();
		
		System.out.println("Então "+nome+ " No Momento Não OCnseguimos Pagar o salario de "+salario+" Para alguem que não sabe programar.");
		System.out.println("Tente aprender mais para conseguirmos Pagar melhor Para você");
		System.out.println("Muito Obrigado bom Aporendizado "+nome);
		
		
		
		
		
		
		
		
	}

}
