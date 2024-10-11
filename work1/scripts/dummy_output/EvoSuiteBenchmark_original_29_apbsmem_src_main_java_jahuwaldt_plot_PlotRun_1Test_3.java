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
		* Unit test for {@link PlotRun#get(int) <code>get()</code>}.
		*/
		@Test
		void testGet() {

			assertEquals("testGet()", "test", get(0).getName());
			assertEquals("testGet()", null, get(1));
		}
}