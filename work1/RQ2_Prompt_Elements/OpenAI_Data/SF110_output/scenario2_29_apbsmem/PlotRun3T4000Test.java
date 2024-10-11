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
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator2() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator3() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator4() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator5() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator6() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator7() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator8() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator9() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
	/**
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator10() {
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		Iterator<PlotDatum> it = run.iterator();
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(1.0, 2.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(3.0, 4.0), it.next());
		assertTrue(it.hasNext());
		assertEquals(new PlotDatum(5.0, 6.0), it.next());
		assertFalse(it.hasNext());
	}
	
}