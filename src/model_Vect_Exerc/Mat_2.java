package model_Vect_Exerc;

import java.util.Scanner;

public class Mat_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			int sum = 0;
			for(int j=0; j<N; j++) {
				sum = sum + mat[i][j];
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
