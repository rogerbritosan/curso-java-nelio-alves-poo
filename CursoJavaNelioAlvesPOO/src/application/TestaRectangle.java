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
		
		System.out.println("Rectangle area: " + rect.area());
		System.out.println("Rectangle perimeter: " + rect.perimeter());
		System.out.println("Rectangle diagonal: " + rect.diagonal());
		
		System.out.println("Rectangle: " + rect);

	}

}
