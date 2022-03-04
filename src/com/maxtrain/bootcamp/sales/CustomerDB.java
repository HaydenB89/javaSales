package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class CustomerDB {
	//creating an instance of an array that holds 10 items
	//*remember this will go from 0-9
//	private Customer[] customers = new Customer[10];
//	private int index = 0;
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) throws Exception {
		customers.add(customer);
		}
	
//not used in new code	//return an id
//	private int findIndex(int id) {
//		for(var i = 0; i < customers.length; i++) {
//			var cust = customers[i];
//			if(cust == null) {
//				continue;
//			}
//			if(cust.getId() == id) {
//				return i;
//			}
//		}
//		return -1;//not valid index(didn't find one)
//	}
	
	
	//crate new customer
//	public void add (Customer customer) throws Exception {
//		if(index > 9) {
//			throw new Exception("Collection is full!");
//		}
//		customers[index] = customer;
//		index++;
//	}
	
	//delete customer (make null in the array)
	//made it bool to return true/false if customer exits and is deleted
	public boolean delete(int id) {
		var cust = getByPk(id);
//		//created a private method up top to find id index
//		int index = findIndex(id);
//		//customer not found
//		if(index == -1)
		if(cust == null) {
			return false;
		}
		customers.remove(cust);
//		//customer found and deleted by making it null
//		customers[index] = null;
		return true;
	}
	
	//get all
	public Customer[] getAllCustomers() {
//		var custs = new Customer[index];
//		for(var i = 0; i < index; i++) {
//			custs[i] = customers[i];
//		}
//		return custs;
		//using a new syntax
		var custs = new Customer[customers.size()];
			for(var i = 0; i < customers.size(); i++) {
				custs[i] = customers.get(i);
			}
		return custs;	
		//return (Customer[]) customers.toArray();
	}
	
	//get by Id (which is the primary key)
	public Customer getByPk(int id) {
/* no longer need the below syntax since we created the find id up top*/
	/*	//c# foreach loop is java:
		// for(var "create name" : variable)
		for(var cust : customers) {
			//didn't find it move to the next
			if( cust == null ) {
				continue;
			}
			//found the id and show it
			if(cust.getId()== id) {
				return cust;
			}
		}
     */
		//var index = findIndex(id);
		//if(index > -1) {
		//	return customers[index];
		//}
		for(var cust : customers) {
			if(cust.getId() == id) {
				return cust;
			}
		}
		return null; //didn't find it
	}
	
//	public Customer get(int index) throws Exception {
//		if(index < 0 || index > 9) {
//			throw new Exception("Index out of range!");
//		}
//		return customers[index];
//	}

}
