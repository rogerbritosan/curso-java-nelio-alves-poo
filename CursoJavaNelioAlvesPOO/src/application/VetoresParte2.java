package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Product6;

public class VetoresParte2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade produtos: ");
		int n = sc.nextInt();

		Product6[] vect = new Product6[n];

		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < vect.length; i++) {

			sc.nextLine();

			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();

			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();

			vect[i] = new Product6(name, price);

			sum += vect[i].getPrice();
			avg = sum / vect.length;

		}

		System.out.printf("Average price: %.2f%n", avg);

		sc.close();
	}

}
