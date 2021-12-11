package exerciciosJava;

import java.util.Scanner;

public class Frete {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite o valor do produto:");
		double valorDoProduto = scanner.nextDouble();

		if (valorDoProduto < 100) {

			double frete = 15;
			double valorTotalDaCompra = valorDoProduto + frete;
			System.out.println("O valor total da compra (produto + frete) é: " + valorTotalDaCompra);

		} else {

			double frete = 0;
			double valorTotalDaCompra = valorDoProduto + frete;
			System.out.println("O valor total da compra (produto + frete) é: " + valorTotalDaCompra);

		}

		scanner.close();
	}

}
