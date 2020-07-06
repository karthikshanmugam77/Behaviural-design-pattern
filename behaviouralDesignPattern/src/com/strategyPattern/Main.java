package com.strategyPattern;

public class Main {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		Student s = new Student();
		
		Context con1 = new Context(t);
		Context con2 = new Context(s);
//		System.out.println(con1);
//		System.out.println(con2);

	}

}
