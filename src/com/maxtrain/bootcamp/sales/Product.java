package com.maxtrain.bootcamp.sales;

public class Product {

	private int id;
	private static int nextId = 1;
	private String partNbr;
	private String name;
	private double price;
	
	public Product(String partNbr, String name, double price) {
		this.setId(nextId++);
		this.setPartNbr(partNbr);
		this.setName(name);
		this.setPrice(price);
	}
	
	
	public String toString() {
		return this.getId() + "|" 
							+ getPartNbr() + "|"
							+ getName() + "|"
							+ getPrice();
	}
	public void log() {
		System.out.println(this);
	}
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getPartNbr() {
		return partNbr;
	}
	public void setPartNbr(String partNbr) {
		this.partNbr = partNbr;
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
	
	
	
}
