import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		int y;
		y = sc.nextInt();
		System.out.println("Idade: " + y);
		double z;
		z = sc.nextDouble();
		System.out.println("Recebe: " + z);
		char w;
		w = sc.next().charAt(0);
		System.out.println("Primeira letra: " + w);
		sc.close();
	}
}
