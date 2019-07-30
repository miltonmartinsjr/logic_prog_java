package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		int sum = 0, cont = 0;
		
		for(int i=0; i<N; i++) {
			vet[i]=sc.nextInt();
			if(vet[i] % 2 == 0) {
				sum = sum + vet[i];
				cont++;
			}
		}
		
		double media = (double) sum / cont;
		System.out.printf("%.1f%n", media);
				
		sc.close();
	}

}
