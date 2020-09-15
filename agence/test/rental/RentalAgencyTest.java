package rental;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RentalAgencyTest {

@Test
  public void testCreation(){
    assertNotNull(new RentalAgency());
  }

  @Test
  public void testRentVehicleOK() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
    ra.addVehicle(v1);
    ra.addVehicle(v2);
    Client c1 = new Client("nom",20);
    Client c2 = new Client("nomPrenom",20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    assertEquals(ra.rentVehicle(c2,v2), 6.5f, 0.00001);
  }

  @Test(expected=UnknownVehicleException.class)
  public void testRentVehicleUnknown() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Client c1 = new Client("nom",20);
    ra.rentVehicle(c1,v1);
  }



  @Test(expected=IllegalStateException.class)
  public void testRentVehicleIllegal1() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    ra.addVehicle(v1);
    Client c1 = new Client("nom", 20);
    Client c2 = new Client("nomPrenom", 20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    ra.rentVehicle(c2,v1);
  }


  @Test(expected=IllegalStateException.class)
  public void testRentVehicleIllegal2() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
    ra.addVehicle(v1);
    ra.addVehicle(v2);
    Client c1 = new Client("nom",20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    ra.rentVehicle(c1,v2);
  }


  @Test
  public void testIsRented() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
    Vehicle v3 = new Vehicle("d", "m", 1, 6.5f);
    Vehicle v4 = new Vehicle("e", "m", 1, 6.5f);
    ra.addVehicle(v1);
    ra.addVehicle(v2);
    ra.addVehicle(v3);
    ra.addVehicle(v4);
    Client c1 = new Client("nom",20);
    Client c2 = new Client("nomPrenom",20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    assertEquals(ra.rentVehicle(c2,v2), 6.5f, 0.00001);
    assertTrue(ra.isRented(v1));
    assertTrue(ra.isRented(v2));
    assertFalse(ra.isRented(v3));
    assertFalse(ra.isRented(v4));
  }

  @Test
  public void testHasRentedAVehicle() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
    ra.addVehicle(v1);
    ra.addVehicle(v2);
    Client c1 = new Client("nom",20);
    Client c2 = new Client("nomPrenom",20);
    Client c3 = new Client("nomEtPrenom",20);
    Client c4 = new Client("nomPlusPrenom",20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    assertEquals(ra.rentVehicle(c2,v2), 6.5f, 0.00001);
    assertTrue(ra.hasRentedAVehicle(c1));
    assertTrue(ra.hasRentedAVehicle(c2));
    assertFalse(ra.hasRentedAVehicle(c3));
    assertFalse(ra.hasRentedAVehicle(c4));
  }


  @Test
  public void testReturnRentedVehicle() throws Exception{
    RentalAgency ra = new RentalAgency();
    Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
    Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
    ra.addVehicle(v1);
    ra.addVehicle(v2);
    Client c1 = new Client("nom",20);
    Client c2 = new Client("nomPrenom",20);
    assertEquals(ra.rentVehicle(c1,v1), 5.0f, 0.00001);
    assertEquals(ra.rentVehicle(c2,v2), 6.5f, 0.00001);

    assertTrue(ra.isRented(v1));
    assertTrue(ra.isRented(v2));
    assertTrue(ra.hasRentedAVehicle(c1));
    assertTrue(ra.hasRentedAVehicle(c2));
    assertEquals(ra.allRentedVehicles().size(), 2);

    ra.returnVehicle(c1);

    assertFalse(ra.isRented(v1));
    assertTrue(ra.isRented(v2));
    assertFalse(ra.hasRentedAVehicle(c1));
    assertTrue(ra.hasRentedAVehicle(c2));
    assertEquals(ra.allRentedVehicles().size(), 1);
  }

    @Test
    public void testReturnUnRentedVehicle() throws Exception{
      RentalAgency ra = new RentalAgency();
      Vehicle v1 = new Vehicle("b", "m", 1, 5.0f);
      Vehicle v2 = new Vehicle("c", "m", 1, 6.5f);
      ra.addVehicle(v1);
      Client c1 = new Client("nom",20);
      Client c2 = new Client("nomPrenom",20);

      assertFalse(ra.hasRentedAVehicle(c1));
      assertFalse(ra.hasRentedAVehicle(c2));
      assertFalse(ra.isRented(v1));
      assertFalse(ra.isRented(v2));
      assertEquals(ra.allRentedVehicles().size(), 0);

      ra.returnVehicle(c1);
      ra.returnVehicle(c2);
    }


	@Test
	public void twoClientObjectsWithSameNameCorrespondsToSameClient() 
					throws IllegalStateException, UnknownVehicleException {
		RentalAgency agency = new RentalAgency();
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		agency.addVehicle(v);
		Client client1 = new Client("Tim Oleon", 25);
		assertEquals(100, agency.rentVehicle(client1, v),0.0001);
		assertTrue(agency.hasRentedAVehicle(client1));
		// client2 corresponds to same client than client1 since names are equals
		Client client2 = new Client("Tim Oleon", 25);
		// then test should succeed
		assertTrue(agency.hasRentedAVehicle(client2));
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}

}
