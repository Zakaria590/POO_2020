import org.junit.*;
import static org.junit.Assert.*;
import pfc.*;
import pfc.strategy.*;
import java.util.*;

public class GameTest {	

    @Test
    public void testGame() {
        Player player1=new Player(new OnlyScissors(),"Edward");
        Player player2=new Player(new OnlyRock(),"Balboa");
        Game game = new Game(player1,player2);
        game.play(5);
        assertEquals(game.getPlayer1().getPoints(),0);
        assertEquals(game.getPlayer2().getPoints(),5);
    }

     // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }

}