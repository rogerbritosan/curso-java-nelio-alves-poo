package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz");
		int linhas = sc.nextInt();

		System.out.print("Digite o número de colunas da matriz");
		int colunas = sc.nextInt();

		System.out.println("Matriz: " + linhas + "," + colunas);

		// matrix
		int[][] matriz = new int[linhas][colunas];

		// inserção de dados
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				sc.nextLine();

				System.out.print("Digite o valor para a posição " + i + "," + j + ":");
				matriz[i][j] = sc.nextInt();

			}

		}
		
		// varrer a matriz
		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				System.out.print(matriz[i][j]);
				matriz[i][j] = sc.nextInt();

			}

		}

		System.out.print("Qual valor procurar? ");
		int x = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
