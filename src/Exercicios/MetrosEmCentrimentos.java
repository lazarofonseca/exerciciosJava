package Exercicios;

import java.util.Scanner;

public class MetrosEmCentrimentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tamanho;
		int centrimetros;
		
		System.out.print("Digite o comprimento em metros: ");
		tamanho = entrada.nextInt();
		
		centrimetros = tamanho * 1000;
		System.out.println(tamanho + " metro(s) equivalem a " + centrimetros + " centimetro(s).");

	}

}
