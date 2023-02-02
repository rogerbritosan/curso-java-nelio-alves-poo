package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0.0;
		double count = 0;

		System.out.print("Digite a quantidade de números do vetor: ");
		int quantidade = sc.nextInt();

		int[] nums = new int[quantidade];

		for (int i = 0; i < nums.length; i++) {

			sc.nextLine();
			System.out.print("Digite um número: ");
			nums[i] = sc.nextInt();

		}

		System.out.println();

		for (double n : nums) {
			if (n % 2 == 0.0) {
				soma += n;
				count++;
			}
		}

		if (count > 0) {
			System.out.printf("Média dos pares: %.1f%n", soma / count);
		} else {
			System.out.println("Nenhum número par.");
		}
		
		sc.close();

	}

}
