package rental;

/**
 * Class SuspiciousRentalAgency
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */ 

public class SuspiciousRentalAgency extends RentalAgency{
	/**
	 * create a agency which imrove cost of vehicle by 10% for people who is under 25 years old
	 */
	public SuspiciousRentalAgency (){
		super();
	}

   /** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the 110% of the rental daily price if under 25 years old or in other case just the rental daily price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		if (client.getAge()<25){
			return (1.1f)*(super.rentVehicle(client,v));
		}
		else {
			return super.rentVehicle(client,v);
		}
	}
}