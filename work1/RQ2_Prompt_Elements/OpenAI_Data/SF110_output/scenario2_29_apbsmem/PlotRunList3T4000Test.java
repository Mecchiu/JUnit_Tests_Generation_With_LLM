// PlotRunListTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunListTest {

	/**
	* Test case for {@link PlotRunList#iterator()} method.
	*/
	@Test
	void testIterator() {
		PlotRunList list = new PlotRunList();
		
		// Create a run of data.
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 1.0));
		run.add(new PlotDatum(2.0, 2.0));
		run.add(new PlotDatum(3.0, 3.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a second run of data.
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 4.0));
		run.add(new PlotDatum(5.0, 5.0));
		run.add(new PlotDatum(6.0, 6.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a third run of data.
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 7.0));
		run.add(new PlotDatum(8.0, 8.0));
		run.add(new PlotDatum(9.0, 9.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a fourth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(10.0, 10.0));
		run.add(new PlotDatum(11.0, 11.0));
		run.add(new PlotDatum(12.0, 12.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a fifth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(13.0, 13.0));
		run.add(new PlotDatum(14.0, 14.0));
		run.add(new PlotDatum(15.0, 15.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a sixth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(16.0, 16.0));
		run.add(new PlotDatum(17.0, 17.0));
		run.add(new PlotDatum(18.0, 18.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a seventh run of data.
		run = new PlotRun();
		run.add(new PlotDatum(19.0, 19.0));
		run.add(new PlotDatum(20.0, 20.0));
		run.add(new PlotDatum(21.0, 21.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a eighth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(22.0, 22.0));
		run.add(new PlotDatum(23.0, 23.0));
		run.add(new PlotDatum(24.0, 24.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a ninth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(25.0, 25.0));
		run.add(new PlotDatum(26.0, 26.0));
		run.add(new PlotDatum(27.0, 27.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create a tenth run of data.
		run = new PlotRun();
		run.add(new PlotDatum(28.0, 28.0));
		run.add(new PlotDatum(29.0, 29.0));
		run.add(new PlotDatum(30.0, 30.0));
		
		// Add the run to the list.
		list.add(run);
		
		// Create an iterator for the list.
		Iterator iter = list.iterator();
		
		// Check the first run.
		PlotRun run1 = (PlotRun)iter.next();
		assertEquals(1.0, run1.get(0).getX());
		assertEquals(1.0, run1.get(0).getY());
		assertEquals(2.0, run1.get(1).getX());
		assertEquals(2.0, run1.get(1).getY());
		assertEquals(3.0, run1.get(2).getX());
		assertEquals(3.0, run1.get(2).getY());
		
		// Check the second run.
		PlotRun run2 = (PlotRun)iter.next();
		assertEquals(4.0, run2.get(0).getX());
		assertEquals(4.0, run2.get(0).getY());
		assertEquals(5.0, run2.get(1).getX());
		assertEquals(5.0, run2.get(1).getY());
		assertEquals(6.0, run2.get(2).getX());
		assertEquals(6.0, run2.get(2).getY());
		
		// Check the third run.
		PlotRun run3 = (PlotRun)iter.next();
		assertEquals(7.0, run3.get(0).getX());
		assertEquals(7.0, run3.get(0).getY());
		assertEquals(8.0, run3.get(1).getX());
		assertEquals(8.0, run3.get(1).getY());
		assertEquals(9.0, run3.get(2).getX());
		assertEquals(9.0, run3.get(2).getY());
		
		// Check the fourth run.
		PlotRun run4 = (PlotRun)iter.next();
		assertEquals(10.0, run4.get(0).getX());
		assertEquals(10.0, run4.get(0).getY());
		assertEquals(11.0, run4.get(1).getX());
		assertEquals(11.0, run4.get(1).getY());
		assertEquals(12.0, run4.get(2).getX());
		assertEquals(12.0, run4.get(2).getY());
		
		// Check the fifth run.
		PlotRun run5 = (PlotRun)iter.next();
		assertEquals(13.0, run5.get(0).getX());
		assertEquals(13.0, run5.get(0).getY());
		assertEquals(14.0, run5.get(1).getX());
		assertEquals(14.0, run5.get(1).getY());
		assertEquals(15.0, run5.get(2).getX());
		assertEquals(15.0, run5.get(2).getY());
		
		// Check the sixth run.
		PlotRun run6 = (PlotRun)iter.next();
		assertEquals(16.0, run6.get(0).getX());
		assertEquals(16.0, run6.get(0).getY());
		assertEquals(17.0, run6.get(1).getX());
		assertEquals(17.0, run6.get(1).getY());
		assertEquals(18.0, run6.get(2).getX());
		assertEquals(18.0, run6.get(2).getY());
		
		// Check the seventh run.
		PlotRun run7 = (PlotRun)iter.next();
		assertEquals(19.0, run7.get(0).getX());
		assertEquals(19.0, run7.get(0).getY());
		assertEquals(20.0, run7.get(1).getX());
		assertEquals(20.0, run7.get(1).getY());
		assertEquals(21.0, run7.get(2).getX());
		assertEquals(21.0, run7.get(2).getY());
		
		// Check the eighth run.
		PlotRun run8 = (PlotRun)iter.next();
		assertEquals(22.0, run8.get(0).getX());
		assertEquals(22.0, run8.get(0).getY());
		assertEquals(23.0, run8.get(1).getX());
		assertEquals(23.0, run8.get(1).getY());
		assertEquals(24.0, run8.get(2).getX());
		assertEquals(24.0, run8.get(2).getY());
		
		// Check the ninth run.
		PlotRun run9 = (PlotRun)iter.next();
		assertEquals(25.0, run9.get(0).getX());
		assertEquals(25.0, run9.get(0).getY());
		assertEquals(26.0, run9.get(1).getX());
		assertEquals(26.0, run9.get(1).getY());
		assertEquals(27.0, run9.get(2).getX());
		assertEquals(27.0, run9.get(2).getY());
		
		// Check the tenth run.
		PlotRun run10 = (PlotRun)iter.next();
		assertEquals(28.0, run10.get(0).getX());
		assertEquals(28.0, run10.get(0).getY());
		assertEquals(29.0, run10.get(1).getX());
		assertEquals(29.0, run10.get(1).getY());
		assertEquals(30.0, run10.get(2).getX());
		assertEquals(30.0, run10.get(2).getY());
	}
}