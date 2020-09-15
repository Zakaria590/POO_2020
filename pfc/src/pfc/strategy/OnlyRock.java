package pfc.strategy;
import pfc.*;
import pfc.strategy.*;
/**
 * Create OnlyRock strategy
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class OnlyRock implements Strategy{
	//Méthode
    /**
     * Return only Choice.ROCK
     * @return Return only Choice.ROCK
     */
	public Choice takeChoice(){
		return Choice.ROCK;
	}
}