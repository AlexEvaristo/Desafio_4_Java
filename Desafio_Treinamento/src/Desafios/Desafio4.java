package Desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int intervalo_0_25 = 0;

		int intervalo_26_50 = 0;

		int intervalo_51_75 = 0;

		int intervalo_76_100 = 0;

		while (true) {

			System.out.println("Digite um número (negativo para encerrar): ");

			if (scanner.hasNextInt()) {

				int numero = scanner.nextInt();

				if (numero < 0) {

					break;
				}

				if (numero >= 0 && numero <= 25) {

					intervalo_0_25++;

				} else if (numero >= 26 && numero <= 50) {

					intervalo_26_50++;

				} else if (numero >= 51 && numero <= 75) {

					intervalo_51_75++;

				} else if (numero >= 76 && numero <= 100) {

					intervalo_76_100++;

				} else {

					System.out
							.println("O número " + numero + "está fora do intervalo considerado (0-100) - Ignorado. ");
				}
				
			} else {
				
				System.out.println("Entrada Inválida!, Por favor insira um número inteiro.");
				
				scanner.next();
			}
		}
		
		System.out.println("\nContagem final dos numeros em cada intervalo: ");
		
		System.out.println("Intervalo de  [0-25]: " + intervalo_0_25 + " números(s)" );
		
		System.out.println("Intervalo de  [26-50]: " + intervalo_26_50 + " números(s)" );
		
		System.out.println("Intervalo de  [51-75]: " + intervalo_51_75 + " números(s)" );
		
		System.out.println("Intervalo de  [76-100]: " + intervalo_76_100 + " números(s)" );
		
		scanner.close();
	}
}
