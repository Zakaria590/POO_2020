package date;
import date.util.*;
/**
 * A date have 3 attributs day, month and year
 * 
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Date {
    /**
     * creates a date
     */

    //Attributs
    private int day;
    private Month month;
    private int year;
    

    //Constructeur
    /**
     * Create a date
     * @param d Day number
     * @param m Month in enum
     * @param y Year
     */
    public Date(int d, Month m, int y){
    	this.day=d;
    	this.month=m;
    	this.year=y;
/*        if (d<1 && d>m.getNbDays(y) && y<1){
            throw new IllegalArgumentException();
        }*/
    }   

    //Methodes

    /**
     * Return the day number of date
     * @return Return the day number of date
     */
    public int getDay(){
        return this.day;
    }

    /**
     * Return the month of date
     * @return Return the month of date
     */
    public Month getMonth(){
        return this.month;
    }

    /**
     * Return the year of date
     * @return Return the year of date
     */
    public int getYear(){
        return this.year;
    }

    /**
     * Return boolean corresponding to the equality or not of the two dates
     * @param o Date object
     * @return Return the true when it's the same date or false when it's not
     */
    public boolean equals(Date o){
        if (this.day==o.getDay() && this.month==o.getMonth() && this.year==o.getYear()){
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Return the char of the date
     * @return Return the char of the date
     */
    public String toString(){
        return "The date is "+this.day+" "+this.month+" "+this.year;
    }

    /**
     * Return number of days between two dates
     * @param d Date object
     * @return Return number of days between two dates
     */
    public int diffInDays(Date d){
        if (this.year==d.getYear()){
            //Same year and same month
            if (this.month.getIndex()==d.getMonth().getIndex()){
                return Math.abs(this.day-d.getDay());
            }
            //Same year
            else {
                int cpt=0;
                if (this.month.getIndex()<d.getMonth().getIndex()){
                    return this.diffBtwnMonths(d);
                }
                else {
                    return d.diffBtwnMonths(this);
                }
            }
        }
        else {
            //Not same year
            if (this.year<d.getYear()){
                return this.diffBtwnYears(d);
            }
            else {
                return d.diffBtwnYears(this);
            }
        }
    }

    //Methode privé de diffInDays
    private int diffBtwnMonths(Date d){
        int cpt= this.month.getNbDays(this.year)-this.day;
        for (Month m : Month.values()){
            if (m.getIndex() > this.month.getIndex()  && m.getIndex() < d.getMonth().getIndex()){
                cpt+=m.getNbDays(this.year);
            }
        }
        return cpt+d.getDay();
    }

    //Methode privé de diffInDays
    private int diffBtwnYears(Date d){
        int cptY=1;
        int cptD=0;
        //Partie 1 chercher à atteindre un jour premier
        if (this.day != 1){
            cptD+=this.getMonth().getNbDays(this.year)-this.day+1;
        }
        //Partie 2 chercher à atteindre janvier
        for (Month m : Month.values()){
            if (m.getIndex()>this.getMonth().getIndex()){
                cptD+=m.getNbDays(this.year);
            }
        }
        while (this.year+cptY != d.getYear()){
            if (this.isBissextile(this.year+cptY)){
                cptD+=366;
            }
            else {
                cptD+=365;
            }
            cptY+=1;
        }
        Date tmp = new Date(1,Month.JANUARY,this.year+cptY);
        return cptD+tmp.diffBtwnMonths(d);
    }


    /**
     * Return the date after the current day
     * @return Return the date after the current day
     */
    public Date tomorrow(){
        //Si fin du mois
        if (this.day==this.month.getNbDays(this.year)){
            //Si fin du dernier mois de l'année
            if (this.month==Month.DECEMBER){
                Date result = new Date(1, Month.JANUARY, this.year+1);
                return result;
            }
            else {
                for (Month m : Month.values()){
                    if ( m.getIndex() == this.month.getIndex()+1){
                        Date result = new Date(1, m, this.year);
                        return result;
                    }
                }
            }
        }
        Date result = new Date(this.day+1, this.month, this.year);
        return result;
    }

        //Methode privé de diffBtwnYears
    private boolean isBissextile(int y){
        if (y%4==0 && y%100!=0){
            return true;
        }
        if (y%400==0){
            return true;
        }
        return false;
    }

    /**
     * Return the x nth date after the current day
     * @param x Number of days after the date
     * @return Return the x nth date after the current day
     * @exception IllegalArgumentException whene x inf a 1
     */
    public Date daysLater(int x)throws IllegalArgumentException{
        if (x<1){
            throw new IllegalArgumentException();
        }
        int cpt = 1;
        Date result=this.tomorrow();
        while (cpt!=x){
            result=result.tomorrow();
            cpt+=1;
        }
        return result;
    }
    
}
