// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunListTest {

	/**
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	void testRemove() {
		PlotRunList list = new PlotRunList();
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(1, 2), new PlotDatum(3, 4) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(5, 6), new PlotDatum(7, 8) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(9, 10), new PlotDatum(11, 12) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(13, 14), new PlotDatum(15, 16) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(17, 18), new PlotDatum(19, 20) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(21, 22), new PlotDatum(23, 24) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(25, 26), new PlotDatum(27, 28) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(29, 30), new PlotDatum(31, 32) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(33, 34), new PlotDatum(35, 36) }));
		list.add(new PlotRun(new PlotDatum[] { new PlotDatum(37, 38), new PlotDatum(39, 40) }));
		
		assertEquals(10, list.size());
		
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(1, 2), new PlotDatum(3, 4) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(5, 6), new PlotDatum(7, 8) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(9, 10), new PlotDatum(11, 12) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(13, 14), new PlotDatum(15, 16) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(17, 18), new PlotDatum(19, 20) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(21, 22), new PlotDatum(23, 24) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(25, 26), new PlotDatum(27, 28) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(29, 30), new PlotDatum(31, 32) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(33, 34), new PlotDatum(35, 36) }), list.remove(0));
		assertEquals(new PlotRun(new PlotDatum[] { new PlotDatum(37, 38), new PlotDatum(39, 40) }), list.remove(0));
		
		assertEquals(0, list.size());
	}
	
}