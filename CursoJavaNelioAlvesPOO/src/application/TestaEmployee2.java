package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class TestaEmployee2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade;
		Employee2 funcionario;

		List<Employee2> funcionarios = new ArrayList<Employee2>();

		System.out.println("How many employees will be registered? ");
		quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {

			sc.nextLine();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("ID: ");
			int id = sc.nextInt();

			while (hasId(funcionarios, id)) {
				System.out.print("Id already taken. Try again: ");
				System.out.print("ID: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			funcionarios.add(new Employee2(id, name, salary));

		}

		System.out.println();

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee2 emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employee2 obj : funcionarios) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
