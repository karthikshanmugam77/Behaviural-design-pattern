package com.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> FM = new ArrayList<>();
		FM.add("radio city");
		FM.add("suriyan FM");
		FM.add("Hello FM");

		Iterator<String> it = FM.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
