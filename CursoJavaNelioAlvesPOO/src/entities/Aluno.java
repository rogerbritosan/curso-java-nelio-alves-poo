package entities;

public class Aluno {

	private String nome;
	private double notaSemestre1;
	private double notaSemestre2;

	public Aluno(String nome, double notaSemestre1, double notaSemestre2) {
		this.nome = nome;
		this.notaSemestre1 = notaSemestre1;
		this.notaSemestre2 = notaSemestre2;
	}

	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaSemestre1() {
		return notaSemestre1;
	}

	public void setNotaSemestre1(double notaSemestre1) {
		this.notaSemestre1 = notaSemestre1;
	}

	public double getNotaSemestre2() {
		return notaSemestre2;
	}

	public void setNotaSemestre2(double notaSemestre2) {
		this.notaSemestre2 = notaSemestre2;
	}
	
	public Boolean mediaNotas() {
		double mediaNotas = (this.notaSemestre1 + this.notaSemestre2) / 2;
		if(mediaNotas > 6.0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " Nota 1: " + this.notaSemestre1 + " nota 2: " + this.notaSemestre2;
	}

}
