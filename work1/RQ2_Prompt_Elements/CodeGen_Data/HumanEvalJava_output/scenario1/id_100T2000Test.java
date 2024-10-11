// MakeAPileTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains one unit test case for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

	private List<Integer> results;
		
	/**
	* Constructor of <code>MakeAPileTest</code>.
	* Tests constructor with negative number of arguments.
	*/
    private MakeAPileTest(int n) {
        assertTrue(Integer.toString(n).toLowerCase().startsWith("-"));
		results = new ArrayList<Integer>();
	}
	
	/**
	* Unit test for the {@link MakeAPile#makeAPile(int)} method with negative argument n.
	*/
	@Test
	public void testMakesAPile() {		
		results = new MakeAPile(-1).makeAPile(1);
		assertNotNull(results);
		assertEquals(new Integer(-1), results.get(0));
	}
	
	/**
	* Unit test for the {@link MakeAPile#makeAPile(int)} method with positive argument n.
	*/
	@Test
	public void testMakesAPile() {		
		results = new MakeAPile(1).makeAPile(2);
		assertNotNull(results);
		assertTrue(results.size() > 1);
		assertEquals(new Integer(1), results.get(0));
		assertEquals(new Integer(2), results.get(1));
	}
}