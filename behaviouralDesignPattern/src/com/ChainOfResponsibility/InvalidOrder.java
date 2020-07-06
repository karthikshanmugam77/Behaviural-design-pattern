package com.ChainOfResponsibility;

public class InvalidOrder extends Order {

	public InvalidOrder(Order order) {
		super(order);
	}

	public void process(OrderReq req) {
		//System.out.println("Invalid");
		if (req.getCost() < 50) {
			System.out.println("Invalid...");
		} else {
			super.process(req);
		}

	}

}
