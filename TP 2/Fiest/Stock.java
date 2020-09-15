
/**
 * Write a description of class Stock here.
 *
 * @author (OUAICHOUCHE)
 * @version (1.0)
 */
public class Stock {   
    /**
     * Gere un stock
     *
     *@param quantity La quantité du livre
     */
    
    //Les attributs de la classe Stock
    private int quantity;
    
    //Les constructeurs de la classe Stock
    
    public Stock(int x){
        this.quantity=x;
    }
    
    public Stock(){
        new Stock(0);
    }
    
    //Les méthodes de classe Stock
    
    /**
     * Return the quantity of this stock
     * 
     * @return the quantity of this stock 
     */
    public int getQuantity(){
        return this.quantity;
    }
    
    /**
     * Add the parameter at the quantity of this stock
     */
    public void add(int x ){
        this.quantity = this.quantity + x;
    }
    
    /**
     * Remove the parameter at the quantity of this stock
     * 
     * @return Return the quantity remove in stock
     */
    public int remove(int x ){
        if (this.quantity < x){
            int b = this.quantity;
            this.quantity = 0;
            return (b);}
        this.quantity = this.quantity - x;
        return x;
    }
    
    /**
     * Return the quantity in string
     * 
     * @return Return the quantity in string
     */
    public String toString(){
        return "the stock's quantity is "+this.quantity;
    }
}   
