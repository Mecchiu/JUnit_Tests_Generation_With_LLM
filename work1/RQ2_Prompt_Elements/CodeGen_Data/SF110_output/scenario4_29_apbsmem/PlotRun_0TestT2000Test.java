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
		*  The test case for the {@link PlotRun#size()} method.
		*
		*  @throws  java.util.ArithmeticException - The test case relies on
		*			  int-typed data.  Int arithmetic operations are not
		*			  supported.
		*  <br/>
		*  @throws java.util.ArrayIndexOutOfBoundsException - The test case relies
		*			  on the specified array size.
		*/
        @Test
	public void size() throws Exception {
	        Double d1[]  = new Double[2];
	        assertEquals(2, PlotRun.size(Arrays.asList(d1, d1)));
	}
}

