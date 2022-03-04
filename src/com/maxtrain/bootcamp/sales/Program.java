package com.maxtrain.bootcamp.sales;

public class Program {

	public static void main(String[] args) {
		
		var db = new CustomerDB();
		var pdb = new ProductDB();
		var odb = new OrderDB();
		
		var cust1 = new Customer("Test Customer");
		var o1 = new Order("1st Order", cust1);
		
		var pdb1 = new ProductDB();
		var echo = pdb1.getByPartNbr("ECHO");
		var oline = new Orderline(1, echo);
		
		
		var o2 = new Order("2nd Order", cust1);
		var o3 = new Order("3rd Order", cust1);
		
		
		try {
			
			odb.add(o1);
			odb.add(o2);
			odb.add(o3);
			
			for(var ord : odb.getAll()) {
				ord.log();
			}
			
			odb.addOrderline(o1, oline);
			
		} catch(Exception ex) {
			System.out.print(ex.getMessage());
		}
		
		var p1 = new Product("ECHO", "Echo", 100);
		var p2 = new Product("ECHODOT", "Echo Dot", 50);
		var p3 = new Product("FIRETV", "Fire TV", 150);
		
		
		try {
			
			pdb.add(p1);
			pdb.add(p2);
			pdb.add(p3);
			
			for(var prod : pdb.getAll()) {
				prod.log();
			}
			
			var pcode = pdb.getByPartNbr("ECHODOT");
			pcode.log();
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		var cstmr1 = new Customer();
		//cstmr1.log();
		var cstmr2 = new Customer("ACME");
		//cstmr2.log();
		var cstmr3 = new Customer("MAX", "Mason", "OH");
		//cstmr3.log();
		
		
		try {
			db.add(cstmr1);
			db.add(cstmr2);
			db.add(cstmr3);
			
			db.delete(cstmr2.getId());
			
			var customers = db.getAllCustomers();
			for(var c : customers) {
				c.log();
			}
			
			//var cx = db.get(1);
			//cx.log();
			// short form below
			//db.get(0).log();
			
			//change values with set
	/*		var acme = db.get(1);
			acme.setCity("Cincinnati");
			acme.setStateCode("OH");
			acme.log();
			
			var max = db.getByPk(3);
			max.log();
	*/		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
