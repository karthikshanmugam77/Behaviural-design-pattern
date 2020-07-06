package com.mediatorPattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter flight-1 height...");
		int height1 = sc.nextInt();
		System.out.println("ENter flight-2 height...");
		int height2 = sc.nextInt();
		
		Flight1 f1 = new Flight1();
		Flight2 f2 = new Flight2();
		f1.setHeight(height1);
		f2.setHeight(height2);
		ControlRoom cr = new ControlRoomImpl();
		System.out.println(cr.sendConfirmation(f1, f2));
		sc.close();
		
	}

}
