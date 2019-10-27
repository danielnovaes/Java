import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ProgramaTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Entrar com as medidas do primeiro Trianguo:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entrar com as medidas do segundo Trianguo:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
	
		double areay = y.area();

		System.out.printf("Area Tringualo X: %.4f%n", areax);
		System.out.printf("Area Tringualo Y: %.4f%n", areay);
		
	}

}
