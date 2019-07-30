package application;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		System.out.println("Qual é a sua idade?");
		int idade;
		idade = sc.nextInt();
		System.out.println("Sua idade é: " + idade);
		System.out.println("Digite 9.5 ");
		double a;
		a = sc.nextDouble();
		System.out.println("Voce digitou: " + a + " Se o resultado não for o mesmo, utilise a função Locale");
		System.out.println("Qual o seu genro? (F ou M)");
		char genre;
		genre = sc.next().charAt(0);
		System.out.println(genre);
		
		sc.close();
	}

}
