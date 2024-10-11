// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {

	/**
	* Test case for {@link PlotRunList#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRunList runList = new PlotRunList();
		
		// Add a run to the run list.
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(2.0, 3.0));
		run.add(new PlotDatum(3.0, 4.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 5.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(6.0, 7.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(8.0, 9.0));
		run.add(new PlotDatum(9.0, 10.0));
		runList.add(run);
		
		// Iterate over the runs in the run list.
		Iterator iter = runList.iterator();
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(1.0, run.getMinX());
		assertEquals(3.0, run.getMaxX());
		assertEquals(2.0, run.getMinY());
		assertEquals(4.0, run.getMaxY());
		
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(4.0, run.getMinX());
		assertEquals(6.0, run.getMaxX());
		assertEquals(5.0, run.getMinY());
		assertEquals(7.0, run.getMaxY());
		
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(7.0, run.getMinX());
		assertEquals(9.0, run.getMaxX());
		assertEquals(8.0, run.getMinY());
		assertEquals(10.0, run.getMaxY());
		
		assertFalse(iter.hasNext());
	}
	
}

// PlotRunList_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_4Test {
		
	/**
	* Test case for {@link PlotRunList#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRunList runList = new PlotRunList();
		
		// Add a run to the run list.
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(2.0, 3.0));
		run.add(new PlotDatum(3.0, 4.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 5.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(6.0, 7.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(8.0, 9.0));
		run.add(new PlotDatum(9.0, 10.0));
		runList.add(run);
		
		// Iterate over the runs in the run list.
		Iterator iter = runList.iterator();
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(1.0, run.getMinX());
		assertEquals(3.0, run.getMaxX());
		assertEquals(2.0, run.getMinY());
		assertEquals(4.0, run.getMaxY());
		
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(4.0, run.getMinX());
		assertEquals(6.0, run.getMaxX());
		assertEquals(5.0, run.getMinY());
		assertEquals(7.0, run.getMaxY());
		
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(7.0, run.getMinX());
		assertEquals(9.0, run.getMaxX());
		assertEquals(8.0, run.getMinY());
		assertEquals(10.0, run.getMaxY());
		
		assertFalse(iter.hasNext());
	}
	
}

// PlotRunList_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_5Test {
		
	/**
	* Test case for {@link PlotRunList#iterator()}.
	*/
	@Test
	void testIterator() {
		PlotRunList runList = new PlotRunList();
		
		// Add a run to the run list.
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(2.0, 3.0));
		run.add(new PlotDatum(3.0, 4.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(4.0, 5.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.add(new PlotDatum(6.0, 7.0));
		runList.add(run);
		
		// Add another run to the run list.
		run = new PlotRun();
		run.add(new PlotDatum(7.0, 8.0));
		run.add(new PlotDatum(8.0, 9.0));
		run.add(new PlotDatum(9.0, 10.0));
		runList.add(run);
		
		// Iterate over the runs in the run list.
		Iterator iter = runList.iterator();
		assertTrue(iter.hasNext());
		run = (PlotRun)iter.next();
		assertEquals(1.0, run.getMinX());
		assertEquals(3.0, run.getMaxX());
		assertEquals(2.0, run.getMinY());
	