package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class TestaBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char ans = sc.next().charAt(0);
		
		double deposit;
		
		if(ans == 'y') {			
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();			
			bank = new Bank(account, holder, deposit);
		} else {
			bank = new Bank(account, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		bank.deposit(deposit);
		System.out.println("Update account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		System.out.println("Update account data: ");
		System.out.println(bank);
		

	}

}
