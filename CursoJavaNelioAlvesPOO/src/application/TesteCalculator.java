package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class TesteCalculator {
		
	public static void main(String[] args) {
		
		// versão 2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		// calcular circunferência do círculo
		double c = calc.circunference(radius);
		
		// calcular volume do círculo
		double v = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value %.2f%n", calc.PI);
		
		sc.close();
		
	}

}
