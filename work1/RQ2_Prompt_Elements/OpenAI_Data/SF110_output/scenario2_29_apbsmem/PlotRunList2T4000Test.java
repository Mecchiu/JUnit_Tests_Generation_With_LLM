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
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 1.0));
		run.add(new PlotDatum(2.0, 2.0));
		run.add(new PlotDatum(3.0, 3.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 4.0));
		run.add(new PlotDatum(5.0, 5.0));
		run.add(new PlotDatum(6.0, 6.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 7.0));
		run.add(new PlotDatum(8.0, 8.0));
		run.add(new PlotDatum(9.0, 9.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(10.0, 10.0));
		run.add(new PlotDatum(11.0, 11.0));
		run.add(new PlotDatum(12.0, 12.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(13.0, 13.0));
		run.add(new PlotDatum(14.0, 14.0));
		run.add(new PlotDatum(15.0, 15.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(16.0, 16.0));
		run.add(new PlotDatum(17.0, 17.0));
		run.add(new PlotDatum(18.0, 18.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(19.0, 19.0));
		run.add(new PlotDatum(20.0, 20.0));
		run.add(new PlotDatum(21.0, 21.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(22.0, 22.0));
		run.add(new PlotDatum(23.0, 23.0));
		run.add(new PlotDatum(24.0, 24.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(25.0, 25.0));
		run.add(new PlotDatum(26.0, 26.0));
		run.add(new PlotDatum(27.0, 27.0));
		runList.add(run);
		run = new PlotRun();
		run.add(new PlotDatum(28.0, 28.0));
		run.add(new PlotDatum(29.0, 29.0));
		run.add(new PlotDatum(30.0, 30.0));
		runList.add(run);
		
		// Test case 1
		PlotRun removedRun = (PlotRun) runList.remove(0);
		assertEquals(9, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(1.0, removedRun.get(0).getX());
		assertEquals(2.0, removedRun.get(1).getX());
		assertEquals(3.0, removedRun.get(2).getX());
		
		// Test case 2
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(8, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(4.0, removedRun.get(0).getX());
		assertEquals(5.0, removedRun.get(1).getX());
		assertEquals(6.0, removedRun.get(2).getX());
		
		// Test case 3
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(7, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(7.0, removedRun.get(0).getX());
		assertEquals(8.0, removedRun.get(1).getX());
		assertEquals(9.0, removedRun.get(2).getX());
		
		// Test case 4
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(6, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(10.0, removedRun.get(0).getX());
		assertEquals(11.0, removedRun.get(1).getX());
		assertEquals(12.0, removedRun.get(2).getX());
		
		// Test case 5
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(5, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(13.0, removedRun.get(0).getX());
		assertEquals(14.0, removedRun.get(1).getX());
		assertEquals(15.0, removedRun.get(2).getX());
		
		// Test case 6
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(4, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(16.0, removedRun.get(0).getX());
		assertEquals(17.0, removedRun.get(1).getX());
		assertEquals(18.0, removedRun.get(2).getX());
		
		// Test case 7
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(3, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(19.0, removedRun.get(0).getX());
		assertEquals(20.0, removedRun.get(1).getX());
		assertEquals(21.0, removedRun.get(2).getX());
		
		// Test case 8
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(2, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(22.0, removedRun.get(0).getX());
		assertEquals(23.0, removedRun.get(1).getX());
		assertEquals(24.0, removedRun.get(2).getX());
		
		// Test case 9
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(1, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(25.0, removedRun.get(0).getX());
		assertEquals(26.0, removedRun.get(1).getX());
		assertEquals(27.0, removedRun.get(2).getX());
		
		// Test case 10
		removedRun = (PlotRun) runList.remove(0);
		assertEquals(0, runList.size());
		assertEquals(3, removedRun.size());
		assertEquals(28.0, removedRun.get(0).getX());
		assertEquals(29.0, removedRun.get(1).getX());
		assertEquals(30.0, removedRun.get(2).getX());
	}
}