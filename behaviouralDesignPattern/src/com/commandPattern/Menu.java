package com.commandPattern;

public class Menu {
	public Menu(Win win, Lose lose, int points) {

		if (points >= 100) {
			win.run();
		} else {
			lose.run();
		}

	}

}
