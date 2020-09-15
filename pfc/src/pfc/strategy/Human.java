package pfc.strategy;
import pfc.*;
import pfc.strategy.*;
import pfc.util.*;
import java.util.*;
/**
 * Create Human strategy which ask input choice
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Human implements Strategy{
	//Attribut
	private ArrayList <Choice> lst;

	//Constructeur
	/**
	 * Create a Strategy Human
	 */
	public Human (){
		ArrayList <Choice> list = new ArrayList <Choice> ();
		list.add(Choice.ROCK);
		list.add(Choice.PAPER);
		list.add(Choice.SCISSORS);
		this.lst=list;
	}

	//Méthode
    /**
     * Return a Choice which choose by player with input
     * @return Return a Choice which choose by player with input
     */
	public Choice takeChoice() {
		int input = -1;
		while (input >2 || input <0){
			System.out.println("Input 0 for ROCK, 1 for PAPER or 2 for SCISSORS");
			try {
				input=Input.readInt();
			}
			catch (java.io.IOException e){
				System.out.println("Error : "+e+"     ->Retry");
			}
		}
		return this.lst.get(input);
	}
}