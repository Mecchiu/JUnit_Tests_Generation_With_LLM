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
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	* Test case for {@link PlotRunList#remove(int)} method.
	*/
	@Test
	public void testRemove() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1, 2));
		run.add(new PlotDatum(3, 4));
		run.add(new PlotDatum(5, 6));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(7, 8));
		run.add(new PlotDatum(9, 10));
		run.add(new PlotDatum(11, 12));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(13, 14));
		run.add(new PlotDatum(15, 16));
		run.add(new PlotDatum(17, 18));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(19, 20));
		run.add(new PlotDatum(21, 22));
		run.add(new PlotDatum(23, 24));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(25, 26));
		run.add(new PlotDatum(27, 28));
		run.add(new PlotDatum(29, 30));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(31, 32));
		run.add(new PlotDatum(33, 34));
		run.add(new PlotDatum(35, 36));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(37, 38));
		run.add(new PlotDatum(39, 40));
		run.add(new PlotDatum(41, 42));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(43, 44));
		run.add(new PlotDatum(45, 46));
		run.add(new PlotDatum(47, 48));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(49, 50));
		run.add(new PlotDatum(51, 52));
		run.add(new PlotDatum(53, 54));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(55, 56));
		run.add(new PlotDatum(57, 58));
		run.add(new PlotDatum(59, 60));
		runList.add(run);
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(9, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(8, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(7, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(6, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(5, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(4, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(3, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(2, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(1, runList.size());
		
		// Test case for {@link PlotRunList#remove(int)} method.
		runList.remove(0);
		assertEquals(0, runList.size());
	}
}