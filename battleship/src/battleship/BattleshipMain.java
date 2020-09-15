	package battleship;
	import battleship.util.*;
	import battleship.*;

	public class BattleshipMain{
		public static void main (String[] args){

  		try{

			Sea game = new Sea (5,5);
			game.addShipVertically(new Ship (3), new Position(0,0));
			game.addShipHorizontally(new Ship (2), new Position(0,1));
			System.out.print("life point remaining : "+game.gettotalLF());
			System.out.print("\n");
			game.display(true);
			System.out.print("\n");
			game.display(false);
			System.out.print("\n");
			game.shoot(new Position(3,3));
			game.shoot(new Position(0,0));
			System.out.print("life point remaining : "+game.gettotalLF());
			System.out.print("\n");
			game.display(true);
			System.out.print("\n");
			game.display(false);
			System.out.print("\n");
		}

	catch(IllegalAccessException e){
	System.out.println("Point live Ship<1");
	}
	}
}	
	