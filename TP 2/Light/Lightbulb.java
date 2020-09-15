
/**
 * Lightbulb st un objet de la vie quotidienne. Il est possible de l’allumer, de l’´eteindre, etc..
 * @author (Salah Zakaria OUAICHOUCHE)
 * @version (a version 1.0)
 */
public class Lightbulb
{
    // instance variables - replace the example below with your own
    private boolean on;
    private String color;
    private double power;
    
    // Constructeur
    
    /**
     * Builds a Lightbulb, initially off, with a color and a power
     */
    public Lightbulb(String color, double power){
        this.on = false;
        this.color = color;
        this.power = power;
    }
    
    /**
     * returns if this Lightbulb is on or off
     * 
     * @return if this Lightbulb is on or off
     */
    public boolean isOn(){
        return this.on;
    }
    
    /**
     * returns the current power
     * 
     * @return the current power
     */
    public double power(){
        return this.power;
    }
    
    /**
     * returns the current color
     * 
     * @return the current color
     */
    public String color(){
        return this.color;
    }
    
    /**
     * turn this Lightbulb on
     */
    public void on(){
        this.on = true;
    }
   
    /**
     * turn this Lightbulb off
     */
    public void off(){
        this.on = false;
    }
    
    /**
     * provide a string representation for this Lightbulb object
     * 
     * @return a string representation for this Lightbulb object
     */
    public String toString(){
    String result = "lighbulb ";
    if (this.on){
        result = result + "is on, ";
    }
    else {
        result = result + "is off, ";
    }
    result = result + "color: "+ this.color + " ,power: " + this.power;
    return result;
    }
}

