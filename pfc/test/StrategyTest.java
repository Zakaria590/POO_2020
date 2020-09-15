import org.junit.*;
import static org.junit.Assert.*;
import pfc.*;
import pfc.strategy.*;
import java.util.*;

public class StrategyTest {	

    @Test
    public void testCompareRockPaperSCiSSORS() {
        Strategy rock = new OnlyRock();
        Strategy paper = new OnlyPaper();
        Strategy scissors = new OnlyScissors();
        assertEquals(rock.takeChoice().compare(rock.takeChoice()),0);
        assertEquals(paper.takeChoice().compare(paper.takeChoice()),0);
        assertEquals(scissors.takeChoice().compare(scissors.takeChoice()),0);
        assertEquals(rock.takeChoice().compare(paper.takeChoice()),-1);
        assertEquals(paper.takeChoice().compare(scissors.takeChoice()),-1);
        assertEquals(scissors.takeChoice().compare(rock.takeChoice()),-1);
        assertEquals(rock.takeChoice().compare(scissors.takeChoice()),1);
        assertEquals(paper.takeChoice().compare(rock.takeChoice()),1);
        assertEquals(scissors.takeChoice().compare(paper.takeChoice()),1);
    }

    @Test
    public void testSequence (){
        Strategy rock = new OnlyRock();
        Strategy paper = new OnlyPaper();
        Strategy scissors = new OnlyScissors();
		ArrayList <Choice> list = new ArrayList <Choice> ();
		list.add(Choice.ROCK);
		list.add(Choice.PAPER);
		list.add(Choice.SCISSORS);
        Strategy seq = new Sequence(list);
        assertEquals(seq.takeChoice().compare(rock.takeChoice()),0);
        assertEquals(seq.takeChoice().compare(paper.takeChoice()),0);
        assertEquals(seq.takeChoice().compare(scissors.takeChoice()),0);
    }


     // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(StrategyTest.class);
    }

}