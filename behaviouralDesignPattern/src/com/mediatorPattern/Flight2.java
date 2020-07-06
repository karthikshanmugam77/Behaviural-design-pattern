package com.mediatorPattern;

public class Flight2 extends Flight {
	private int height;

	@Override
	int SendAltitute() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
