package application;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_MatBD02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		double[][] mat = new double[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double[] vet = new double[M];

		for (int i = 0; i < M; i++) {
			double sum = 0.0;
			for (int j = 0; j < N; j++) {
				sum = sum + mat[i][j];
			}
			vet[i] = sum;
		}

		for (int i = 0; i < M; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}

		sc.close();
	}

}
