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
     * Test {@link PlotRunList#get(int)}.
	 * @throws Exception
     */
	@Test
	public void testGet() throws Exception {
		
		boolean b = true;
		Collection<PlotDatum> ds;
		String s;
		int n = 5;
		
		int p = 0;
		while (p < n) {
			b = false;
			ds = new LinkedList();
			p++;
			assertEquals(true, p < n);
			s = "";
			ds.add(new PlotDatum(s, s, 0));
			ds.add(new PlotDatum(s, s + "   ", 6));
			
			assertEquals(true, p < 2);
			double[][] e = ds.get(2).toArray(new double[3][2]);
			double[][] f = ds.get(1).toArray(new double[3][2]);
			double[][] g = ds.get(0).toArray(new double[3][1]);
			
			assertEquals(true,e.length==2);
			assertEquals(true,f.length==2);
			assertEquals(true,g.length==2);
			assertEquals(true,s.length()==6);

			
		}
		
		
	}
}	