package battleship;
import battleship.util.Answer;
import battleship.util.*;

/**
 * Cell which can contain a Ship
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Cell{
    /**
     * creates a cell
     */

    //Attributs

    private boolean shot;
    private Ship ship;

    // constructeur
    /**
     * Create a cell
     */
    public Cell(){
    	this.shot=false;
    }

    //Methodes

    /**
     * Return a ship present in the cell
     * @return Return a ship present in the cell
     */
    public Ship getShip (){
    	return this.ship;
    }

    /**
     *set a ship in cell
     *@param s ship object
     */
    public void setShip (Ship s){
    	this.ship=s;
    }
    /**
     * return True if a ship present in cell else False
     * @return return True if a ship present in cell else False
     */
    public boolean is_Empty(){
    	return this.ship==null;
    }

    /**
     * return True if the cell is already shoot else false
     * @return return True if the cell is already shoot else false
     */
    public boolean is_shot(){
    	return this.shot;
    }
    
    /**
     * return Answer enum in function of what the shoot have do
     * @return Answer enum in function of what the shoot have do
     */
    public Answer shot (){
      if (this.is_shot()){
        return Answer.MISSED;
      }
      this.shot=true;
      if (this.is_Empty()){
        return Answer.MISSED;
      }
      this.ship.hitted();
      if (this.ship.isSunk()){
        return Answer.SUNK;
      }
      else {
        return Answer.HIT;
      }
    }

    /**
     * return Char in function of param defendy and attributs of cell
     * @param  defender if defender affiche defender 
     * @return Char in function of param defendy and attributs of cell
     */
    public char getCharacter(boolean defender){
      if (defender){
        if (this.is_Empty()){
          return '~';
        }
        else if(this.is_shot()){
          return '*';
        }
        else{
          return 'B';
        }
      }
      else {
        if (!this.is_shot()){
          return '.';
        }
        else if (!this.is_Empty()){
          return '*';
        }
        else {
          return '~';
        }
      }
    }
  }
