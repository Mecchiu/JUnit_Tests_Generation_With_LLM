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
		public double minX = Double.MAX_VALUE;
		public double maxX = Double.MIN_VALUE;
		public double minY = Double.MAX_VALUE;
		public double maxY = Double.MIN_VALUE;
		
		@Test
		void testGet() {
			PlotRun obj = new PlotRun();
			try {
				obj.get(0);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				fail();
			}
		}
}