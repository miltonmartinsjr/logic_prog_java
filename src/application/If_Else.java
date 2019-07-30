package application;

import java.util.Locale;
import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, resultado;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		resultado = nota1 + nota2;
		
		if(resultado < 60.00) {
			System.out.printf("NOTA FINAL = %.1f\n", resultado);
			System.out.println("REPROVADO");
		}
		else {
			System.out.printf("NOTA FINAL = %.1f\n", resultado);
		}
		
		
		sc.close();
	}

}
