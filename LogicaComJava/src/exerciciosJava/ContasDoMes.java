package exerciciosJava;

import java.util.Scanner;

public class ContasDoMes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double total = 0;

		System.out.println("Favor  digite o valor da conta de luz desse m�s:");
		double valorContaDeLuz = scanner.nextDouble();
		total += valorContaDeLuz;

		System.out.println("Favor  digite o valor da conta de �gua desse m�s:");
		double valorContaDeAgua = scanner.nextDouble();
		total += valorContaDeAgua;

		System.out.println("Favor  digite o valor da conta de telefone desse m�s:");
		double valorContaDeTelefone = scanner.nextDouble();
		total += valorContaDeTelefone;

		System.out.println("Favor  digite o valor da mensalidade da escola do seu filho:");
		double valorMensalidadeEscolaDoFilho = scanner.nextDouble();
		total += valorMensalidadeEscolaDoFilho;

		System.out.println("Favor  digite o valor da fatura do cart�o desse m�s:");
		double valorFaturaDoCartao = scanner.nextDouble();
		total += valorFaturaDoCartao;

		System.out.println("Favor  digite o valor dos gastos com supermercado desse m�s:");
		double valorGastosComSupermercado = scanner.nextDouble();
		total += valorGastosComSupermercado;

		System.out.println("O total de contas no m�s �: " + total);

		scanner.close();
	}

}
