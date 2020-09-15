
/**
 * Write a description of class goods here.
 *
 * @author (OUAICHOUCHE)
 * @version (1.0)
 */
public class goods
{
  //Les attributs
  
  private double value;
  private String name;
  // Les constructeurs  
  public goods(String name,double value)
    {
        this.name=name;
        this.value=value;
    }
    
  public goods(String name){
      new goods(name,0);
    }
  //Les méthodes
  
  public double getters(){
      return this.value;
    }
    
  public void setters(double x){
      this.value=this.value+x;
    }
    
  public String name(){
      return this.name;
    }
    
  public String toString(){
      return "the goods "+this.name+" costs "+this.value;
    }
  
  public double TTC(){
      return this.value+ (this.value*20) /100;
    }
}
 
