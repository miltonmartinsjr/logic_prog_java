package model_Vect_Exerc;

import java.util.Scanner;

public class Mat_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] matA = new int[M][N];
		int[][] matB = new int[M][N];
		int[][] total = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matA[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matB[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				total[i][j] =  matA[i][j] + matB[i][j];
				System.out.print(total[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
