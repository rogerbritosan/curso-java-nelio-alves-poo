package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int quantidade = sc.nextInt();

		int[] nums = new int[quantidade];

		for (int i = 0; i < nums.length; i++) {
			sc.nextLine();
			System.out.print("Digite o " + (i + 1) + "º número: ");
			nums[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS PARES:");
		String numerosPares = "";
		int count = 0;

		for (int n : nums) {
			if (n % 2 == 0) {
				numerosPares += n + "  ";
				count++;
			}
		}

		System.out.println(numerosPares);
		System.out.println("Quantidade de pares: " + count);

		sc.close();

	}

}
