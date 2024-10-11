// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		PlotDatum thisData;

		@Test
		public void test_connectedData(){
			thisData = new PlotDatum();
			assertTrue(thisData.connected());
		}

		@Test
		public void test_toString() {
			thisData = new PlotDatum();
			assertEquals("", this.toString());
		}

		@Test
		public void test_copy(){
			this.toCopy();
			assertNotSame(null, this.toCopy());
		}
}