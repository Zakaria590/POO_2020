package rental;

/**
 * Class Motorbike
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */ 

public class Motorbike extends Vehicle{

	private int cyl;

	/**
	 * create a motorbike wih are vehicle with given informations
	 * 
	 * @param brand
	 *            the vehicle's brand
	 * @param model
	 *            the vehicle's model
	 * @param productionYear
	 *            the vehicle's production year
	 * @param dailyRentalPRice
	 *            the daily rental price
	 * @param cyl
	 *		  the cylindre of the Motorbike
	 */
	public Motorbike (String brand, String model, int productionYear, float dailyRentalPRice,int cyl){
		super(brand, model, productionYear, dailyRentalPRice);
		this.cyl=cyl;
	}

	public String toString(){
		return super.toString() + " " + this.cyl + "cm3";
	}
}