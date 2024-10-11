// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {

	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		
		datum = new PlotDatum(7.0, 8.0);
		run.add(datum);
		assertEquals(4, run.size());
		assertEquals(datum, run.get(3));
		
		datum = new PlotDatum(9.0, 10.0);
		run.add(datum);
		assertEquals(5, run.size());
		assertEquals(datum, run.get(4));
		
		datum = new PlotDatum(11.0, 12.0);
		run.add(datum);
		assertEquals(6, run.size());
		assertEquals(datum, run.get(5));
		
		datum = new PlotDatum(13.0, 14.0);
		run.add(datum);
		assertEquals(7, run.size());
		assertEquals(datum, run.get(6));
		
		datum = new PlotDatum(15.0, 16.0);
		run.add(datum);
		assertEquals(8, run.size());
		assertEquals(datum, run.get(7));
		
		datum = new PlotDatum(17.0, 18.0);
		run.add(datum);
		assertEquals(9, run.size());
		assertEquals(datum, run.get(8));
		
		datum = new PlotDatum(19.0, 20.0);
		run.add(datum);
		assertEquals(10, run.size());
		assertEquals(datum, run.get(9));
	}
}