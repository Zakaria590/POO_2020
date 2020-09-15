
/**
 * Modelize a lightstring of lightbulbs
 *
 * @author (OUAICHOUCHE)
 * @version (a version 1.0)
 */
public class LightString
{
    // instance variables - replace the example below with your own
    
    /**
     * the lightbulbs array
     */
    private Lightbulb[] theLightbulbs;
    
    /**
     * the number of the lightbulbs on the lightstring
     */
    private int nblightbulb;
    
    /**
     * the state of the lightstring
     */
    private boolean on;
    
    /**
     * Constructor for objects of class LightString
     * sets lightstring with n number of lightbulbs
     * @param n number of lightbulbs
     */
    public LightString(int n)
    {
        // initialise instance variables
        Lightbulb tab[] = new Lightbulb[n];
        for (int i =1  ; i<n+1 ; i++) {
            tab[i-1] = new Lightbulb();
        }
        this.theLightbulbs = tab;
        this.nblightbulb = n;
        this.on = false;
    }

    /**
     * returns the lightbulb at position i
     * @param i, the position of the lightbulb we want
     * @return the lightbulb, null if the lightbulb at i doesn't exist
     */
    public Lightbulb getLightbulb(int i)
    {
        if (i => this.nblightbulb || i <= 0) {
            return null;
        }
        else {
            return this.theLightbulbs[i];
        }
    }
    
    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index.
     * @param i the number of the lightbulb to be changed (first has number 1)
     * @param theBulb the new lightbulb
     */
    public void changeLightbulb(int i, Lightbulb theBulb) {
        int x= i-1;
        if (0<= x && x<this.nblightbulb){
            this.theLightbulbs[x]= theBulb;
        }
    }
    
    /**
     * switch on and off all lightstring lightbulbs
     */
     public void switchOnOff(){
        if (!(this.on)){
            for (int i=0; i<this.nblightbulb; i++){
                this.theLightbulbs[i].on();
            }
            this.on = true;
        }
        else{
            for (int i=0; i<this.nblightbulb; i++){
                this.theLightbulbs[i].off();
            }
            this.on = false;
        }
    }
    
    
    /**returns the total power consumed by the lightstring
     * @return the total power consumed, 0 if the lightstring is off
     */
    public int getConsumedPower() {
        int sum = 0;
        if (this.on) {
            for (int i=0; i<this.nblightbulb; i++){
                sum+= this.theLightbulbs[i].getPower();
            }
        }
        return sum;
    }
}
