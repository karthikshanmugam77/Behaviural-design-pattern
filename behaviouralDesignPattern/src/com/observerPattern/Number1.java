package com.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class Number1 implements Observer{
	private int number1;

	@Override
	public void update(Observable obj, Object arg) {
		if(arg instanceof Integer)
		{
			number1 = (Integer)arg;
			System.out.println("REceived number : " + number1);
		}
		
		
	}

}
