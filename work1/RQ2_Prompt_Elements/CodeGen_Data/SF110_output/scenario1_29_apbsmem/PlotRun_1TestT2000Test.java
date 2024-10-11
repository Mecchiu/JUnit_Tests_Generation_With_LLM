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
		    * Test of get method, of class PlotRun_1.
		*/
		@Test
		public void test_get() {
			Object[] arr = new Object[]{ null };
			for (int i = 0; i < 5; i++) {
                assertEquals("0", 
                        new ArrayList(0).get(i).get(0).getClass().getName());
			}

		}
    }

