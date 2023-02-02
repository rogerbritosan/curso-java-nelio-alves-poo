package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int maisVelho = 0;
		int aux = 0;

		System.out.printf("Quantas pessoas vc vai cadastrar? ");
		int quantidade = sc.nextInt();

		String[] names = new String[quantidade];
		int[] idades = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {

			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			names[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
		}
		
		System.out.println();		
		
		for(int i = 0; i < quantidade; i++) {
			if(idades[i] > maisVelho) {
				maisVelho = idades[i];
				aux = i;
			}
		}
		
		System.out.printf("Pessoa mais velha: %s\n", names[aux]);

	}

}
