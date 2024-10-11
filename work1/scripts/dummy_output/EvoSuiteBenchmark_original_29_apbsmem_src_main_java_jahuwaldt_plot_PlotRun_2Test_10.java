// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		
	// test data
	final double[] d_x= {0.5, 1.5};
	final double[] d_y= {0.8, 0.1};
	final Color[] color_x = {Color.green};
	final Color[] color_y = {Color.blue};
	double d_minX, d_maxX, d_minY, d_maxY;
	
		
	/**
	 * Executes all methods in the Test class for this object.
	 */
	static void allTests() {
		
		// 1. Testing remove(int)
		System.out.println("Testing remove(int)...");
		{
			System.out.println("Testing x = array element: remove(int)");
			int[] nums = {5, 10};
			PlotRun run = new PlotRun(nums[0]);
			assertEquals("Remove x incorrectly added", nums[0], run.remove(0));
			assertEquals("Remove x incorrectly removed", nums[0], run.remove(5));
		}
		{
			System.out.println("Testing x = null");
			PlotRun run = new PlotRun();
			run.add(new PlotDatum(new ArrayList(Arrays.asList(d_x))));
			run.add(new PlotDatum(new ArrayList(Arrays.asList(d_y))));
			try {
				run.remove(-1);
				fail("No Exception");
			} catch (ArrayIndexOutOfBoundsException e) {
				//expected!
			}
		}
			
		// 2. Testing iterator()
		System.out.println("Testing iterator()...");
		Iterator it = run.iterator();

		// 2.1 Test for iterator() when d_minX < d_maxX
		assertFalse("iterator() returned an iterator for the minX",it.hasNext());
}
}