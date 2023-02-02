package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] nums = new double[n];

		for (int i = 0; i < nums.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			nums[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(double num : nums) {
			soma += num;
		}
		
		System.out.println();
		
		System.out.printf("Média do vetor: %.3f%n", soma / nums.length);
		
		System.out.println();
		
		System.out.println("Elementos abaixo da média: ");
		
		for(double num : nums) {
			if(num < (soma / nums.length)) {
				System.out.printf("%.1f%n", num);
			}
		}

		sc.close();

	}

}
