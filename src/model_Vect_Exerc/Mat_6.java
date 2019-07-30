package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Mat_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[][] mat = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					sum += mat[i][j];
				}
			}
		}

		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", sum);

		int X = sc.nextInt();
		double[] vet = new double[N];
		System.out.print("LINHA ESCOLHIDA: ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				vet[j] = mat[X][j];
			}
			System.out.print(vet[i] + " ");
		}
		System.out.println();

		int Y = sc.nextInt();
		double[] vetCol = new double[N];
		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				vetCol[j] = mat[i][Y];
			}
			System.out.print(vetCol[i] + " ");
		}
		System.out.println();

		System.out.print("DIAGONAL PRINCIPAL: ");
		double[] vetDiag = new double[N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				vetDiag[i] = mat[i][i];
			}
			System.out.print(vetDiag[i] + " ");
		}
		System.out.println();

		double[][] matAlt = new double[N][N];
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0.0) {
					matAlt[i][j] = mat[i][j] * mat[i][j];
				} else {
					matAlt[i][j] = mat[i][j];
				}
				System.out.print(matAlt[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
