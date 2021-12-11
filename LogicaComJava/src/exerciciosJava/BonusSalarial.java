package exerciciosJava;

import java.util.Scanner;

public class BonusSalarial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor  digite o faturamento da empresa ano passado:");
		double faturamentoAnoPassado = scanner.nextDouble();

		System.out.println("Favor  digite a meta de faturamento do ano passado:");
		double metaDeFaturamentoAnoPassado = scanner.nextDouble();

		System.out.println("Favor  digite a média do seu salário no ano passado:");
		double mediaSalarioDoFuncionarioAnoPassado = scanner.nextDouble();

		double minimoParaReceberBonus = (0.8 * metaDeFaturamentoAnoPassado);

		if (faturamentoAnoPassado >= metaDeFaturamentoAnoPassado) {

			double bonus = mediaSalarioDoFuncionarioAnoPassado;

			System.out.println("O bônus será de: " + bonus);

		} else if (faturamentoAnoPassado >= minimoParaReceberBonus) {

			double bonus = 0.8 * mediaSalarioDoFuncionarioAnoPassado;

			System.out.println("O bônus será de: " + bonus);

		} else {

			System.out.println("Você não receberá bônus!");

		}

		scanner.close();
	}

}
