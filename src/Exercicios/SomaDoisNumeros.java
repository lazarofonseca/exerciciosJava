package Exercicios;

import java.util.Scanner;

public class SomaDoisNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.print("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = entrada.nextInt();
		soma = n1 + n2;
		System.out.println("A soma de " + n1 + " + " + n2 + " é " + soma);

	}

}
