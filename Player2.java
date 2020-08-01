package TickTackToe;

import java.util.Scanner;
//import java.applet.Applet;
//import java.awt.*;




public class Player2 {
	final static Scanner in = new Scanner(System.in);
	final static Game game = new Game();
	final static AI ai = new AI();
	final static Player1 p1 = new Player1();
	final static Board bd = game.bd;
	final static Player2 p2 = new Player2();
	
	public void move() {
		
		
		bd.printBoard();
		
		System.out.println("Select which position you want (1-9):");
		String boardPos = in.nextLine();
		
		
		bd.changeBoard(boardPos, false, true);
		bd.checkIfOWon();
		
		
	}
	
	
	
	public Player2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	
}
