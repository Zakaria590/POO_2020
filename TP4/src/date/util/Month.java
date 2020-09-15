package date.util;
import java.lang.*;
import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * The differents months.
 * 
 * @author OUAICHOUCHE
 *
 */

//Constructeur de l'enum
public enum Month {
	 JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5),
	 JUN(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), 
	 NOVEMBER(11), DECEMBER(12);

	 //Attributs
	private int indexMonth;

	//Methodes de enum

	//Methode privé de l'enum
	private Month(int indexMonth){
		this.indexMonth=indexMonth;
	}
    /**
     * Return index of the month in the year
     * @return Return index of the month in the year
     */
	public int getIndex(){
		return this.indexMonth;
	}

    /**
     * Return the number of days in the current month
     * @param y The current year
     * @return Return number of days in the current month
     */
	public int getNbDays(int y){
		int[] list1 = new int[] {1,3,5,7,8,10,12};
		int[] list2 = new int[] {4,6,9,11};
		if (IntStream.of(list1).anyMatch(x -> x == this.indexMonth)){
			return 31;
		}
		if (IntStream.of(list2).anyMatch(x -> x == this.indexMonth)){
			return 30;
		}
		if (this.isBissextile(y)){
			return 29;
		}
		return 28;
	}

	//Méthode privé de getNbDays
	private static boolean isBissextile(int y){
		if (y%4==0 && y%100!=0){
			return true;
		}
		if (y%400==0){
		}
		return false;
	}
}
