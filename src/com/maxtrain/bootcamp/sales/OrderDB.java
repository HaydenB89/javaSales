package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class OrderDB {
	
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addOrderline(Order order, Orderline orderline) throws Exception {
		if(order == null) {
			throw new Exception("Missing order instance");
		}
		order.getOrderLines().add(orderline);
	}
	
	public boolean deleteOrderline(Order order, int id) {
		for(var ol : order.getOrderLines()) {
			if(ol.getId() == id) {
				order.getOrderLines().remove(ol);
				return true;
			}
		}
		return false;
	}
	
	public Order[] getAll() {
		Order[] ords = new Order[orders.size()];
		for(var i = 0; i < orders.size(); i++) {
			ords[i] = orders.get(i);
		}
		return ords;
	}
	
	public Order getByPk(int id) {
		for(var ord : orders) {
			if(ord.getId() == id) {
				return ord;
			}
		}
		return null;
	}
	
	public void add(Order order) {
		orders.add(order);
	}
	
	public boolean delete(int id) {
		var order = getByPk(id);
		if(order == null) {
			return false;
		}
		orders.remove(order);
		return true;
	}
}
