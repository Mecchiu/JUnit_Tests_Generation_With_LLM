// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
/**
         * Test method for
         * {@link PlotRunList#get(int)}.
         */
		@Test
		public void testGet() {
			final PlotRunList list1 = new PlotRunList();
			final Object[] data1 = new Object[10];
			for (int i = 0; i < data1.length; i++) {
				data1[i] = new PlotRun(i, 100.0, 0.0, "D", Color.BLUE);
				final PlotRun run = list1.get(i);
				final Object o = run.get();
				assertEquals("Error of PlotRun # " + i.toString(),
						o, data1[i]);
			}
		}
}
