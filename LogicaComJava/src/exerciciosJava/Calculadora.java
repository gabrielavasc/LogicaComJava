package exerciciosJava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor digite o primeiro valor:");
		double primeiroValor = scanner.nextDouble();

		System.out.println("Favor digite o n�mero referente a opera��o que deseja: " + "\n" + "1 - soma" + "\n"
				+ "2 - subtra��o" + "\n" + "3 - multiplica��o" + "\n" + "4 - divis�o");
		int operacao = scanner.nextInt();

		System.out.println("Favor digite o segundo valor:");
		double segundoValor = scanner.nextDouble();

		if (operacao == 1) {

			double soma = primeiroValor + segundoValor;
			System.out.println("O resultado da opera��o �: " + soma);

		}

		if (operacao == 2) {

			double subtracao = primeiroValor - segundoValor;
			System.out.println("O resultado da opera��o �: " + subtracao);

		}

		if (operacao == 3) {

			double multiplicacao = primeiroValor * segundoValor;
			System.out.println("O resultado da opera��o �: " + multiplicacao);

		}

		if (operacao == 4) {

			double divisao = primeiroValor / segundoValor;
			System.out.println("O resultado da opera��o �: " + divisao);
		}

		scanner.close();

	}

}
