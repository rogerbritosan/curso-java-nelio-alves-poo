package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o número de pessoas: ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		// double vect[] = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
			vect[i] = sc.nextDouble();

		}

		double sum = 0.0;

		for (Double p : vect) {
			// System.out.printf("Altura: %.2f%n", p);

			sum += p;

		}

		double avg = sum / n;

		System.out.println("Average height: " + avg);

		sc.close();

	}

}
