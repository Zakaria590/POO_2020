package rental;

class UnknownVehicleException extends Exception{
	public UnknownVehicleException(){
		System.out.println("Vehicle don't exist in this agence");
	}
}