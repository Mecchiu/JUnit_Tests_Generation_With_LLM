// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		/**
		*  Test suite for PlotRun.
		*/
    @Test
    void testRemove() {
	Color color = new Color(1.0f,1.0f,1.0f);
	Vector<PlotDatum> aV = new Vector<>();
	aV.add(new PlotDatum("testDatum"));
	aV.add(new PlotDatum("testDatum2"));
	aV.add(new PlotDatum("testDatum3"));
	aV.add(new PlotDatum("testDatum4"));
	aV.add(new PlotDatum("testDatum5"));
	aV.add(new PlotDatum("testDatum6"));
        PlotRun run = new PlotRun(aV);
		run.remove(0);
        assertTrue("Removing an element that doesn't exist", run.contains(new PlotDatum("testDatum")));
		assertFalse("A PlotRun should NOT contain a PlotDatum", run.contains(new PlotDatum("testDatum3")));
		assertFalse("A PlotRun should NOT contain a PlotDatum", run.contains(new PlotDatum("testDatum2")));
        assertTrue("Adding an element that doesn't exist", run.isEmpty());
        run.remove(10);
        run.remove(1);
        run.remove(0);
        run.remove(100);
        run.remove(20);
        run.remove(1);
        run.remove(100);
        run.remove(5);
        run.remove(15);
        run.remove(2);
        run.remove(3);
        run.remove(10);
        run.clear();
	assertTrue("Removing an empty PlotRun should raise exception", run.contains(new PlotDatum("testDatum")));
}
}