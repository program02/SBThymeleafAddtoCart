package com.exam;

public class Product2 {
	int id;
	String name;
	double price;
	int cartindex;
	
	public int getCartindex() {
		return cartindex;
	}

	public void setCartindex(int cartindex) {
		this.cartindex = cartindex;
	}

	public Product2() {
		super();
	}

	public Product2(int id) {
		super();
		this.id = id;
	}

	public Product2(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
	public Product2(int id, String name, double price, int cartindex) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cartindex = cartindex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
