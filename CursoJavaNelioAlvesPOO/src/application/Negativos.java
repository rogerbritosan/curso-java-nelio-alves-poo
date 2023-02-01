package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] nums = new int[n];
		int entradas = 0;

		for (int i = 0; i < nums.length; i++) {

			sc.nextLine();
			System.out.print("Digite um número: ");
			entradas = sc.nextInt();

			nums[i] = entradas;

		}

		System.out.println("Números negativos: ");

		for (int e : nums) {
			if (e < 0) {
				System.out.println(e);
			}
		}

		sc.close();

	}

}
