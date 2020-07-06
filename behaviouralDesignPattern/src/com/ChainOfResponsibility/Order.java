package com.ChainOfResponsibility;

public abstract class Order  {
	
	private Order order;
	
	public Order(Order order) {
		this.order = order;
	}
	
	public void process(OrderReq req) {
		//System.out.println("hi");
		if(order != null) {
		order.process(req);}
	}

}
