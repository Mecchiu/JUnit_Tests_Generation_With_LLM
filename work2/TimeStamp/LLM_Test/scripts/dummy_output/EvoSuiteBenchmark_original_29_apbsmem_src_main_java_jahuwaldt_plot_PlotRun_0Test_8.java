// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {
		private final double EPSILON = Math.ulp(0.001);

		/**
		*  Tests the size method of the specified object.
		*/
		@Test
		void size() {
			plotRunSize("");

			if(plotDataSize == 0) {
				logger.warn("Object: " + this + " (size) failed; no dataset");
				return;
			}

			plotDataSize = 0;

			assertNotNull("Size of Run.size() should not return null.", plotRunSize);
			assertEquals("Size of Run.size() incorrect.", 1, plotRunSize.size());
		}

		private long plotDataSize;

		/**
		*  Tests the number of datum in this object.
		*/
		@Test
		void size() {
			plotRunSize("");
			plotDataSize = 0;

			if(plotData == null) {
				logger.warn("Object: " + this + " (size) failed; no dataset");
				return;
			}

			assertEquals("size() incorrect.", 1, plotDataSize);
			assertTrue("size() not return a List!", plotData instanceof ArrayList);
		}
} // class PlotRun_0Test

class PlotSymbol_0Test {
		/*
		*  Tests the creation of a PlotSymbol object.
		*/
		@Test
		void test() {
			//Test a Run with 3 Datum elements on it.
			plotSymbol(new PlotDatum[] {new PlotDatum(0.5, new Color(0,1,0)),
			                        new PlotDatum(0.5, new Color(0,1,1)),
			                        new PlotDatum(0.5, new Color(1,0,0))});
		}
		private void plotSymbol(PlotDatum[] expected) {
			logger.info("Plots [");
}
}