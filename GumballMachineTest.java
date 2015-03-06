

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine gumballM1;

   

   
    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        gumballM1 = new GumballMachine(10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

   


    

    


   

    @Test
    public void testInsufficientMoney()
    {
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
    }

    @Test
    public void testExcessMoney()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.insertNickel();
        gumballM1.insertDime();
        gumballM1.turnCrank();
    }

    

    @Test
    public void test50Cents()
    {
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertNickel();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
    }

    @Test
    public void testIsGumballInSlot()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
    }

    @Test
    public void testTakeGumballFromSlot()
    {
        gumballM1.insertQuarter();
        gumballM1.insertQuarter();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.insertDime();
        gumballM1.turnCrank();
        assertEquals(true, gumballM1.isGumballInSlot());
        gumballM1.takeGumballFromSlot();
        assertEquals(false, gumballM1.isGumballInSlot());
    }
}
















