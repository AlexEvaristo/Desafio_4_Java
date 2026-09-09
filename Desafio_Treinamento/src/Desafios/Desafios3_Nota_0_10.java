package Desafios;

import java.util.Scanner;

public class Desafios3_Nota_0_10 {

	public static Integer pedirNota() {

		Scanner scanner = new Scanner(System.in);

		int nota = -1;
		boolean notaValida = false;

		while (!notaValida) {

			System.out.println("Digite um número de 0 a 10: ");
			String entrada = scanner.nextLine();

			try {
				// Tenta converter o texto para número inteiro
				nota = Integer.parseInt(entrada);

				// Testa se está dentro da faixa de 0 a 10
				if (nota >= 0 && nota <= 10) {

					notaValida = true;
				} else {
					System.out.println("Erro: A nota deve estar entre 0 e 10!");
				}
			} catch (NumberFormatException e) {

				// Cai aqui se o usuário digitar letras, símbolos ou deixar vazio
				System.out.println("Erro: Entrada Inválida! Digite apenas  números.");
			}
			scanner.close();
		}

		return nota;

	}

	public static void main(String[] args) {

		int notaFinal = pedirNota();
		System.out.println("Nota informada com sucesso: " + notaFinal);

	}

}
