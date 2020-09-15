import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
import battleship.util.Answer;

public class CellTest {

  @Test
  public void testCellCreation(){

    Cell cell=new Cell();
    assertTrue(cell.is_Empty());
  }

  @Test
  public void testSetShip() throws IllegalAccessException{

    Cell cell=new Cell();
    Ship ship=new Ship(5);
    cell.setShip(ship);
    assertFalse(cell.is_Empty());
  }

  @Test
  public void testGetShip() throws IllegalAccessException{
    Cell cell=new Cell();
    Ship ship=new Ship(5);
    cell.setShip(ship);
    assertSame(cell.getShip(),ship);
  }

  @Test
  public void testShotInNothing() throws IllegalAccessException{
    Cell cell=new Cell();
    Ship ship=new Ship(5);
    assertEquals(cell.shot(),Answer.MISSED);
  }

  @Test
  public void testShot2Times() throws IllegalAccessException{
    Cell cell=new Cell();
    Ship ship=new Ship(5);
    cell.setShip(ship);
    cell.shot();
    assertEquals(cell.shot(),Answer.MISSED);
  }

  @Test
  public void testShotAndHit() throws IllegalAccessException{
    Cell cell=new Cell();
    Ship ship=new Ship(5);
    cell.setShip(ship);
    assertEquals(cell.shot(),Answer.HIT);
  }

  @Test
  public void testShotAndSunk() throws IllegalAccessException{
    Cell cell=new Cell();
    Ship ship=new Ship(1);
    cell.setShip(ship);
    assertEquals(cell.shot(),Answer.SUNK);
  }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CellTest.class);
    }

}
