package Exercicios_EstruturaDeSelecao;

import java.util.Scanner;

public class MaiorNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrda = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = entrda.nextInt();
		System.out.println("Digite outro número: ");
		int n2 = entrda.nextInt();
		
		if (n1 > n2){
			System.out.println("O maior número é " + n1);
		}else if (n2 > n1){
			System.out.println("O maior número é " + n2);
		}else{
			System.out.println("Os números " + n1 + " e " + n2 + " são iguais");
			System.exit(0);
		}
		

	}

}
