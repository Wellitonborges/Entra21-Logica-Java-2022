package br.com.entra21.CondicionaisIf;

public class Main {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre If");

		if (true) {
			System.out.println("Vai fazer isso quqndo der true");

		}

		System.out.println("Aqui vai acontecer naturalmente pq o codigo segue sempre");

		if (false) {
			// nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}

		byte idade = 17;

		if (idade >= 18) {// é maior de idade?
			// SIm
			System.out.println("é maior de idade");

		}
		
		
		if ((idade>=13)  &&  (idade<18) ) {//é adolecente?  (13~~17)?
			System.out.println("é adolecente");
			
			
			
			
			
		}

	}
}