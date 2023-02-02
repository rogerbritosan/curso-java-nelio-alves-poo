package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Recruta;

public class DadosRecrutas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos recrutas serão cadastrados? ");
		int quantidade = sc.nextInt();
		Recruta[] recrutas = new Recruta[quantidade];
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double somaAlturaMulheres = 0.0;
		int contaMulheres = 0;
		int contaHomens = 0;
		
		for(int i = 0; i < recrutas.length; i++) {
			
			sc.nextLine();
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			recrutas[i] = new Recruta();
			recrutas[i].setAltura(sc.nextDouble());
			System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
			recrutas[i].setGenero(sc.next().charAt(0));
			
		}
		
		for(int i = 0; i < recrutas.length; i++) {
			if(recrutas[i].getAltura() > maiorAltura) {
				maiorAltura = recrutas[i].getAltura();
			}
		}
		
		menorAltura = maiorAltura;
		
		for(int i = 0; i < recrutas.length; i++) {			
			if(recrutas[i].getAltura() < menorAltura) {
				menorAltura = recrutas[i].getAltura();
			}
		}
		
		System.out.printf("Menor altura: %.2f%n", menorAltura);
		System.out.printf("Maior altura: %.2f%n", maiorAltura);
		
		for(Recruta r : recrutas) {
			if(r.getGenero() == 'F') {
				somaAlturaMulheres += r.getAltura(); 
				contaMulheres++;
			} else {
				contaHomens++;
			}
		}
		
		System.out.printf("Média das alturas das mulheres: %.2f%n", somaAlturaMulheres / contaMulheres);
		System.out.printf("Número de homens: %d", contaHomens);
		
		sc.close();
		
		
	}

}
