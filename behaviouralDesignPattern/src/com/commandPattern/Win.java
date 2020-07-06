package com.commandPattern;

public class Win implements Run{

	@Override
	public void run() {
		Game g = new Game();
		g.win();
		
	}

}
