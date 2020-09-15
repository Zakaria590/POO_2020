package pfc;
import pfc.*;
import pfc.strategy.*;
/**
 * Create a player
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Player{
    /**
     * Create a battleship game
     */

    //Attributs

    private Strategy strat;
    private String name;
    private int points;

    // constructeur
    /**
     * Create Player
     * @param s Stategy
     * @param n Sting 
     */
    public Player(Strategy s,String n){
        this.strat=s;
        this.name=n;
        this.points=0;
    }
    //Methodes

    /**
     * Start to play
     * @param p int number of points
     */
    public void addPoints (int p){
        this.points+=p;
    }

    /**
     * Return points of player
     * @return Return points of player
     */
    public int getPoints (){
        return this.points;
    }

    /**
     * Return name of player
     * @return Return name of player
     */
    public String getName(){
        return this.name;
    }

    /**
     * Return choice from strategy of player
     * @return Return choice from strategy of player
     */
    public Choice takeChoice(){
        return this.strat.takeChoice();
    }

    /**
     * Return string description of player
     * @return Return string description of player
     */
   public String toString(){
        return "Player "+this.name+" who play with strategy "+this.strat+" have "+this.points+" points";
    }
}