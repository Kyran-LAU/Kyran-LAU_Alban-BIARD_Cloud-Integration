package test;

public class MyBurger {
	
	private String name;
	private double price;
	private int promotion;
	private int quantity;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "My Burger [name=" + name + ", price=" + price + ", promotion=" + promotion + ", quantity=" + quantity + "]";
	}
}
