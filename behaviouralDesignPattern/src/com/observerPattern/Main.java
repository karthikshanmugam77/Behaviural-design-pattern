package com.observerPattern;

import java.util.Observable;
import java.util.Scanner;

public class Main extends Observable implements Runnable{
	@Override
	public void run() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number...");
		while(true) {
		int n = sc.nextInt();
		setChanged();
		notifyObservers(n);
		sc.close();
		}
		
	}
	public static void main(String args) {
		Main main = new Main();
		Thread t1 =new Thread(main);
		t1.start();
	}

}
