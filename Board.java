package TickTackToe;


/*
 * States: X, O, or Blank
 */

//import java.applet.Applet;
//import java.awt.*;



public class Board {
	
	

	public String one = " ";
	public String two = " ";
	public String three = " ";
	public String four = " ";
	public String five = " ";
	public String six = " ";
	public String seven = " ";
	public String eight = " ";
	public String nine = " ";
	public boolean isOneTaken = false;
	public boolean isTwoTaken = false;
	public boolean isThreeTaken = false;
	public boolean isFourTaken = false;
	public boolean isFiveTaken = false;
	public boolean isSixTaken = false;
	public boolean isSevenTaken = false;
	public boolean isEightTaken = false;
	public boolean isNineTaken = false;
	public boolean xWon = false;
	public boolean oWon = false;
	public boolean gameFinished = false;


	public Board(){

	}
	
	public void changeBoard(String position, boolean isX, boolean isO ) {
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		switch(position) {
			
		
			case "1":{
				if(!isOneTaken) {
					if(isX) {
						one = "X";
					}
					else if(isO) {
						one = "O";
					}
					isOneTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "2":{
				if(!isTwoTaken) {
					if(isX)
						two = "X";
					else if(isO)
						two = "O";
					isTwoTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "3":{
				if(!isThreeTaken) {
					if(isX)
						three = "X";
					else if(isO)
						three = "O";
					isThreeTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "4":{
				if(!isFourTaken) {
					if(isX)
						four = "X";
					else if(isO)
						four = "O";
					isFourTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "5":{
				if(!isFiveTaken) {
					if(isX)
						five = "X";
					else if(isO)
						five = "O";
					isFiveTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "6":{
				if(!isSixTaken) {
					if(isX)
						six = "X";
					else if(isO)
						six = "O";
					isSixTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			
			
			case "7":{
				if(!isSevenTaken) {
					if(isX)
						seven = "X";
					else if(isO)
						seven = "O";
					isSevenTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				
				break;
			}
			case "8":{
				if(!isEightTaken) {
					if(isX)
						eight = "X";
					else if(isO)
						eight = "O";
					isEightTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			}
			case "9":{
				if(!isNineTaken) {
					if(isX)
						nine = "X";
					else if(isO)
						nine = "O";
					isNineTaken = true;	
				}
				else {
					if(isX)
						p1.move();
					else if(isO)
						p2.move();
					
				}
				break;
			
			}
			
			
		}
		printBoard();
		
	}
	
	
	public void printBoard() {
		
		
		System.out.println("         |          |        ");
		System.out.println("    "+ one +"    |   "+ two +"      |   "+ three +"    ");
		System.out.println("         |          |        ");
		System.out.println("        1|         2|       3");
		System.out.println("---------|----------|--------");
		System.out.println("         |          |        ");
		System.out.println("    "+ four +"    |   "+ five +"      |   "+ six +"    ");
		System.out.println("        4|         5|       6");
		System.out.println("---------|----------|--------");         
		System.out.println("         |          |        ");
		System.out.println("    "+ seven +"    |   "+ eight +"      |   "+ nine +"    ");
		System.out.println("         |          |        ");
		System.out.println("        7|         8|       9");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}
	
	
	public void checkIfThreeInRow(String first, String second, String third, String marker) {
		if(marker.equals("X")) {
			if(	(first.equals("X")) && (second.equals("X")) &&  (third.equals("X"))		) {
				xWon = true;
				System.out.println("\n \n \n \n \n \n \n \n X wins. \n \n \n \n \n \n");
				gameFinished = true;
			}
			else {
				gameFinished = false;
				
			}
		}
		else if(marker.equals("O")) {
			 if( (first.equals("O")) && (second.equals("O")) && (third.equals("O")) ) {
				 oWon = true;
				 System.out.println("\n \n \n \n \n \n \n \n \n \n O wins \n \n \n \n \n \n \n \n");
				 gameFinished = true;
			 }
			 else {
				 gameFinished = false;
				 
			 }
		}
		else if((isOneTaken)&&(isTwoTaken)&&(isThreeTaken)&&(isFourTaken)&&(isFiveTaken)&&(isSixTaken)&&(isSevenTaken)&&(isEightTaken)&&(isNineTaken)) {
			gameFinished = true;
			System.out.println("It's a tie.");
		}
		
		
		
		
		
	}
	
	
	public void checkIfXWon() {
		Player1 p1 = new Player1();
		
		checkIfThreeInRow(one,four,seven,"X");
		checkIfThreeInRow(two, five, eight,"X");
		checkIfThreeInRow(three,six, nine,"X");
		
		checkIfThreeInRow(one,two,three,"X");
		checkIfThreeInRow(four,five,six,"X");
		checkIfThreeInRow(seven,eight,nine,"X");
		
		checkIfThreeInRow(one,five,nine,"X");
		checkIfThreeInRow(three,five,seven,"X");
		
		
		
	}
	
	
	public void checkIfOWon() {
		Player1 p1 = new Player1();
		
		checkIfThreeInRow(one,four,seven,"O");
		checkIfThreeInRow(two, five, eight,"O");
		checkIfThreeInRow(three,six, nine,"O");
		
		checkIfThreeInRow(one,two,three,"O");
		checkIfThreeInRow(four,five,six,"O");
		checkIfThreeInRow(seven,eight,nine,"O");
		
		checkIfThreeInRow(one,five,nine,"O");
		checkIfThreeInRow(three,five,seven,"O");
		
	}
	
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
