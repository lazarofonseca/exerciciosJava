package Exercicios;

import java.util.Scanner;

public class AreaDoQuadrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int base, altura, area;
		System.out.print("Digite a base do quadrado: ");
		base = entrada.nextInt();
		System.out.print("Digite a altura do quadrado: ");
		altura = entrada.nextInt();
		
		area = base * altura;
		area = area * 2;
		System.out.print("O dobro da área do quadrado é " + area + "m²");

	}

}
