package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return this.width * height;
	}
	
	public double perimeter() {
		return 2 * this.width + 2 * height;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0));
	}
	
	public String toString() {
		return "Largura: " + this.width + " Altura: " + this.height;
	}

}
