// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
		/**
		* Create a test class.
		*/
	public PlotRunList_1Test() {
	}
	/**
	* Test for the get(int) method.
	*/
	@Test
	public void testGet() {
	
		// Default constructor
	
		PlotRunList temp = new PlotRunList();
		assertEquals(0, temp.size());
		assertEquals(0, temp.size());
		
		// Return with default argument
		boolean b = temp.get(0) == null;
		temp = null;
		assertTrue(b);
	}
}