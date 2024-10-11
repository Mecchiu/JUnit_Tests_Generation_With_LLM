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
		 * Test a single instance of the  {@link PlotRun} class
		*/
    @Test
    void testInstance() {
		Integer min = new Integer(0);
		Integer max = new Integer(1000);
		Integer maxX = new Integer(1000);
		Integer maxY = new Integer(1000);
		Integer minX = new Integer(0);
		Integer minY = new Integer(0);
		int size = 30;
		int index = 0;

		PlotRun r = new PlotRun(min, max, maxX, maxY, minX, minY, null, null);

		//test single instance of PlotRun_1Test
		assertNotNull(r.get(index));
		assertEquals(min, r.get(index).getMinX());
		assertEquals(max, r.get(index).getMaxX());
		assertEquals(maxY, r.get(index).getMaxY());
		assertEquals(minY, r.get(index).getMinY());
		assertEquals(new Integer(size), r.get(index).size());
		index = 0;

		size = 30;
		System.out.println();
		System.out.println("MINX = "+min+". ", minX);
		System.out.println("MAXX = "+max+". ", maxX);
		System.out.println("MAXY = "+maxY+". ", maxY);
		System.out.println("MINY = "+min+". ", minY);
		System.out.println("SIZE = "+size+". ", size);
	}

	/**
	 *  This method is used to make it easy to test the constructor arguments
	 *  for a given class.
	 */
    @Test
    void testParameters() {
    	Integer min = new Integer(0);
		Integer max = new Integer(1000);
		Integer maxX = null;
		Integer maxY = null;
}
}