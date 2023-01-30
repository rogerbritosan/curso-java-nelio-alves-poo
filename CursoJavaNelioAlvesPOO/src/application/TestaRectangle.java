package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class TestaRectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();

		System.out.print("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Rectangle area: %.2f%n", rect.area());
		System.out.printf("Rectangle perimeter: %.2f%n", rect.perimeter());
		System.out.printf("Rectangle diagonal: %.2f%n", rect.diagonal());
		
		System.out.println("Rectangle: " + rect);
		
		sc.close();

	}

}
