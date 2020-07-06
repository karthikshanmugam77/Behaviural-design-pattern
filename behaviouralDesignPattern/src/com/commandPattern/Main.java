package com.commandPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your points...");
		int points = sc.nextInt();
		Win win = new Win();
		Lose lose = new Lose();
		
		new Menu (win,lose,points);
		sc.close();

	}

}
