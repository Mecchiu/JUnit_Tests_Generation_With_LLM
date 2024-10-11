// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		private static final int NUM_RUNS = 2;

		private final double[][] data;
		private final PlotSymbol symbol;

		/**
		 *  Constructor for the {@link PlotRunList_3Test} class
		 */
		public PlotRunList_3Test() {
			data = new double[NUM_RUNS][2];
			for (int i = 0; i < NUM_RUNS; i++) {
				data[i][0] = new Double(Math.PI / i);
				data[i][1] = new Double((-(2.2 - 0.1 / NUM_RUNS)) * Math.PI / NUM_RUNS);
			}
			symbol = new SolidSymbol(Collections.emptyList());
		}

		/**
		 *  Return a clone of this object.
		 *
		 *  @return A clone of this object.
		 */
		public Object clone() {
			return new PlotRunList_3Test(new double[][]{data},symbol);
		}


		@Test
		public void runList() {
			assertNotNull(data[0][0]);
			assertNotNull(data[0][1]);

			//test iterator()
			final PlotRunList_3_3Test runner = new PlotRunList_3_3Test();
			runner.setNumRows(NUM_RUNS);
			for (int i = 0; i < NUM_RUNS; i++) {
				runner.addRun(data[i]);
			}
			final Iterator iter = runner.iterator();
			int i = 0;
			while (iter.hasNext()) {
				final PlotRun run = (PlotRun) iter.next();
				System.out.print(run.toString() + " ");
				if (i > 0) {
					assertEquals(data[i-1][0], run.getX(), 1e-1);
					assertEquals(data[i-1][1], run.getY(), 1e-1);
				}
				i++;
			}

            assertEquals(run.getX(), data[0][0], 1e-1);
            assertEquals(run.getY(), data[0][1], 1e-1);

			assertFalse(iter.hasNext());
		}

        @Test
		public void getSymbolIndex() {
			assertNull(symbol.getSymbolIndex());
		}

		@Test
		public void symbolNotNull() {
			assertNotNull(symbol);
		}

		@Test
		public void dataIsNotNull() {
			assertNotNull(data);
		}
}