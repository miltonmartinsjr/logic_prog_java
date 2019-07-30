package application;

import java.util.Scanner;

public class Vet_ForEach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i]= sc.next();
		}
		
		System.out.println("Nomes lidos:");
		
		for(String apelido: nomes) {
			System.out.println(apelido);
		}
		
		sc.close();
	}

}
