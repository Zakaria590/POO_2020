package pfc.strategy;
import pfc.*;
import pfc.strategy.*;
/**
 * Create OnlyPaper strategy
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class OnlyPaper implements Strategy{
	//Méthode
    /**
     * Return only Choice.PAPER
     * @return Return only Choice.PAPER
     */
	public Choice takeChoice(){
		return Choice.PAPER;
	}
}