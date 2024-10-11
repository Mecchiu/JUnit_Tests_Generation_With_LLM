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
		public PlotDatum_0Test() {
	}

    @Test
    public void testHasErrorBar_ReturnsExpectedResult() {
        assertTrue("Expected a color code 0 for a data point with an error bar.",
                    new PlotDatum(new Color(0, 0, 0, 255),
                                  new Color(0f, 0f, 0f, 200),
                                  Color.black,
                                  Color.white, 1)
                   .hasErrorBar());
    }
}