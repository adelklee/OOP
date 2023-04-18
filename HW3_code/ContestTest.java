import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The starting point for a test class.
 * Currently, it simply provides a fixture
 * to help with development.
 *
 * @author  Gustavo Ruiz
 * @version 2020.05.10
 */
public class ContestTest
{
    // The competition object.
    private Contest comp;
    // A sample of three singer details.
    private Singer singer1;
    private Singer singer2;
    private Singer singer3;


    /**
     * Default constructor for test class ContestTest
     */
    public ContestTest()
    {
    }


    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * Create a new Contest and Singers to go in it.
     * The Singers are not added to the list.
     */
    @Before
    public void setUp()
    {
        comp = new Contest();
        singer1 = new Singer("Boa Kwon", "Korean");
        singer2 = new Singer("Jose Jose", "Mexican");
        singer3 = new Singer("Michael Jackson", "American");
        singer1.increaseVotes(100);
        singer2.increaseVotes(98);
        singer3.increaseVotes(50);
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

}
