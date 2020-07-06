package com.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class Number2 implements Observer{
	
	private int number2;

	@Override
	public void update(Observable obj, Object arg) {
		if(arg instanceof Integer)
		{
			number2 = (Integer)arg;
			System.out.println("REceived number : " + number2);
		}
		
		
	}
	

}
