package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] product = new String[N];
		double[] buy = new double[N];
		double[] sell = new double[N];
		double totalBuy = 0.0;
		double totalSell = 0.0;
		double profit = 0.0;
		int contA = 0, contB = 0, contC = 0;
		double calcProfit = 0.0, porcet = 0.0;

		for (int i = 0; i < N; i++) {
			product[i] = sc.next();
			buy[i] = sc.nextDouble();
			sell[i] = sc.nextDouble();
			totalBuy = totalBuy + buy[i];
			totalSell = totalSell + sell[i];
		}

		profit = totalSell - totalBuy;

		for (int i = 0; i < N; i++) {

			calcProfit = sell[i] - buy[i];

			porcet = calcProfit / buy[i] * 100.0;

			if (porcet < 10.0) {
				contA++;
			} else if (porcet <= 20.0) {
				contB++;
			} else {
				contC++;
			}

		}

		System.out.println("Lucro abaixo de 10%: " + contA);
		System.out.println("Lucro entre 10% e 20%: " + contB);
		System.out.println("Lucro acima de 20%: " + contC);
		System.out.printf("Valor total de compra: %.2f%n", totalBuy);
		System.out.printf("Valor total de venda: %.2f%n", totalSell);
		System.out.printf("Lucro total: %.2f%n", profit);

		sc.close();
	}

}
