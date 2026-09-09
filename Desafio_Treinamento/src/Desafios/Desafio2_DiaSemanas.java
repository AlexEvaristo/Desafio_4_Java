package Desafios;

import java.util.Scanner;

public class Desafio2_DiaSemanas {

	public static String verificaDia(String vDia) {

		String[] dia = { "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira",
				"Sábado" };

		if (vDia == null || vDia.trim().isEmpty()) {

			return 	"Digite um valor entre 1 a 7!";
		}

		int nDia = 0;
		
		try {
			// Converter a String receipt em número inteiro
			nDia = Integer.parseInt(vDia);
		} catch (NumberFormatException e) {
			return "Entrada Inválida! Digite apenas números de 1 até 7";
		}
		
		String resultado = "";

		switch (nDia) {

		case 1:
			 resultado =  "Domingo";
			break;

		case 2:
			resultado = "Segunda-Feira";
			break;

		case 3:
			resultado = "Terça-Feira";
			break;

		case 4:
			resultado = "Quarta-Feira";
			break;

		case 5:
			resultado = "Quinta-Feira";
			break;

		case 6:
			resultado = "Sexta-Feira";
			break;

		case 7:
			resultado = "Sábado";
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
		
		return resultado; 
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um número de 1 a 7: ");
		
		String diaDigitado = scanner.nextLine();
		
		String resultado = verificaDia(diaDigitado);
		
		System.out.println(resultado);
		
		scanner.close();
	}

}
