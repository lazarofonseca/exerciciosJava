package Exercicios;

import java.util.Scanner;

public class ConverteTemperatura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int faren;
		double celcius;
		
		System.out.print("Digite a temperatura em farenheith: ");
		faren = entrada.nextInt();
		celcius = (5*(faren - 32)/9);
		System.out.println("A temperatura " + faren + "em celcius é " + celcius);

	}

}
