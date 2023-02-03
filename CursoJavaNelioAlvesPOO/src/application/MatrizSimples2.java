package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizSimples2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão da matriz: ");
		int dimensao = sc.nextInt();

		int[][] matriz = new int[dimensao][dimensao];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				// digite no formato de matriz, apertando enter no último elemento da linha
				matriz[i][j] = sc.nextInt();				
			}

		}

		System.out.println();

		System.out.println("Main diagonal: ");

		for (int i = 0; i < matriz.length; i++) {

			System.out.print(matriz[i][i] + " ");

		}

		System.out.println();

		int negativeNumbers = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] < 0) {
					negativeNumbers++;
				}

			}

		}

		System.out.println("Negative number: " + negativeNumbers);

		sc.close();

	}

}
