package com.springcore.lifecycle;

public class AlooBonda {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting the price");
		this.price = price;
	}

	public AlooBonda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlooBonda(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "AlooBonda [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("initializing the AloonBonda bean");
	}
	public void destroy() {
		System.out.println("destroying the AlooBonda bean");
	}
}
