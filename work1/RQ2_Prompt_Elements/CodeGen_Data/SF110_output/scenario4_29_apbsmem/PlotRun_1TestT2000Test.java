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

	@Test
	void testGetRun() throws Exception {
		
		// Initialize a new run
		PlotRun run = new PlotRun();
		
		// Check the number of data points
		assertTrue(run.size() == 10);
		
		// Check the get method
		Object datum2 = run.get(0);
		assertTrue("datum2 did not return the specified PlotDatum object",
				Datum.class.isAssignableFrom(datum2.getClass()));
	}
}

// $Log: PlotRun_1Test.java,v $
// Revision 1.7  2012/12/03 19:19:02  jahuwaldt
// Fixed errors in get()
//
// Revision 1.6  2011/08/26 15:49:17  jahuwaldt
// Fix NullPointerExcpetion
//
// Revision 1.5  2011/07/25 14:42:32  sll
// Make PlotRun_1Test.java a subclass of AbstractList
//
// Revision 1.4  2011/07/25 09:22:42  sll
// Fixed NullPointerException while passing null to get()
//
// Revision 1.3  2011/07/05 07:02:31  sll
// Major refactoring of the get() method
//
// Revision 1.2  2011/07/05 03:42:34  sll
// Added tests that work for Plot runs only.
//
// Revision 1.1  2011/07/03 04:11:09  sll
// Initial revision
//
