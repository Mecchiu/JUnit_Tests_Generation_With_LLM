// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRunTest {

	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove2() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove3() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove4() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove5() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove6() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove7() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove8() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove9() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove10() {
		PlotRun run = new PlotRun();
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(datum, run.remove(0));
	}
	
}