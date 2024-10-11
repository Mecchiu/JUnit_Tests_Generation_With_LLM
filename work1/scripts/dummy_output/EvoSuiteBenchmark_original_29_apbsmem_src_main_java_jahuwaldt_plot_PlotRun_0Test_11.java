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
		 *  Test of the size() method, of the run.
		 */
		
		@Test
    public void testSize() {
		      List run = new ArrayList();
	                run.add(new PlotDatum(Color.blue));
           ArrayList result = new ArrayList();
             result.add(PlotUtil.plotDimensions(run));
           assertEquals(Color.blue, result.get(0));
		}
}