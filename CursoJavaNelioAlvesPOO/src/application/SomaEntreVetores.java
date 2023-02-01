package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaEntreVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int quantidade = sc.nextInt();

		int vectA[] = new int[quantidade];
		int[] vectB = new int[quantidade];
		int[] vectC = new int[quantidade];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < vectA.length; i++) {
			sc.nextLine();
			System.out.print("Digite o número: ");
			vectA[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("Digite os valores do vetor B: ");

		for (int i = 0; i < vectB.length; i++) {
			sc.nextLine();
			System.out.print("Digite o número: ");
			vectB[i] = sc.nextInt();
		}

		System.out.println();

		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}

		for (int n : vectC) {
			System.out.println(n);
		}

	}

}
