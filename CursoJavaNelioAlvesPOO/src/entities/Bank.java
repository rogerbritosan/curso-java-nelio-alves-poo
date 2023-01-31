package entities;

public class Bank {
	
	private int account;
	private String holder;
	private double balance;
	
	public Bank(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Bank(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public int getAccount() {
		return account;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public void setName(String holder) {
		this.holder = holder;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= (value + 5);
	}
	
	public String toString() {
		return "Account " + this.account + ", Holder: " + this.holder + ", " + "Balance: $ " + String.format("%.2f%n", this.balance);
	}

}
