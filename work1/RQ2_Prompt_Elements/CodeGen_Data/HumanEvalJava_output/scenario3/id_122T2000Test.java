// AddElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains one unit test case for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

	static int[][] a = { { 1, -2, -3, 41, 57, 76, 87, 88, 99 }, { 111, 121, 3, 4000, 5 }, { 100, 0, 0 } };
		
	/**
	 * Constructor with no parameters.
	 */
	public AddElementsTest () {
	}
	
	/**
	 * Constructor with a given array of values.
	 * @param l the given array of values.
	 */
	public AddElementsTest (List<Integer> l) {
	}
	
	/**
	 * Test method that adds each element of the array <code>arr</code> to the sum of each elements
	 * of the array <code>arr</code>.
	 */
	@Test
	public void testAddElements () {
		AddElements ae = new AddElements(a);
		assertEquals(-4, ae.addElements(a, 3).get(100));
		assertEquals(24, ae.addElements(a, 4).get(4));
	}
	
	/**
	 * Test method that adds the sum of the elements of <code>arr</code> to the sum of 
	 * elements of the array <code>arr</code>.
	 */
	@Test
	public void testAddElementsWithSubtractor () {
		AddElements ae = new AddElements(a);
		assertEquals(24, ae.addElements(a, 2).get(4));
	}
}
