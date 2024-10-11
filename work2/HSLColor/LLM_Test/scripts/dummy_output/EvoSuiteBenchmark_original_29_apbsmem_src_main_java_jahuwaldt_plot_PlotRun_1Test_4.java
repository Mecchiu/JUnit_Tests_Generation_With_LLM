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
		 *  Make a clone of this test object.
		 */
		private PlotRun_1Test() {
		}

		/**
		 *  Test method for {@link PlotRun#get(int)}.
		 *
		 *  @throws ClassCastException if any of the test criteria are not
		 *                             correct.
		*/
		@Test
		public void testGet() throws ClassCastException {
			// Arrange
			PlotRun_1Test obj1 = this;

            // Act
			Object ret = obj1.get(0);

			// Assert
			if (ret!= obj1) {
				fail("Unexpected result from object creation for method " + "get(0): " + ret + "!= " + obj1);
			}
		}
}