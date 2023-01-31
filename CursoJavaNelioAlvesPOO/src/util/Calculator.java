package util;

public class Calculator {
	
	// versão 2
	// nesse caso posso retirar o static

	public final double PI = 3.14159;

	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}

}
