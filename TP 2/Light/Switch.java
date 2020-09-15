
/**
 * Write a description of class Switch here.
 *
 * @author (Salah Zakaria OUAICHOUCHE)
 * @version (03.02.2020)
 */
public class Switch
{
    /**
     * the lightbulb to turn on and off
     */
    private Lightbulb lightbulb;
    
    /**
     * Builds a switch for the lightbulb
     */
    public Switch(Lightbulb lightbulb){
       this.lightbulb = lightbulb; 
    }
    
    /**
     * switch on and off the lightbulb
     */
    public void switchOnOff(){
        if (this.lightbulb.isOn()){
            this.lightbulb.off();
        }
        else{
            this.lightbulb.on();
        }
    }
}
