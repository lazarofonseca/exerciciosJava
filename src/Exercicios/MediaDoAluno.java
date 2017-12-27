package Exercicios;

import java.util.Scanner;

public class MediaDoAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		double media;
		
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextInt();
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextInt();
		System.out.print("Digite a terceira nota: ");
		n3 = entrada.nextInt();
		System.out.print("Digite a quarta nota: ");
		n4 = entrada.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
				System.out.println("A média do aluno é " + media);

	}

}
