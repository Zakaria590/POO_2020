package pfc.strategy;
import pfc.*;
import pfc.strategy.*;
import java.util.*;
/**
 * Create a Strategy by sequence give in parameter
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

//Constructeur de la stratégie Sequence
public class Sequence implements Strategy{

	//Attributs
	private ArrayList <Choice> seq;
	private int cpt;

	//Constructeur
	/**
	 * Create a Strategy Sequence
	 * @param seq A arraylist of Choice
	 */
	public Sequence ( ArrayList <Choice> seq){
		this.seq=seq;
		this.cpt=-1;
	}

	//Méthode
    /**
     * Return the next Choice
     * @return Return the next Choice
     */
	public Choice takeChoice(){
		this.cpt++;
		if (cpt==seq.size()){
			this.cpt=0;
		}
		return this.seq.get(this.cpt);
	}
}