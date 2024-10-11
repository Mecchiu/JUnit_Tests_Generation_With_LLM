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