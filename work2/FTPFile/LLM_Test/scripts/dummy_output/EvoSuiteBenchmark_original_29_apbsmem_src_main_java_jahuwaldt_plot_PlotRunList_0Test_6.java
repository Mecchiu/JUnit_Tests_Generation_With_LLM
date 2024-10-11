// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {
		/**
		* This test has the expected number of runs. It has one
		* run at index 0 which is an empty list.
		*/
	@Test
	void sizeTest() {
		NumberOfRuns expected = 0;
		PointF point = new PointF();
		double minX = Double.MAX_VALUE;;
		double maxX = -Double.MAX_VALUE;
		PointF maxY = new PointF(Double.MAX_VALUE, -Double.MAX_VALUE);
		PlotRun run1 = new PlotRun(point, 2D, Color.red, 1000);
		NumberOfRuns count = new NumberOfRuns(1);
		run1.add( count, run1, Color.red, 10000, 50000000);
		run1.add( count, run1, Color.red, 100000,
				5000);
		run1.setPlaneDistance(10);
		run1.add( count, run1, Color.red, 10000, 1000000000);
		run1.add( count, run1, Color.red, 100000,
				500000000);
		Object result = run1.get().remove();
		run1.clear();

		assertEquals("size: expected", expected, count.get());
		assertEquals("size: run1 count", count, run1);

		run1.add( count, run1, Color.green, 11500, 9);

		result = run1.get().remove();
		run1.clear();

		assertEquals("size: expected", expected, count.get());
		assertEquals("size: run1 count", count, run1);
	}

	/**
	 * Test class of {@link PlotRunList}.
	 * It contains one unit test case for the {@link PlotRunList#iterator()} method.
	 */
	@Test
	void iteratorTest() {
		
		PlotRun run1 = new PlotRun(new PointF(0, 0), 2D, Color.magenta, 1000);
		NumberOfRuns count = new NumberOfRuns(1);
		run1.add( count, run1, Color.blue, 10000, 1000000);
		NumberOfRuns run2 = new NumberOfRuns(1);
		run2.add( count, run2, Color.bluewood, 50000000, 3000000);

		Iterator it = run1.iterator();
		NumberOfRuns count2 = new NumberOfRuns(1);
		while(it.hasNext()){
			NumberOfRun run = (NumberOfRun) it.next();
			count2.add( run, count2, run._minX, run._maxX, 1000, run._planeDistance);
			run.remove();
		}
}
}