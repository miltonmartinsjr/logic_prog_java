package application;

public class Teste_processamento {

	public static void main(String[] args) {

		int x, y;
		x = 5;
		y = 5 * 2;

		System.out.println(x);
		System.out.println(y);
		System.out.println();
		System.out.println("Segundo exemplo usando double:");
		
		double z;
		x = 5;
		z = 5 * 2;

		System.out.println(x);
		System.out.println(z);
		System.out.println();
		System.out.println("Terceiro exemplo usando double:");
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) /2.0 * h;
		
		System.out.println(area);
		
		System.out.println();
		System.out.println("Quarto exemplo usando casting:");
		int a, c;
		double resultado;
		a= 5;
		c = 2;
		
		resultado = (double)a/c;
		System.out.println(resultado);
		System.out.println();
		System.out.println("Quinto exemplo usando casting:");
		
		double d; 
		int e;
		
		d = 5.0;
		e = (int)d;
		
		System.out.println(e);
		
		

	}

}
