package example.util;
/**
 *  In this simple version boxes have different weights, there is no other distinction
 * 
 * @author OUAICHOUCHE 
 * @version 1.0
 */

public class Box {   

    /**
     * creates a Box with given weight 
     * @param weight weight of the created box
     */
    public Box(int weight) {
        this.weight = weight;
    }
    
    // les attributs de la classe Caisse
    /** weight of the box*/
    private int weight;
    
    // les methodes de la classe Caisse 
    /** 
     * Return the weight of the boxe
     * @return Return weight of the box
     */
    public int getWeight() {
        return this.weight;
    }
    /**
     * String aspect of the box
     * @see java.lang.Object#toString()
     * @return a string which give the weight of the box
     */
    public String toString() {
        return "a box of weight "+this.weight;
    }
}
