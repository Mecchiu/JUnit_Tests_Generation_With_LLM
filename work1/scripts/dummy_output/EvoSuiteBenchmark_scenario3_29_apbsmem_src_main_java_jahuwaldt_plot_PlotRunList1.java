// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunListTest {
		
	/**
	* Test case for {@link PlotRunList#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRunList runList = new PlotRunList();
		assertEquals(0, runList.size());
		
		PlotRun run = new PlotRun();
		runList.add(run);
		assertEquals(1, runList.size());
		
		PlotRun run2 = new PlotRun();
		runList.add(run2);
		assertEquals(2, runList.size());
		
		assertEquals(run, runList.get(0));
		assertEquals(run2, runList.get(1));
	}
}