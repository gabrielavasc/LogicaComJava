package exerciciosJava;

import java.util.Scanner;

public class PrecoProdutos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite o código do produto:");
		String codigoDoProduto = scanner.next();

		System.out.println("Favor  digite a quantidade do produto:");
		int quantidadeDoProduto = scanner.nextInt();

		if (codigoDoProduto.equals("ABCD")) {

			double precoUnitario = 5.30;
			double valorTotal = precoUnitario * quantidadeDoProduto;
			System.out.println("Total: " + valorTotal);

		}

		else if (codigoDoProduto.equals("XYPK")) {

			double precoUnitario = 6.00;
			double valorTotal = precoUnitario * quantidadeDoProduto;
			System.out.println("Total: " + valorTotal);

		} else {
			System.err.println("Código inválido!");

		}

		scanner.close();

	}

}
