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
    public void testHasErrorBar() {
        new PlotDatum(1, 4, 2));
        final boolean hasErrorBar = PlotDatum.hasErrorBar(1, 4, 2);
        assertTrue("hasErrorBar must return true", hasErrorBar);
    }
 
    @Test
    public void testEquals() {
        final PlotDatum p1 = new PlotDatum(1, 4, 2);
        final PlotDatum p2 = new PlotDatum(1, 4, 2);
        final PlotDatum p3 = new PlotDatum(1, 4, 2);
        final PlotDatum p4 = new PlotDatum(1, 4, 2);
        final PlotDatum p5 = new PlotDatum(1, 4, 2);
        final PlotDatum p6 = new PlotDatum(1, 4, 2);
        final PlotDatum p7 = new PlotDatum(1, 4, 2);
        final PlotDatum p8 = new PlotDatum(1, 4, 2);
        final PlotDatum p9 = new PlotDatum(1, 4, 2);
        final PlotDatum p10 = new PlotDatum(1, 4, 2);
        final boolean hasErrorBar1 = PlotDatum.hasErrorBar(1, 4, 2);
        final boolean hasErrorBar2 = PlotDatum.hasErrorBar(1, 4, 2);
        final boolean hasErrorBar3 = PlotDatum.hasErrorBar(1, 4, 3);
        final boolean hasErrorBar4 = PlotDatum.hasErrorBar(1, 4, 3);
        final boolean hasErrorBar5 = PlotDatum.hasErrorBar(1, 4, 4);
        final boolean hasErrorBar6 = PlotDatum.hasErrorBar(1, 4, 4);
        final boolean hasErrorBar7 = PlotDatum.hasErrorBar(1, 4, 5);
        final boolean hasErrorBar8 = PlotDatum.hasErrorBar(1, 4, 5);
        final boolean hasErrorBar9 = PlotDatum.hasErrorBar(1, 4, 5);
        final boolean hasErrorBar10 = PlotDatum.hasErrorBar(1, 4, 6);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar2);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar3);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar4);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar5);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar6);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar7);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar8);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar9);
        assertTrue("Equals method must return true", hasErrorBar1 == hasErrorBar10);
    }

    @Test
    public void testClone() {
        final PlotDatum p1 = new PlotDatum(1, 4, 2);
        final PlotDatum p2 = p1.clone();
        assertTrue("Clone method should clone the same object",
            p1.equals(p2));
    }

    @Test
    public void testSerialization() throws Exception {
        final boolean hasErrorBar1 = PlotDatum.hasErrorBar(1, 4, 2);
        final boolean hasErrorBar2 = PlotDatum.hasErrorBar(1, 4, 2);
        assertTrue("Serialization method must return true",
			hasErrorBar1 == hasErrorBar2);
    }

	/**
     *  Returns a new object in which the value of a property must
     *  be the same as that of another object.
     */
    private PlotDatum newPlotDatum(final long value, final double valueX, final double valueY) {
        final PlotDatum d = new PlotDatum(value, valueX, valueY);
        d.reset();
        return d;
    }

}