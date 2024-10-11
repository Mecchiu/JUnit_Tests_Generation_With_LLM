// PlotDatumTest.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatumTest {
		
	/**
	* Test case for {@link PlotDatum#hasErrorBar()} method.
	*/
	@Test
	void testHasErrorBar() {
		PlotDatum datum = new PlotDatum();
		assertFalse(datum.hasErrorBar());
	}
}