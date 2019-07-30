package application;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 5000.00;
		
		double x = 10.35784;
		System.out.printf("%.2f\n", x);
		System.out.println("Hello Word!");
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		
	}

}
