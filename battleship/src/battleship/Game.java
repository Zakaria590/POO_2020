package battleship;
import battleship.*;
import battleship.util.*;
import battleship.util.Input;
/**
 * Create a battleship game
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Game{
    /**
     * Create a battleship game
     */

    //Attributs

    private Sea sea;

    // constructeur
    /**
     * Create a battleship game
     * @param sea constructe 
     */
    public Game(Sea sea){
      this.sea=sea;
    }
    //Methodes

    /**
     * Start to play with the sea
     */
    public void play (){
      int userX;
      int userY;
      while ( sea.gettotalLF()!=0){
        try {
          this.sea.display(false);
          System.out.println(" give an int for height: ? ");
          userX = Input.readInt();
          System.out.println("read int => " + userX);
          System.out.println(" give an int for width: ? ");
          userY = Input.readInt();
          System.out.println("read int => " + userY);
          Position position = new Position(userX,userY);
          Answer msg = this.sea.shoot(position);
          System.out.println(msg);

        } catch (java.io.IOException e) {
          System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Error : Shoot out of range");
        } catch (IllegalArgumentException e){
          System.out.println(e);
        }
      }
      this.sea.display(false);
      System.out.println("You Win, game end");
    }

}
