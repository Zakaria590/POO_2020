import org.junit.*;
import static org.junit.Assert.*;
import pfc.*;
import pfc.strategy.*;
import java.util.*;

public class PlayerTest {	
//je veux bien etuliser le @Before
    @Test
    public void testAddAndGetPoints() {
        Strategy rock = new OnlyRock();
        String name = "thor";
        Player thor = new Player (rock,name);
        assertEquals(thor.getPoints(),0);
        thor.addPoints(5);
        assertEquals(thor.getPoints(),5);
    }

    @Test
    public void testGetName() {
        Strategy rock = new OnlyRock();
        String name = "thor";
        Player thor = new Player (rock,name);
        assertEquals(thor.getName(),"thor");
    }

    @Test
    public void testTakeChoice() {
        Strategy rock = new OnlyRock();
        String name = "thor";
        Player thor = new Player (rock,name);
        assertEquals(thor.takeChoice(),Choice.ROCK);
    }

     // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }

}