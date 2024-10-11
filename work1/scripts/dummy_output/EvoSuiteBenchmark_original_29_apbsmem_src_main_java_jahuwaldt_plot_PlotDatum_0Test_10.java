// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {
		
// Test method for {@link PlotDatum#PlotDatum()}.
    @Test
    public void testPlotDatum() {
        new PlotDatum();
        new PlotDatum();
    }

// The following unit test case exists to test the {@link PlotDatum#hasErrorBar()} method.
	@Test
    public void testPlotDatumHasErrorBar_0() {
        assertFalse(PlotDatum.hasErrorBar());
    }
}