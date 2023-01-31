package entities;

public class Product4 {
	private String name;
	private double price;
	private int quantity;
	
	public Product4() {
		
	}
	
	public Product4(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product4(String name, double price) {
		this.name = name;
		this.price = price;
		// this.quantity = 0; // redundante
		// ou
		//quantity = 0;
	}
	
	//getters and setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	// alteração da quantidade apenas com entrada e saída de produtos
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
					+ String.format("%.2f", price) 
					+ ", " 
					+ quantity + " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
	}
}