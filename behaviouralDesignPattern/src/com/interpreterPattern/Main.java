package com.interpreterPattern;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name...");
		String name = sc.nextLine();
		RegisterClass r = new RegisterClass(name);
		System.out.println("Enter attendance...");
		String str = sc.nextLine();
		String interpret = r.interpret(str);
		System.out.println("Student status " + interpret);
		sc.close();
	}

}
