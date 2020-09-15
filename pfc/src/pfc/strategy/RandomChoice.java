package pfc.strategy;
import java.util.*;
import pfc.*;
import pfc.strategy.*;
/**
 * Create Random strategy
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

//Constructeur de la stratégie RandomChoice
public class RandomChoice implements Strategy{

	//Attribut
	private ArrayList <Choice> lst;

	//Constructeur
	/**
	 * Create a Strategy RandomChoice
	 */
	public RandomChoice (){
		ArrayList <Choice> list = new ArrayList <Choice> ();
		list.add(Choice.ROCK);
		list.add(Choice.PAPER);
		list.add(Choice.SCISSORS);
		this.lst=list;
	}

	//Méthode
    /**
     * Return a random Choice
     * @return Return a random Choice
     */
	public Choice takeChoice(){
		int randomNum = new Random().nextInt(3);
		return this.lst.get(randomNum);
	}
}