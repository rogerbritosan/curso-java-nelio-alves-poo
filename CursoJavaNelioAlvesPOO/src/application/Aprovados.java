package application;

import java.util.Scanner;

import entities.Aluno;

public class Aprovados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão cadastrados? ");
		int quantidade = sc.nextInt();
		Aluno[] alunos = new Aluno[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			
			sc.nextLine();			
			alunos[i] = new Aluno();
			System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
			alunos[i].setNome(sc.nextLine());
			System.out.print("Digite a primeira nota: ");
			alunos[i].setNotaSemestre1(sc.nextDouble());
			System.out.print("Digite a segunda nota: ");
			alunos[i].setNotaSemestre2(sc.nextDouble());
			
		}
		
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for(Aluno aluno : alunos) {
			if(aluno.mediaNotas()) {
				System.out.println(aluno.getNome());
			}
		}
		
	}

}
