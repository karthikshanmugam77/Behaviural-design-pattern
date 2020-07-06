package com.strategyPattern;

public class Context {
	
	public Context(Hello hello) {
		if(hello instanceof Student)
		{
			System.out.println(hello.sayHello());
		}
		else
		{
			System.out.println(hello.sayHello());
		}
	}

}
