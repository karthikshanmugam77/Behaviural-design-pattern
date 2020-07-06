package com.templatePattern;

public abstract class AbstractClass {
	abstract void getName();
	abstract void getStrength();
	abstract void getHod();
	
	public final void details() {
		getName();
		getStrength();
		getHod();
	}

}
