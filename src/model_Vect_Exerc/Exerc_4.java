package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		double sum = 0.0;
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			sum = sum + vet[i];
		}
		sum = sum / N;
		System.out.printf("%.3f%n", sum);
		
		for(int i=0; i<N; i++) {
			if(vet[i] < sum) {
				System.out.println(vet[i]);
			}
			
		}
			
		
		
		sc.close();
	}

}
