package Exercicios;

import java.util.Scanner;

public class SalarioHora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		double valorDaHoraTrabalhada;
		int horaTrabalhada;
		
		System.out.print("Qual o valor da hora trabalhada: ");
		valorDaHoraTrabalhada = entrada.nextDouble();
		System.out.print("Quantas horas trabalhada no mês: ");
		horaTrabalhada = entrada.nextInt();
		
		salario = horaTrabalhada * valorDaHoraTrabalhada;
		
		System.out.println("Seu salário esse mês é de R$" + salario + " reais");

	}

}
