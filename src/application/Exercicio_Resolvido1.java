package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvido1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, area, preco, valorTotal;

		System.out.print("Digite a largura: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o preço do metro quadrado: ");
		preco = sc.nextDouble();

		area = largura * comprimento;
		valorTotal = area * preco;
		System.out.println();
		System.out.println("RESULTADO");
		System.out.printf("Valor da área: %.2f%n", area);
		System.out.printf("Preco do terreno: %.2f%n", valorTotal);

		sc.close();
	}

}
