package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão cadastradas? ");
		int quantidade = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[quantidade];

		String nome;
		int idade;
		double altura;

		for (int i = 0; i < pessoas.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			nome = sc.nextLine();

			System.out.print("Digite a idade: ");
			idade = sc.nextInt();

			System.out.print("Digite a altura: ");
			altura = sc.nextDouble();

			pessoas[i] = new Pessoa(nome, idade, altura);

		}

		double somaAlturas = 0.0;
		for (Pessoa p : pessoas) {
			somaAlturas += p.getAltura();
		}

		double mediaAlturas = somaAlturas / pessoas.length;
		System.out.println();

		System.out.printf("Altura média: %.2f%n", mediaAlturas);

		int menoresIdade = 0;
		for (Pessoa p : pessoas) {
			if (p.getIdade() < 16) {
				menoresIdade++;
			}
		}

		double porcentagemMenores = 100 * menoresIdade / pessoas.length;
		System.out.println();

		System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenores + "%");

		for (Pessoa p : pessoas) {
			if (p.getIdade() < 16) {
				System.out.println(p.getNome());
			}
		}
		
		sc.close();

	}

}
