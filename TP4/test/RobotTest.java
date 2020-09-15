import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.ConveyerBelt;  
import example.util.Box;

public class RobotTest {

    @Test
    public void testDontHaveBoxAndTakeOne() {
        Robot robot = new Robot();
	Box box = new Box(10);
	robot.take(box);
        assertSame(box,robot.getCarriedBox());
    }

    @Test
    public void testAlreadyHaveBoxAndTakeOther() {
        Robot robot = new Robot();
	Box box1 = new Box(10);
	Box box2 = new Box(10);
	robot.take(box1);
	robot.take(box2);
        assertFalse(box2==robot.getCarriedBox());
    }

    @Test
    public void testFunctionCarryWhenHaveBox() {
        Robot robot = new Robot();
	Box box = new Box(10);
	robot.take(box);
        assertTrue(robot.carryBox());
    }

    @Test
    public void testFunctionCarryWhenHaveAnyBox() {
        Robot robot = new Robot();
        assertFalse(robot.carryBox());
    }

    @Test
    public void testPutOnConveyer() {
        Robot robot = new Robot();
	ConveyerBelt conveyer = new ConveyerBelt(50);
	Box box1 = new Box(10);
	robot.take(box1);
	robot.putOn(conveyer);
        assertFalse(robot.carryBox());
    }

    @Test
    public void testPutOnConveyerWhichAlreadyCarryTwo() {
        Robot robot = new Robot();
	ConveyerBelt conveyer = new ConveyerBelt(50);
	Box box1 = new Box(10);
	robot.take(box1);
	robot.putOn(conveyer);
	Box box2 = new Box(10);
	robot.take(box2);
	robot.putOn(conveyer);
	Box box3 = new Box(10);
	robot.take(box3);
	robot.putOn(conveyer);
        assertTrue(robot.carryBox());
    }

    @Test
    public void testPutOnConveyerWhenTooHeavy() {
        Robot robot = new Robot();
	ConveyerBelt conveyer = new ConveyerBelt(10);
	Box box1 = new Box(50);
    robot.take(box1);
	robot.putOn(conveyer);
        assertTrue(robot.carryBox());
    }




    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }

}
