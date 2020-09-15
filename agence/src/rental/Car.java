package rental;

/**
 * Class Car
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */ 

public class Car extends Vehicle{

	private int passengers;

	/**
	 * create a car wih are vehicle with given informations
	 * 
	 * @param brand
	 *            the vehicle's brand
	 * @param model
	 *            the vehicle's model
	 * @param productionYear
	 *            the vehicle's production year
	 * @param dailyRentalPRice
	 *            the daily rental price
	 * @param passengers
	 *		  the capacity of passengers
	 */
	public Car (String brand, String model, int productionYear, float dailyRentalPRice,int passengers){
		super(brand, model, productionYear, dailyRentalPRice);
		this.passengers=passengers;
	}

	public String toString(){
		return super.toString() + " " + this.passengers;
	}
}