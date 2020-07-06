package com.commandPattern;

public class Lose implements Run{

	@Override
	public void run() {
	Game g = new Game();
	g.lose();
		
	}

}
