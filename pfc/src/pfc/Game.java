package pfc;
import pfc.*;
import pfc.util.*;
import pfc.strategy.*;
/**
 * Create a pfc game
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Game{
    /**
     * Create a battleship game
     */

    //Attributs

    private Player player1;
    private Player player2;

    // constructeur
    /**
     * Create a battleship game
     * @param j1 Player one : Object Player
     * @param j2 Player two : Object Player
     */
    public Game(Player j1,Player j2){
      this.player1=j1;
      this.player2=j2;
    }
    //Methodes

    /**
     * Return player2
     * @return Return player2
     */
    public Player getPlayer2(){
      return player2;
    }

    /**
     * Return player1
     * @return Return player1
     */
    public Player getPlayer1(){
      return player1;
    }
    /**
     * Start to play
     * @param nbRound Number of rounds for the match
     */
    public void play (int nbRound){
      for (int cpt=0;cpt<nbRound;cpt++){
        this.playOneRound();
      }
      System.out.println(this.player1);
      System.out.println(this.player2);
      if (this.player1.getPoints()==this.player2.getPoints()){
        System.out.println("End of rounds, equality !");
      }
      else if (this.player1.getPoints()>this.player2.getPoints()){
        System.out.println("End of rounds, "+this.player1.getName()+" win !");
      }
      else {
        System.out.println("End of rounds, "+this.player2.getName()+" win !");
      }
    }

    /**
     * Play one round
     */
    public void playOneRound(){
      Choice choice1=this.player1.takeChoice();
      Choice choice2=this.player2.takeChoice();
      System.out.println("Player "+this.player1.getName()+" chooses "+choice1);
      System.out.println("Player "+this.player2.getName()+" chooses "+choice2);
      int res=choice1.compareTo(choice2);
      if (res==-1){
        this.player2.addPoints(2);
        System.out.println("Player "+this.player2.getName()+" win this round and get more 2 points");
      }
      else if (res==1){
        this.player1.addPoints(2);
        System.out.println("Player "+this.player1.getName()+" win this round and get more 2 points");
      }
      else {
        System.out.println("This round is an equality, 1 point for all players");
        this.player1.addPoints(1);
        this.player2.addPoints(1);
      }
      System.out.println("The score is now : For player : "+this.player1.getName()+" = "+this.player1.getPoints()+" and for Player : "+this.player2.getName()+" = "+this.player2.getPoints());
    }
}