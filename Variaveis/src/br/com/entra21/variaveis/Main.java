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

		System.out.println("Minha idade � " + (idade + Outraidade));

		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil = 212060000;

		System.out.println("No Brasil em " + ano + " temos exatamente " + habitantesBrasil + " habitantes");
		
		long habitanteMundoTerra1500;
		habitanteMundoTerra1500=7900000;
		
		double habitantesAtualmente =790000000.00;
		
		float peso =70.5f, altura=1.72f;
		
		System.out.println("meu peso � "+peso+ " Minha altura � "+altura+".");
		
		char letra='R';
		
		boolean IntervaloAntesdasOito=false;
		boolean IntervaloAgora=true;
		
		String nomeCompleto="";
		
		String nome;
		byte minhaIdade;
		float minhaaltura,salario;
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Por Favor qual � o seu nome?");
		nome = entrada.next();
		
		System.out.println("Me informe sua idade: ");
		minhaIdade = entrada.nextByte();
		
		
		System.out.println("Bem Vindo "+nome+" Agora consigo interagir com usuario");
		System.out.println("Agora ja sei que voc� tem "+minhaIdade+" Anos de idade.");
		
     	System.out.println(nome+" Para melhor atender preciso saber qual � sua altura");
		altura = entrada.nextFloat();
		
		System.out.println("Ent�o "+nome+" voc� tem"+minhaIdade+ " e voc� tem "+altura+" de altura.");
		
		System.out.println("Qual � seu sdalario que pretende Ganhar Programando?");
		salario = entrada.nextFloat();
		
		System.out.println("Ent�o "+nome+ " No Momento N�o OCnseguimos Pagar o salario de "+salario+" Para alguem que n�o sabe programar.");
		System.out.println("Tente aprender mais para conseguirmos Pagar melhor Para voc�");
		System.out.println("Muito Obrigado bom Aporendizado "+nome);
		
		
		
		
		
		
		
		
	}

}
