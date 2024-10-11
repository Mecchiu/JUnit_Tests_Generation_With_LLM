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
		
	@Test
    public void test(){
		{
			PlotDatum plotDatum = new PlotDatum( Color.BLUE, Color.BLACK, 100, 50, "x", 30, 20, 0);
			assertTrue( plotDatum.hasErrorBar());
		}
		{
			Color colorWhite = new Color( 250, 240, 255);
			PlotDatum plotDatum = new PlotDatum( colorWhite, colorWhite, 50, 20, "x", 50, 30, 0);
            assertFalse( plotDatum.hasErrorBar());
		}
    }

}