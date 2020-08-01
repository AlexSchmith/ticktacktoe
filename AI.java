package TickTackToe;

//import java.applet.Applet;
//import java.awt.*;


public class AI
{
	final static Game game = new Game();
	static Board bd = game.bd;
	static Player2 p2 = new Player2();
	static AI ai = new AI();
	
	
	public void move(String position) {
		bd.changeBoard(position,true,false);
		bd.checkIfXWon();
		
	}
	
	
	public void block(String position) {					//Create new block methods one for corners, one for outsides without middle and one with middle
		if((bd.isFourTaken)&&(bd.isFiveTaken)) {
			move("6");
		}
		else if((bd.isTwoTaken)&&(bd.isFiveTaken)) {
			move("8");
		}
		else if((bd.isEightTaken)&&(bd.isFiveTaken)) {
			move("2");
		}
		else if((bd.isSixTaken)&&(bd.isFiveTaken)) {
			move("4");
		}
		else if((bd.isSevenTaken)&&(bd.isFiveTaken)) {
			move("3");
		}
		else if((bd.isThreeTaken)&&(bd.isFiveTaken)) {
			move("7");
		}
		else if((bd.isSevenTaken)&&(bd.isFiveTaken)) {
			move("3");
		}
		else if((bd.isThreeTaken)&&(bd.isFiveTaken)) {
			move("7");
		}
		else if((bd.isSixTaken)&&(bd.isNineTaken)){
			move("3");
		}
		else if(((bd.isTwoTaken)&&(bd.isEightTaken))||((bd.isSixTaken)&&(bd.isFourTaken))||((bd.isThreeTaken)&&(bd.isSevenTaken))) {
			move("5");
		}
		else {
			
			move(position);
		}
		p2.move();
	}


	
	public void ifNineTaken() {
		
		
		int randNum = (int)(Math.random()*2);
		if(randNum == 0) {
			move("3");
			p2.move();
			if(!bd.isTwoTaken) {
				move("2");
				
			}
			else {
				move("7");
				p2.move();
				if(bd.isFourTaken) {
					move("5");
					
				}
				else {
					move("4");
				}
			}
		}
		else {
			move("7");
			p2.move();
			if(!bd.isFourTaken) {
				move("4");
				
			}
			else {
				move("3");
				p2.move();
				if(!bd.isTwoTaken) {
					move("2");
				}
				else {
					move("5");
				}
				
			}
		}
		
		
	}
	
	
	public void ifMidTaken() { //If opposing second move is five
		move("9");
		p2.move();
		if(bd.isTwoTaken){
			move("8");
			p2.move();
			if(!bd.isSevenTaken){
				move("7");
			}
			else{
				move("3");
				p2.move();
				if(!bd.isSixTaken){
					move("6");
				}
				else{
					move("4");
					bd.gameFinished = true;
				}
			}
		}
		else if(bd.isSixTaken){
			move("4");
			p2.move();
			if(!bd.isSevenTaken){
				move("7");
			}
			else{
				move("3");
				p2.move();
				if(!bd.isTwoTaken){
					move("2");
				}
				else{
					move("8");
					bd.gameFinished = true;
				}
			}
		}
		else if(bd.isEightTaken){
			move("2");
			p2.move();
			if(!bd.isThreeTaken){
				move("3");
			}
			else{
				move("7");
				p2.move();
				if(!bd.isFourTaken){
					move("4");
				}
				else{
					move("6");
					bd.gameFinished = true;
				}
			}
		}
		else if(bd.isFourTaken){
			move("6");
			p2.move();
			if(!bd.isThreeTaken){
				move("3");
			}
			else{
				move("7");
				p2.move();
				if(!bd.isEightTaken){
					move("8");
				}
				else{
					move("2");
					bd.gameFinished = true;
				}
			}

		}
		else{

			if(!bd.isThreeTaken) {
				move("3");
				if(bd.isThreeTaken) {
					if(!bd.isTwoTaken) {

						block("2");

					}
					else if(!bd.isSixTaken) {
						block("6");
						if(bd.isThreeTaken){
							move("7");
							block("8");
						}
						else if(bd.isSevenTaken){
							move("3");
							block("2");
						}

					}


				}
				else {

				}
			}
			else if(!bd.isSevenTaken) {
				block("7");
				if(bd.isSevenTaken) {
					if(!bd.isFourTaken) {
						move("4");

					}
					else if(!bd.isEightTaken) {
						move("8");

					}

				}
				else {

				}
			}
		}
		
	}


	public void ifMiddleCornerTaken(){
		move("5");
		p2.move();
		if(bd.isNineTaken){
			if(bd.isEightTaken){
				move("7");
				p2.move();
				if(bd.isFourTaken){
					move("2");
				}
				else if(bd.isThreeTaken){
					move("4");
				}
			}
			else if(bd.isSixTaken){
				move("3");
				p2.move();
				if(bd.isSevenTaken){
					move("2");
				}
				else if(bd.isTwoTaken){
					move("7");
				}
			}
			else {
				if (bd.isTwoTaken) {
					move("7");
					p2.move();
					if(bd.isThreeTaken){
						move("4");
					}
					else if(bd.isFourTaken){
						move("3");

					}
				}
				else if(bd.isFourTaken) {

					move("3");
					p2.move();
					if(bd.isTwoTaken){
						move("7");
					}
					else if(bd.isSevenTaken){
						move("2");
					}
				}
			}
		}
		else {
			move("9");

		}

	}

	public void ifThreeOrSevenIsTaken(){
		move("9");
		p2.move();
		if(bd.isFiveTaken){
			if(bd.isSevenTaken){
				move("3");
				p2.move();
				if(bd.isTwoTaken){
					move("6");
				}
				else if(bd.isSixTaken){
					move("2");
				}
			}
			else if(bd.isThreeTaken){
				move("7");
				p2.move();
				if(bd.isFourTaken){
					move("8");
				}
				else if(bd.isEightTaken){
					move("4");

				}
			}
		}
		else{
			move("5");
		}
	}


	public void strategy() {
		move("1");
		p2.move();
		if(bd.isNineTaken) {
			ifNineTaken();
		}
		else if(bd.isFiveTaken){
			ifMidTaken();
		}
		else if(bd.isThreeTaken||bd.isSevenTaken){
			ifThreeOrSevenIsTaken();
		}
		else{
			ifMiddleCornerTaken();
		}
		
	
	}
	
	
	
	
}
