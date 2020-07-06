package com.ChainOfResponsibility;

public class Chain {
	
	public Order order;

	public Chain() {
		buildChain();
	}
	
	private void buildChain() {
		order = new ValidOrder(new InvalidOrder(null));
	}
	
	public void process(OrderReq req) {
		order.process(req);
	}

}
