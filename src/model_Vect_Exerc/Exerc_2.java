package model_Vect_Exerc;

import java.util.Scanner;

public class Exerc_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];

		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}

		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (vetA[i] % 2 == 0) {
				vetB[i] = vetA[i];
				cont++;
			}
		}

		for (int i = 0; i < N; i++) {
			if (vetB[i] != 0) {
				System.out.print(vetB[i] + " ");
			} 
		}
		
		System.out.println();
		System.out.println(cont);

		sc.close();
	}

}
