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
		 /**
		   * Test 1
		   */
    //@Test
	public void test1() {
		//@ ensures \result >= \e {Integer.MIN_VALUE};
		Object[] values = {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		final int min = Integer.MIN_VALUE;
		final int limit = Integer.MAX_VALUE;
		final int size = 2;
		final ArrayList list = new ArrayList();

		for (int v = 0; v < size; ++v)
			list.add(new PlotDatum(values) {
			            @Override
			            synchronized void setX(double x) {
					        min = Math.min(min, x);
					        super.setX(x);
					    }
			            @Override
			            synchronized void setY(double y) {
					        min = Math.min(min, y);
					        super.setY(y);
					    }
			            @Override
			            synchronized void setXY(double x, double y) {
					        min = Math.min(min, x);
					        min = Math.min(min, y);
					        super.setXY(x, y);
					    }
			            public String toString() {
					        return Integer.toString(v);
					    }
			           });

        final PlotRun r = new PlotRun(list);
		assertEquals(min, r.getMinX(), 0);
		assertEquals(min, r.getMinY(), 0);
		assertEquals(max, r.getMaxX(), 0);
		assertEquals(0, r.size(), 0);
		assertNotNull(r);
	}

	 /**
	  * Test 2
	  */
    //@Test
	public void test2() {
		//@ ensures \result >= 6;
}
}