package pfc.strategy;
import pfc.*;
import pfc.strategy.*;
/**
 * Create OnlyScissors strategy
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class OnlyScissors implements Strategy{
	//Méthode
    /**
     * Return only Choice.SCISSORS
     * @return Return only Choice.SCISSORS
     */
	public Choice takeChoice(){
		return Choice.SCISSORS;
	}
}