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
	* Test of {@link PlotRunList#iterator()} method.
	*/
	@Test
	public void testIterator() {
		PlotRunList list = new PlotRunList();
		
		// Test empty list.
		Iterator iter = list.iterator();
		assertFalse(iter.hasNext());
		
		// Test list with one run.
		PlotRun run = new PlotRun();
		list.add(run);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with two runs.
		PlotRun run2 = new PlotRun();
		list.add(run2);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with three runs.
		PlotRun run3 = new PlotRun();
		list.add(run3);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with four runs.
		PlotRun run4 = new PlotRun();
		list.add(run4);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with five runs.
		PlotRun run5 = new PlotRun();
		list.add(run5);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with six runs.
		PlotRun run6 = new PlotRun();
		list.add(run6);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run6, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with seven runs.
		PlotRun run7 = new PlotRun();
		list.add(run7);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run7, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with eight runs.
		PlotRun run8 = new PlotRun();
		list.add(run8);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run7, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run8, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with nine runs.
		PlotRun run9 = new PlotRun();
		list.add(run9);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run7, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run8, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run9, iter.next());
		assertFalse(iter.hasNext());
		
		// Test list with ten runs.
		PlotRun run10 = new PlotRun();
		list.add(run10);
		iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals(run, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run7, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run8, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run9, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(run10, iter.next());
		assertFalse(iter.hasNext());
	}
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRunTest {
		
	/**
	* Test of {@link PlotRun#iterator()} method.
	*/
	@Test
	public void testIterator() {
		PlotRun run = new PlotRun();
		
		// Test empty run.
		Iterator iter = run.iterator();
		assertFalse(iter.hasNext());
		
		// Test run with one datum.
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with two datums.
		PlotDatum datum2 = new PlotDatum(3.0, 4.0);
		run.add(datum2);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with three datums.
		PlotDatum datum3 = new PlotDatum(5.0, 6.0);
		run.add(datum3);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with four datums.
		PlotDatum datum4 = new PlotDatum(7.0, 8.0);
		run.add(datum4);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with five datums.
		PlotDatum datum5 = new PlotDatum(9.0, 10.0);
		run.add(datum5);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum5, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with six datums.
		PlotDatum datum6 = new PlotDatum(11.0, 12.0);
		run.add(datum6);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum6, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with seven datums.
		PlotDatum datum7 = new PlotDatum(13.0, 14.0);
		run.add(datum7);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum7, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with eight datums.
		PlotDatum datum8 = new PlotDatum(15.0, 16.0);
		run.add(datum8);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum7, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum8, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with nine datums.
		PlotDatum datum9 = new PlotDatum(17.0, 18.0);
		run.add(datum9);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(datum, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum2, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum3, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum4, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum5, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum6, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum7, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum8, iter.next());
		assertTrue(iter.hasNext());
		assertEquals(datum9, iter.next());
		assertFalse(iter.hasNext());
		
		// Test run with ten datums.
		PlotDatum datum10 = new PlotDatum(19.0, 20.0);
		run.