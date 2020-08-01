package TickTackToe;
/*
 * Player 1 is X's and goes first
 * 
 * 
 */

//import java.applet.Applet;
//import java.awt.*;
import java.util.Scanner;


public class Player1 {
	final Scanner in = new Scanner(System.in);
	final Game game = new Game();
	final Board bd = game.bd;
	
	
	public void move() {
		
		
		bd.printBoard();
		
		System.out.println("Select which position you want (1-9):");
		String boardPos = in.nextLine();
		
		
		bd.changeBoard(boardPos, true, false);
		bd.checkIfXWon();
		
		
	}
	
	
	
	public Player1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
