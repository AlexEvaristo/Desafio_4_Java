package Desafios;

import java.util.Scanner;

/* 
Desafio 1 – Verificação de Vogal ou Consoante em Java

- Faça um programa em Java que verifique se uma letra digitada é uma vogal ou consoante.
- O programa deverá seguir as seguintes regras:
    - Solicitar ao usuário que insira uma letra.
    - Verificar se o caractere inserido é uma letra do alfabeto.
    - Caso o usuário tenha inserido um caractere válido (ou seja, uma 
    			letra do alfabeto), o programa deverá identificar e informar 
    			se essa letra é uma vogal ou uma consoante.
    - Caso o usuário insira um valor inválido (como números, símbolos ou 
    			mais de um caractere), o programa deverá exibir uma mensagem 
    			de erro, informando que a entrada é inválida e pedindo 
      			para que ele insira apenas uma letra.
*/
public class Desafios1 {

	public static String verificaLetra(String entrada) {

		String[] vogais = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };

		if (entrada.length() == 1) {

			char letra = entrada.charAt(0);

			if (Character.isLetter(letra)) {

				String letraStr = String.valueOf(letra);

				for (String v : vogais) {

					if (letraStr.equals(v)) {

						return "A letra '" + letra + "' é uma vogal.";

					}

				}

				return  "A letra '" + letra + "' é uma consoante.";

			} else {
				
				return "Entrada Inválida! Por favor insira apenas letras do  alfabeto.";
			}

		} else {
			
			return "Entrada Inválida! Por favor insira apenas  um único caractere.";
			
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma Letra: ");
		
		String letraDigitada = scanner.nextLine();
		
		String resultado = verificaLetra(letraDigitada);
		
		System.out.println(resultado);
		
		scanner.close();

	}

}
