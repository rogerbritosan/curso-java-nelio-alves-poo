package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionista;

public class Pensao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int quartosAlugados = sc.nextInt();
		String nome = "";
		String email = "";
		int quarto = 0;

		// quartos
		Pensionista[] pensionistas = new Pensionista[10];

		for (int i = 0; i < quartosAlugados; i++) {

			sc.nextLine();
			System.out.print("Name: ");
			nome = sc.nextLine();

			System.out.print("Email: ");
			email = sc.nextLine();

			System.out.print("Room: ");
			quarto = sc.nextInt();

			pensionistas[quarto] = new Pensionista();
			pensionistas[quarto].setName(nome);
			pensionistas[quarto].setEmail(email);
			pensionistas[quarto].setRoom(quarto);

		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < pensionistas.length; i++) {

			if (pensionistas[i] != null) {
				System.out.println(i + ": " + pensionistas[i].getName() + ", " + pensionistas[i].getEmail());
			}

		}

		sc.close();

	}

}
