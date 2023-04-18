

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SingerTestMarking.
 *
 * @author  Gustavo Ruiz
 * @version 2020.05.10
 */
public class SingerTest
{
    private Singer personal1;

    /**
     * Default constructor for test class SingerTest
     */
    public SingerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * Create a single singer and set their
     * votes to 500.
     */
    @Before
    public void setUp()
    {
        personal1 = new Singer("Kwon Boa", "Korean");
        personal1.increaseVotes(500);
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

    /**
     * Test the getName method.
     */
    @Test
    public void getName()
    {
        assertEquals("Kwon Boa", personal1.getName());
    }

    /**
     * Test the getNationality method.
     */
    @Test
    public void getNationality()
    {
        assertEquals("Korean", personal1.getNationality());
    }

    /**
     * Test the getVotes method.
     */
    @Test
    public void getVotes()
    {
        assertEquals(500, personal1.getVotes());
    }

    /**
     * Test the increaseVotes method.
     */
    @Test
    public void increaseVotes()
    {
        personal1.increaseVotes(0);
        assertEquals(500, personal1.getVotes());
        personal1.increaseVotes(1);
        assertEquals(501, personal1.getVotes());
        personal1.increaseVotes(9);
        assertEquals(510, personal1.getVotes());
        personal1.increaseVotes(-1);
        assertEquals(510, personal1.getVotes());
    }

    /**
     * Test the getDetails method.
     */
    @Test
    public void getDetails()
    {
        assertEquals("Kwon Boa is Korean and has 500 votes.", personal1.getDetails());
    }
}





