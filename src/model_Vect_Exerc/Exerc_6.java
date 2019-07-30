package model_Vect_Exerc;

import java.util.Scanner;

public class Exerc_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]name = new String[N];
		int[]idade = new int[N];
		
		for(int i=0; i<N; i++) {
			name[i]=sc.next();
			idade[i]=sc.nextInt();
		}
		
		int aux = idade[0];
		int posit = 0;
		
		for(int i=0; i<N; i++) {
			if(idade[i] > aux) {
				posit++;
			}
		}
		
		System.out.println("A pessoa mais velha: " + name[posit]);
				
		sc.close();
	}

}
