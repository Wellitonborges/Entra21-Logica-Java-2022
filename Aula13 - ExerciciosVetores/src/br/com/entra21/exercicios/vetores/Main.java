package br.com.entra21.exercicios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte option;

		do {
			
			System.out.println(escreverMenu());

			// tutilizando do-while, pois me permite entrar no bloco antes de testar a
			// condição de permanenca
			
			option = entrada.nextByte();

			switch (option) {

			case 0:
				System.out.println("Sair");
				System.out.println("Obrigado ate logo");
				break;
			case 1:
				exibirTamanhoVetores();

				break;
			case 2:
				exibirTamanhoVetoresInicializado();

				break;
			case 3:
				usuarioAlimentaVetor();

				break;
			case 4:
				definirTamanhoVetorParaInicializar();

				break;

			case 5:
				vetorInicializadoParaPercorrer();
				break;
			case 6:
				exibirVetorInteiroNaoIniciqalizado();
				break;

			default:
				System.out.println("Atenção no menu escolha uma opção valida\nObrigado!");
				break;
			}

			// caso a condção de permanencia seja true, repita o bloco
		} while (option != 0);// enquanto não for zero , repita

	}

	public static String escreverMenu() {
		
		String menu="";
		menu+="Escolha uma opção de menu de boas Praticas\n";
		menu+="0 - Sair\n";
		menu+="1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu+="2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu+="3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu+="4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\\n\\tDo inicio ao fim\\n\\tDo fim ao inicio\n";
		menu+="5 - Criar um vetor de inteiros inicializado , para percorrer\n";
		menu+="6 - Criar um vetor de inteiros não inicializado";
		menu+="=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
		
		return menu;
	}
	private static void exibirTamanhoVetores() {
		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetordoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("Vetor vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("Vetor vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("Vetor vetorInts tamanho = " + vetorInts.length);
		System.out.println("Vetor vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("Vetor vetorChars tamanho = " + vetorChars.length);
		System.out.println("Vetor vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("Vetor vetordoubles tamanho = " + vetordoubles.length);
		System.out.println("Vetor vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializado() {
		byte vetorBytes[] = { 1, 2, 3, 4, 5, 6 };
		short vetorShorts[] = { 127, 138, 454, 256 };
		int vetorInts[] = { 1101, 1080, 1160, 700 };
		long vetorLongs[] = { 5000, 60465, 5645, 8478 };
		char vetorChars[] = { 15, 5654, 52124, 55413 };
		float vetorFloats[] = { 10.4f, 565.1f, 5414.546f, 65.45f };
		double vetorDoubles[] = { 55165, 651684463, 56825626, 3562562, 5681 };
		boolean vetorBooleans[] = { true, true, false, false };

		System.out.println("Tamanho vetorBytes = " + vetorBytes.length);
		System.out.println("Tamanho vetorShorts = " + vetorShorts.length);
		System.out.println("Tamanho vetorInts = " + vetorInts.length);
		System.out.println("Tamanho vetorLongs = " + vetorLongs.length);
		System.out.println("Tamanho vetorChars = " + vetorChars.length);
		System.out.println("Tamanho vetorFloats = " + vetorFloats.length);
		System.out.println("Tamanho vetorDoubles = " + vetorDoubles.length);
		System.out.println("Tamanho vetorBooleans = " + vetorBooleans.length);

	}

	public static void usuarioAlimentaVetor() {
		Scanner entrada = new Scanner(System.in);

		byte vetorBytes[] = new byte[5];

		for (int count = 0; count < vetorBytes.length; count++) {
			System.out.println("Alimente a posição  " + (count + 1) + " no indice " + count);
			vetorBytes[count] = entrada.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {
		Scanner entrada = new Scanner(System.in);
		byte tamanhoVetor;
		byte vetorBytes[];
		System.out.println("Favor qual o tamanho do vetor que vamos construir?");
		tamanhoVetor = entrada.nextByte();

		vetorBytes = new byte[tamanhoVetor];

		for (int count = 0; count < vetorBytes.length; count++) {

			System.out.println("Informe o valor para o item " + (count + 1) + " no inicio [" + count + "]");
			vetorBytes[count] = entrada.nextByte();
		}

	}

	public static void vetorInicializadoParaPercorrer() {
		byte vetorBytes[] = { 10, 16, 15, 127, 13, 17 };

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println(+vetorBytes[count]);

		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for (byte count = (byte) (vetorBytes.length - 1); count >= 0; count--) {
			// começando com tamanho -1, porque o indice sempre tem um valor a menos por
			// conta do zero
			// condição de permanencia, enquanto meu contador >0 porquer começei com valor
			// alto e estou diminindo. ate o zero
			// como uma repetição decrescente utilizo o decrementono contador
			System.out.println("posição " + count + " " + vetorBytes[count]);
		}
	}

	public static void exibirVetorInteiroNaoIniciqalizado() {
		Scanner entrada = new Scanner(System.in);

		byte vetorBytes[] = new byte[10];
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe o valor do indice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = entrada.next();
			if (resposta.equalsIgnoreCase("Sim")) {

				do {
					System.out.println("Informe um indece valido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte();// se o usuario digitar um valor valido esse index sera usado no meu DO
												// principal, e a logicase reperte

				} while (index < 0 || index >= vetorBytes.length);// A posição escolhida não pode ser menor do que zero
																	// nem o tamanho do vetor ou superior
				// exemplo: o range valido é de 0 a 9; qualquer numero alem disso fica preso
				// nesse loop.
			}
		} while (resposta.equalsIgnoreCase("Sim"));

		for (byte count = 0; count < (vetorBytes.length); count++) {
			System.out.println("VetorBytes [" + vetorBytes[count] + "] ");

		}

	}
}
