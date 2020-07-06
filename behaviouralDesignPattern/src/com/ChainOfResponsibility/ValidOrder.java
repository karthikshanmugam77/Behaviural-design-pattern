package com.ChainOfResponsibility;

public class ValidOrder extends Order {

	public ValidOrder(Order order) {
		super(order);
	}

	public void process(OrderReq req) {
//		System.out.println("valid");
		if (req.getCost() >= 50) {
			System.out.println("Valid ORder...");
		} else {
			super.process(req);
		}
	}

}
