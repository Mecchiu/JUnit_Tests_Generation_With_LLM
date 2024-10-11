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
		static final Color[] COLORS = new Color[] {
			new Color(119, 136, 204),
			new Color(102, 255, 111),
			new Color(92, 0, 102),

			Color.red,
			Color.blue,
		};

    /**
     * Test the method {@link PlotRunList#get(int)}.
     */
    @Test
    void testGet() {
		/* Arrange. */
		List runList = new ArrayList();
		int count = 1000;
		int numRun = count;
		for(int i=0; i<count ; i++) {
			runList.add(new PlotRun(new Color(i*100,i*100,i*100)));
		}

		/* Act */
		Object o = PlotRunList.get(numRun);

		/* Assert */
		assertEquals(NUM_RUNS, numRun);
		assertElements(COLORS, o);
	}

	@Test
	void testClone() {
		/* Arrange. */
		List runList = new ArrayList();
		int numRun = NUM_RUNS;
		for(int i=0; i<numRun; i++) {
			runList.add(new PlotRun(new Color(i*100,i*100,i*100)));
		}

		/* Act. */
		Cloneable cl = PlotRunList.clone(runList);
		assertNotNull(cl);

		/* Assert. */
		Object result = cl.get();

		assertElements(COLORS, result);
	}

	private void assertElements(Color[] values, Object o) {
		for(int i=0 ; i < o.length ; i++) {
			assertTrue(Arrays.equals(""+i, o[values[i]].toString()));
		}
	}
}