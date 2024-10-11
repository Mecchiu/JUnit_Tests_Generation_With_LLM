// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		
    /** unit test class.
     */
    @Test
    void testIterator() {
		{
			AbstractStringCollection xArr = new ArrayList();
	    double xVal  = 5.0;
	    double start = 1.0;
	    double end   = 2.0;
	    List<Double> test = new ArrayList<>();
	    for (double x : xArr)
	        test.add(xVal + start);
			assertTrue(xArr.containsAll(test));
		}
    }
	
}