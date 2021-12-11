package exerciciosJava;

import java.util.Scanner;

public class CalculoDoValorDoTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite o valor do produto:");
		Double valorProduto = scanner.nextDouble();

		System.out.println("Favor  digite o valor que o cliente entregou:");
		Double valorEntreguePeloCliente = scanner.nextDouble();

		Double troco = (valorEntreguePeloCliente - valorProduto);

		System.out.println("Troco:" + troco);

		scanner.close();
	}

}
