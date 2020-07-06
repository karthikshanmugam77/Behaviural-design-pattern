package com.templatePattern;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		AbstractClass c1  = new EceDept();
		c1.details();
		System.out.println();
		AbstractClass c2 = new CseDept();
		c2.details();
	}

}
