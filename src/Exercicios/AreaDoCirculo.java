package Exercicios;

import java.util.Scanner;

public class AreaDoCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int raio;
		double PI = 3.1415;
		double area;
		
		System.out.println("Digite o raio do circulo: ");
		raio = entrada.nextInt();
		area = PI * (raio * raio);
		System.out.println("A área do cículo é " + area);

	}

}
