  
package battleship;
import battleship.util.*;
import battleship.*; 

public class GameMain{
  	public static void main (String[] args){
  	try{
  		
    	Sea sea = new Sea (5,5);
    	sea.addShipVertically(new Ship (3), new Position(0,0));
    	sea.addShipHorizontally(new Ship (2), new Position(0,1));
    	Game game = new Game(sea);
    	game.play();
}

catch(IllegalAccessException e){
	System.out.println("Point live Ship<1");
}


  	}
  }