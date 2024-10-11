// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRunTest {

	/**
	* Test case for {@link PlotRun#size()} method.
	*/
	@Test
	void testSize() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		
		run.add(new PlotDatum(1.0, 2.0));
		assertEquals(1, run.size());
		
		run.add(new PlotDatum(3.0, 4.0));
		assertEquals(2, run.size());
		
		run.add(new PlotDatum(5.0, 6.0));
		assertEquals(3, run.size());
		
		run.add(new PlotDatum(7.0, 8.0));
		assertEquals(4, run.size());
		
		run.add(new PlotDatum(9.0, 10.0));
		assertEquals(5, run.size());
		
		run.add(new PlotDatum(11.0, 12.0));
		assertEquals(6, run.size());
		
		run.add(new PlotDatum(13.0, 14.0));
		assertEquals(7, run.size());
		
		run.add(new PlotDatum(15.0, 16.0));
		assertEquals(8, run.size());
		
		run.add(new PlotDatum(17.0, 18.0));
		assertEquals(9, run.size());
		
		run.add(new PlotDatum(19.0, 20.0));
		assertEquals(10, run.size());
	}
}