package application;

import java.util.Locale;
import java.util.Scanner;

public class TesteCircle {
	
	public static final double PI = 3.14159; // final significa que o valor não muda => constante
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		// calcular circunferência do círculo
		double c = circunference(radius);
		
		// calcular volume do círculo
		double v = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value %.2f%n", PI);
		
		sc.close();
		
	}
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}

}
