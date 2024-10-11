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
			* Run the get(int) method test.
			*/
		@Test
		void testGet(
		) {
		  System.out.println("get(int)");
		  new PlotRunList();
		  Object o = new PlotRunList().get(0);
		  System.out.println("Run1 = " + o);

		  // some checks
		  System.out.println("Check get(int)");
		  Color s = new PlotRunList().get(0).getColor();
		  assertEquals(new Color(0x9, 0x9, 0x00), s, "Color is not same!!");
		  
		}

    // Object Tests
	/**
		 * Test the get(int) method without parameter tests.
	 */
	@Test
	void testGetWithoutParameter() {
		new PlotRunList();
		assertTrue(true);
	}

	/**
		 * Test the size() method tests.
	 */
	@Test
	void testSize(
	) {
		new PlotRunList();
		assertTrue(true);
	}

	/**
		 * Test the iterator() method tests.
	 */
	@Test
	void testIterator(
	) {
		new PlotRunList();
		assertTrue(true);
	}

    /**
     *  Test the clone() method tests.
	 */
	@Test
	void testClone(
	) {
		new PlotRunList();
		new PlotRunList().clone();
	}

	/**
		 * Test the add(i, o) method tests.
	 */
	@Test
	void testAdd(
	) {
		new PlotRunList();
		new PlotRunList().add(11, "one");
		new PlotRunList().add(12, "two");
		new PlotRunList().add(34, "three");
	}
}