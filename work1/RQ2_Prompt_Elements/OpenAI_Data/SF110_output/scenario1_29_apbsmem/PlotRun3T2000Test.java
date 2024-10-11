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
		Iterator it = run.iterator();
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(1.0, 2.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(3.0, 4.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(5.0, 6.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(7.0, 8.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(9.0, 10.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(11.0, 12.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(11.0, 12.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(13.0, 14.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(11.0, 12.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(13.0, 14.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(15.0, 16.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(11.0, 12.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(13.0, 14.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(15.0, 16.0), it.next());
		assertFalse(it.hasNext());
		
		run.add(new PlotDatum(17.0, 18.0));
		it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(7.0, 8.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(9.0, 10.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(11.0, 12.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(13.0, 14.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(15.0, 16.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(