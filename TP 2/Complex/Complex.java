
/**
 * Write a description of class Complex here.
 *
 * @author (OUAICHOUCHE)
 * @version (a version 1.0)
 */
public class Complex
{
    // instance variables - replace the example below with your own
    private double real;
    private double img;

    /**
     * Constructor for objects of class Complex
     */
    public Complex(double x, double y)
    {
        this.real =x;
        this.img= y;
        
    }
    public Complex(double x)
    {
        this.real =x;
        this.img=0;
    }

    /**
     * Sets the real part of the complex number
     */
    public void setReal(double x)
    {
        this.real=x;
    }
    
    /**
     * Sets the imaginary part of the complex number
     */
    public void setImg(double y)
    {
        this.img=y;
    }
    
    /**
     * Return the real part of the complex number
     */
    public double get_Real()
    {
        return this.real;
    }
    
    /**
     * Returns the imaginary part of the complex number
     */
    public double get_Img()
    {
        return this.img;
    }
    
    /**
     * adds the complex number another complex number
     */
    public Complex add(Complex O){
        double x =this.real;
        double y =this.img;
        double ox=O.get_Real();
        double oy=O.get_Img();
        
        return new Complex(x+ox,y+oy);
    }



}

