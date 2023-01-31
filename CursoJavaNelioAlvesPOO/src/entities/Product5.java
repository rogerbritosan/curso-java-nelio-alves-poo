package entities;

public class Product5 {
	private String name;
	private double price;
	private int quantity;

	// gerando construtores, getters e setters automaticamente

	public Product5() {

	}

	public Product5(String name, double price, int quantity) {
		// super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product5(String name, double price) {
		// super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}