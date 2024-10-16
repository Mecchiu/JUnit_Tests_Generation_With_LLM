// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatumTest {
		
	/**
	* Test method for {@link PlotDatum#connected()}.
	*/
	@Test
	void testConnected() {
		PlotDatum datum = new PlotDatum();
		assertTrue(datum.connected());
	}
}