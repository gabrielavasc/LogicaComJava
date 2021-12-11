package exerciciosJava;

import java.util.Scanner;

public class ContasDoMes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double total = 0;

		System.out.println("Favor  digite o valor da conta de luz desse mês:");
		double valorContaDeLuz = scanner.nextDouble();
		total += valorContaDeLuz;

		System.out.println("Favor  digite o valor da conta de água desse mês:");
		double valorContaDeAgua = scanner.nextDouble();
		total += valorContaDeAgua;

		System.out.println("Favor  digite o valor da conta de telefone desse mês:");
		double valorContaDeTelefone = scanner.nextDouble();
		total += valorContaDeTelefone;

		System.out.println("Favor  digite o valor da mensalidade da escola do seu filho:");
		double valorMensalidadeEscolaDoFilho = scanner.nextDouble();
		total += valorMensalidadeEscolaDoFilho;

		System.out.println("Favor  digite o valor da fatura do cartão desse mês:");
		double valorFaturaDoCartao = scanner.nextDouble();
		total += valorFaturaDoCartao;

		System.out.println("Favor  digite o valor dos gastos com supermercado desse mês:");
		double valorGastosComSupermercado = scanner.nextDouble();
		total += valorGastosComSupermercado;

		System.out.println("O total de contas no mês é: " + total);

		scanner.close();
	}

}
