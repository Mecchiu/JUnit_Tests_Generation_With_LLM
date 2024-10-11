// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		
	@Test
	void test_5() {
		
		//
		// Test 0
		//
		AbstractRun run = new PlotRun();
		Iterator iter = run.iterator();
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 255, 255), iter.next());
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 255, 255), iter.next());
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 255, 255), iter.next());
		assertFalse(iter.hasNext());
		
		
		
		//
		// Test 1
		//
		run = new PlotRun(run);
		iter = run.iterator();
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(0, 0, 0), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(0, 0, 0), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 255, 255), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(0, 255, 255), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 0, 0), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
		assertEquals(new Color(255, 255, 0), iter.next());
		assertTrue(iter.hasNext());
		assertTrue(iter.hasNext());
}
}