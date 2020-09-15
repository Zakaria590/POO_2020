package pfc;
import pfc.*;
import pfc.util.*;
import pfc.strategy.*;
/**
 * Main of pfc
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */ 
public class Main{
  public static void main (String[] args){
    Player player1=new Player(new Human(),"Human");
    Player player2=new Player(new RandomChoice(),"Computer");
    Game game = new Game(player1,player2);
    int input = 0;
    while (input <1){
      System.out.println("Input number of rounds ( int superior to 0 )");
      try {
        input=Input.readInt();
      }
      catch (java.io.IOException e){
        System.out.println("Error : "+e+"     ->Retry");
      }
    }
    game.play(input);
  }
}