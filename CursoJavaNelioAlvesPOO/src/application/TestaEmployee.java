package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TestaEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Enter gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Enter tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		System.out.println();
		
		
		

	}

}
