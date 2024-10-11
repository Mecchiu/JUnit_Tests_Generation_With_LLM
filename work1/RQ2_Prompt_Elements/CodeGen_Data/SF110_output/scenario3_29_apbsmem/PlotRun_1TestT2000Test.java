// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {

	/**
	 * Tests instantiation of {@link PlotRun} using empty data.
	 */
	@Test
	void instantiation_empty() {
		assertEquals("empty PlotRun", 0, new PlotRun(null, null).size());
	}
		
	/**
	 * Tests instantiation of {@link PlotRun} with zero data.
	 */
	@Test
	void instantiation_zero_data() {
		Collection c = new ArrayList();
		c.add(new PlotData(new Color(150, 50, 150)));
		c.add(new PlotData(new Color(150, 150, 150)));
		c.add(new PlotData(new Color(50, 150, 150)));
		
		assertEquals("zero PlotRun", 0, c.size());
		Collection c2 = c;
		c2.remove(new PlotData(new Color(150, 150, 150)));
		assertEquals("non-empty PlotRun", 1, c2.size());
	}

}

// PlotRun_2Test.java
// ----------------------------------------------------------------------------
