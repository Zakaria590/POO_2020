import static org.junit.Assert.*;
import org.junit.Test;

import date.Date;
import date.util.Month;

public class DateTest {

    @Test
    public void testMonth() {
    Date date = new Date(1,Month.JANUARY,1995);
    assertEquals(31,date.getMonth().getNbDays(date.getYear()));
    }

    @Test (expected= IllegalArgumentException.class)
    public void testDateConstructorError1() {
    Date date = new Date(35,Month.MAY,1995);
        date.daysLater(-1);
    }

    @Test (expected= IllegalArgumentException.class)
    public void testDateConstructorError2() {
    Date date = new Date(3,Month.MAY,-5);
        date.daysLater(-1);
    }


    @Test
    public void testDateConstructor() {
    Date date = new Date(8,Month.JANUARY,1995);
    assertEquals(8,date.getDay());
    assertEquals(Month.JANUARY,date.getMonth());
    assertEquals(1995,date.getYear());
    }

    @Test
    public void testEquals() {
    Date date1 = new Date(8,Month.JANUARY,1995);
    Date date2 = new Date(8,Month.JANUARY,1995);
    assertTrue(date1.equals(date2));
    }

    @Test
    public void testNotEquals() {
    Date date1 = new Date(8,Month.JANUARY,1995);
    Date date2 = new Date(9,Month.JANUARY,1995);
    assertFalse(date1.equals(date2));
    }

    @Test
    public void testTomorrow() {
    Date date = new Date(8,Month.JANUARY,1995);
    Date tomorrow = date.tomorrow();
    assertEquals(9,tomorrow.getDay());
    assertEquals(Month.JANUARY,tomorrow.getMonth());
    assertEquals(1995,tomorrow.getYear());
    }

    @Test (expected= IllegalArgumentException.class)
    public void testDaysLaterError() {
    Date date1 = new Date(22,Month.FEBRUARY,2020);
    date1.daysLater(-1);
    }

    @Test
    public void testDaysLater1() {
    Date date1 = new Date(22,Month.FEBRUARY,2020);
    Date date2 = new Date(1,Month.MARCH,2020);
    assertTrue(date1.daysLater(8).equals(date2));
    }

    @Test
    public void testDaysLater2() {
    Date date1 = new Date(1,Month.FEBRUARY,2020);
    Date date2 = new Date(9,Month.FEBRUARY,2020);
    assertTrue(date1.daysLater(8).equals(date2));
    }

    @Test
    public void testDiffBtwn2Dates() {
    Date date1 = new Date(15,Month.JANUARY,1596);
    Date date2 = new Date(22,Month.MARCH,2019);
	assertEquals(date1.diffInDays(date2),154564);
    }

    @Test
    public void testDiffBtwn2DatesInSameMonth() {
    Date date1 = new Date(1,Month.MARCH,2020);
    Date date2 = new Date(22,Month.MARCH,2020);
    assertEquals(date1.diffInDays(date2),21);
    }

    @Test
    public void testDiffBtwn2DatesWithSameYear1() {
    Date date1 = new Date(1,Month.JANUARY,2020);
    Date date2 = new Date(15,Month.DECEMBER,2020);
    assertEquals(date1.diffInDays(date2),349);
    }

    @Test
    public void testDiffBtwn2DatesWithSameYear2() {
    Date date3 = new Date(15,Month.JANUARY,2020);
    Date date4 = new Date(1,Month.DECEMBER,2020);
    assertEquals(date3.diffInDays(date4),321);
    }
    
    @Test
    public void testDiffBtwn2DatesWithSameYear3() {
    Date date5 = new Date(15,Month.JANUARY,2020);
    Date date6 = new Date(15,Month.DECEMBER,2020);
    assertEquals(date5.diffInDays(date6),335);
    }
    
    @Test
    public void testDiffBtwn2DatesWithSameYear4() {
    Date date7 = new Date(8,Month.JANUARY,2020);
    Date date8 = new Date(9,Month.DECEMBER,2020);
    assertEquals(date7.diffInDays(date8),336);
    }

    @Test
    public void testToString() {
    Date date = new Date(8,Month.JANUARY,1995);
    assertEquals(date.toString(),"The date is 8 JANUARY 1995");
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DateTest.class);
    }

}
