package application;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] altura = new double[N];
		
		for(int i = 0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i<N; i++) {
			sum = sum + altura[i];
		}
		
		double mediAltura = sum / N;
		
		int cont = 0;
		for(int i=0; i<N; i++) {
			if(idades[i] < 16) {
				cont +=1;
			}
		}
		
		double perct = cont * 100.0 / N;
		
		System.out.printf("Altura media: %.2f%n", mediAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perct);
		
		sc.close();
	}

}
