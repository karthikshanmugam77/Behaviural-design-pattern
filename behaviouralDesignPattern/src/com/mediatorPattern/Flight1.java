package com.mediatorPattern;

public class Flight1 extends Flight {
	int height;

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	int SendAltitute() {
		return height;
	}
	
	

}
