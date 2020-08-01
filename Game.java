package TickTackToe;

//import java.applet.Applet;
//import java.awt.*;

public class Game{
	
	final static Board bd = new Board();
	final static Player1 p1 = new Player1();
	final static Player2 p2 = new Player2();
	final static AI ai = new AI();
	
	public Game() {
		
	}
	
	public static void main(String[] args) {
	
		ai.strategy();
		
		/*
		while(!bd.gameFinished) {
			p1.move();
			p2.move();
		}
		*/
	}

}
