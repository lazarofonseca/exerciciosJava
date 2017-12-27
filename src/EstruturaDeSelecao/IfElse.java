package EstruturaDeSelecao;

import java.util.Scanner;

public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade <= 10){
			System.out.println("É uma criança!");
		}else if (idade > 10 && idade <= 13){
			System.out.println("É um pré-adolescente!");
		}else if (idade > 13 && idade < 18){
			System.out.println("É um adolescente!");
		}else if (idade >= 18 && idade < 60){
			System.out.println("É um adulto!");
		}else{
			System.out.println("Está na melhor idade!");
		}

	}

}
