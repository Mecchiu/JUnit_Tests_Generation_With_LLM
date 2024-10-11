// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		
    /**
     * Set up the test.
     * It includes one "basic setup" for calling methods that are being tested
     * (set of the form "add()") and other methods that are being tested
     * (set of the form "remove()"):
     * Set up the run list:

     *     int runLength=size();
     *     PlotRun runList[];  (array) an array containing run objects.
     *     set(array runs);       (array of run objects)
     *     clear(array runs);      (array of run objects)

     * An array of plots to make up the run list and remove.  Plot1 is a
     * set of two plots.  Plot2 is a set of three plots.
     * Set up a new PlotRun object from the passed in runList.
     * Note: PlotRun objects use objects referenced by the name arrays
     * (see above).   If the objects don't have a defined plotId,
     * they have no data set associated.
     * @param	runList An array of PlotRun objects.
     */

    static void test(PlotRun runList[], String toTest) {
        Map<String, PlotDrawArea> plots = new HashMap<String, PlotDrawArea>();

        if (toTest.endsWith("PlotRunList")) {
        int plen = runList.length;

        if (plen < 6) {
            plenError(toTest,plen);
        }
        }

        setPlots(plen,runs);

        // remove the first run;
        int runIndex = 0;
        int plenPl = 0;
        while ((runIndex < plen) && (plenPl < 20)) {
            plenPl = plots.size();
            runIndex ++;
        }
        assertEquals(plen,runIndex);
        System.out.println("runIndex "+runIndex+
                "plenPl "+plenPl+
                "runs "+runList);

        for (int r=runIndex;r<plen;r++) {
            assertFalse(plans.containsKey(runList[r].getPlotId()));
        }
        plenPl = plots.size();
        runIndex ++;
        for (int g=0;g<plenPl;g++) {
            PlotDrawArea plot = plots.get(runList[runIndex].getPlotId());
            runIndex ++;
            assertNotNull(plot);
        }
        assertEquals(plenPl,plen);
        System.out.println("All plots");
}
}