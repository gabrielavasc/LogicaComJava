package exerciciosJava;

public class Vetor2Dimensoes {

	public static void main(String[] args) {

		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

		Double[] somaDias = new Double[4];

		for (int i = 0; i < mes.length; i++) {

			Double soma = 0.0;

			for (int y = 0; y < mes[i].length; y++) {

				Double dia = mes[i][y];
				soma = soma + dia;

			}

			somaDias[i] = soma;
		}

		Double maior = 0.0;
		int posicao = 0;

		for (int i = 0; i < somaDias.length; i++) {

			if (somaDias[i] > maior) {

				maior = somaDias[i];
				posicao = i + 1;

			}
		}

		System.out.println("O maior valor da soma é: " + maior + " e a semana é a: " + posicao);
	}

}
