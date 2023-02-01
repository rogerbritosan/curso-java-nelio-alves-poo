package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int quantidade = sc.nextInt();

		double[] nums = new double[quantidade];

		for (int i = 0; i < nums.length; i++) {

			sc.nextLine();
			System.out.print("Digite o " + (i + 1) + "º número: ");
			nums[i] = sc.nextDouble();

		}
		
		String valores = "Valores = ";
		double soma = 0;
		double media;
		
		for(double n : nums) {
			valores += n + " ";
			soma += n;			
		}
		
		System.out.println();
		System.out.println(valores);
		System.out.println("SOMA = " + soma);
		System.out.println("MÉDIA = " + soma / nums.length);

		sc.close();

	}

}
