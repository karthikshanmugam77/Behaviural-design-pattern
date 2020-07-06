package com.ChainOfResponsibility;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Chain chain  = new Chain();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost for your Order....");
		int cost = sc.nextInt();
		chain.process(new OrderReq(cost));
	}
}