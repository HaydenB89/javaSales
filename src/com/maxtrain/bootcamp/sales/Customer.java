package com.maxtrain.bootcamp.sales;

public class Customer {

	private int id;
	private static int nextId=1; //generates new id within each new constructor loop
	private String name;
	private String city;
	private String stateCode;
	private boolean active;
	private double sales;
	
	//base constructor for no parameters set
	public Customer () {
		this("New Customer");
	}
	//Single String constructor 
	public Customer(String name) {
		this(name, "NA", "NA");
	}
	//detailed constructor with all info
	public Customer(String name, String city, String stateCode) {
		this.setId(nextId++);//uses the static property to generate new id's
		this.setName(name);//calls the string name
		this.setCity(city);//calls the string city
		this.setStateCode(stateCode);//calls the string state
		this.setActive(true);//boolean
		this.setSales(0);//default 0
	}
	
	public String toString() {
		return this.getId() + "|" + this.getName()
		        + "|" + this.getCity() 
		        + "|" + this.getStateCode()
		        + "|" + this.isActive()
		        + "|" + this.getSales();
	}
	//call a print-out of "this" class (a log)
	public void log() {
		System.out.println(this);
	}
	
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getSales() {
		return sales;
	}
	private void setSales(double sales) {
		this.sales = sales;
	}
	
	
}
