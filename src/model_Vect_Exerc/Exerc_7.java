package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] name = new String[N];
		double[] noteA = new double[N];
		double[] noteB = new double[N];
		double[] media = new double[N];
		
		for(int i=0; i<N; i++) {
			name[i]=sc.next();
			noteA[i]=sc.nextDouble();
			noteB[i]=sc.nextDouble();
		}
		
		for(int i=0; i<N; i++) {
			media[i] = (noteA[i] + noteB[i]) / 2.0;
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<N; i++) {
			if(media[i] >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
	
		
		
		
		sc.close();
	}

}
