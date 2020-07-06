package com.interpreterPattern;

public class RegisterClass implements Register {
	private String name;

	public RegisterClass(String in) {
		this.name = in;
	}

	@Override
	public String interpret(String in) {
		if (in.equalsIgnoreCase("p")) {
			return name +"-"+ true;
		} else {
			return name +"-"+ false;
		}
	}

}
