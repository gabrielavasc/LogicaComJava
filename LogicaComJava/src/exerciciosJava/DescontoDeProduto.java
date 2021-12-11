package exerciciosJava;

import java.util.Scanner;

public class DescontoDeProduto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite o valor do produto:");
		double valorDoProduto = scanner.nextDouble();

		System.out.println("Favor  digite a quantidade do produto que deseja:");
		int quantidadeDoProduto = scanner.nextInt();

		double subtotal = valorDoProduto * quantidadeDoProduto;

		double valorASerPago;

		if (quantidadeDoProduto > 10) {

			valorASerPago = (0.9 * subtotal);
		} else {

			valorASerPago = (1 * subtotal);

		}

		scanner.close();

		System.out.println("Valor total a ser pago: " + valorASerPago);
	}

}
