package exerciciosJava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite o primeiro valor:");
		double primeiroValor = scanner.nextDouble();

		System.out.println("Favor digite o número referente a operação que deseja: " + "\n" + "1 - soma" + "\n"
				+ "2 - subtração" + "\n" + "3 - multiplicação" + "\n" + "4 - divisão");
		int operacao = scanner.nextInt();

		System.out.println("Favor digite o segundo valor:");
		double segundoValor = scanner.nextDouble();

		if (operacao == 1) {

			double soma = primeiroValor + segundoValor;
			System.out.println("O resultado da operação é: " + soma);

		}

		if (operacao == 2) {

			double subtracao = primeiroValor - segundoValor;
			System.out.println("O resultado da operação é: " + subtracao);

		}

		if (operacao == 3) {

			double multiplicacao = primeiroValor * segundoValor;
			System.out.println("O resultado da operação é: " + multiplicacao);

		}

		if (operacao == 4) {

			double divisao = primeiroValor / segundoValor;
			System.out.println("O resultado da operação é: " + divisao);
		}

		scanner.close();

	}

}
