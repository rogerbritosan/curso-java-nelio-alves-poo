package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		this.grossSalary += this.grossSalary * percentage / 100;
	}
	
	public String toString() {
		return this.name + ", $ " + String.format("%.2f%n", this.netSalary());
	}

}
