package model_Vect_Exerc;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] altura = new double[N];
		double media = 0.0;
		char[] sexe = new char[N];
		double cont = 0.0;
		int contM = 0;

		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexe[i] = sc.next().charAt(0);
		}

		double altMin = altura[0];
		double altMax = altura[0];

		for (int i = 0; i < N; i++) {
			if (altura[i] < altMin) {
				altMin = altura[i];
			} else if (altura[i] > altMax) {
				altMax = altura[i];
			}
		}

		for (int i = 0; i < N; i++) {
			if (sexe[i] == 'F') {
				media = media + altura[i];
				cont++;
			}
		}

		media = media / cont;

		for (int i = 0; i < N; i++) {
			if (sexe[i] == 'M') {
				contM++;
			}
		}

		System.out.println("Menor altura = " + altMin);
		System.out.println("Maior altura = " + altMax);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + contM);

		sc.close();
	}

}
