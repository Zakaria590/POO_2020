package rental;
/**
 * Main of rental
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */ 
public class Main{
  public static void main (String[] args) throws UnknownVehicleException, IllegalStateException{
    SuspiciousRentalAgency agency = new SuspiciousRentalAgency ( );
    Vehicle v1 = new Vehicle ("Peugeot" , "206" , 2001, 2000);
    agency.addVehicle(v1);
    Vehicle v2 = new Vehicle ("Peugeot" , "Mégane3" , 2011, 16000);
    agency.addVehicle(v2);
    Vehicle v3 = new Vehicle ("Hyundai" , "IX35" , 2016, 30000);
    agency.addVehicle(v3);
    Vehicle v4 = new Vehicle ("Tesla" , "CC" , 2016, 120000);
    agency.addVehicle(v4); 
    Vehicle v5 = new Vehicle ("Volswagen" , "CC" , 2014, 40000);
    agency.addVehicle(v5);
    VehicleFilter mpf = new MaxPriceFilter(35000);
    VehicleFilter bf = new BrandFilter("Hyundai");
    AndFilter af = new AndFilter();
    Motorbike mb = new Motorbike ("Suzuki" , "Katana" , 2009, 22000 , 50);
    agency.addVehicle(mb);
    Car cr = new Car ("Mercedes" , "Sprinter" , 2019 , 30000 , 12);
    agency.addVehicle(cr);
    af.addFilter(mpf);
    af.addFilter(bf);
    agency.displaySelection(mpf);
    agency.displaySelection(af);
    Client cl = new Client("Salah Zakaria OUAICHOUCHE", 24);
    System.out.print(cl.getName()+" "+cl.getAge()+" years old ,buy the vehicle [ "+v1+" ] for : ");
    System.out.println(agency.rentVehicle(cl,v1));
  }
}