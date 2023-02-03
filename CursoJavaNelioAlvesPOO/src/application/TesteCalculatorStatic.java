package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorStatic;

public class TesteCalculatorStatic {

	public static void main(String[] args) {

		// versão 3

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// utilizando membros estáticos da CalculatorStatic, não preciso estanciá-los
		// Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		// calcular circunferência do círculo
		double c = CalculatorStatic.circunference(radius);

		// calcular volume do círculo
		double v = CalculatorStatic.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value %.2f%n", CalculatorStatic.PI);

		sc.close();

	}

}
