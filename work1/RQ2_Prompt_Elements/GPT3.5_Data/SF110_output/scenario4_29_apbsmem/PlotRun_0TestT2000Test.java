// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {

    /**
     * Test case to verify that an empty plot run has size 0.
     */
    @Test
    void testEmptyPlotRunSize() {
        PlotRun run = new PlotRun();
        assertEquals(0, run.size());
    }

    /**
     * Test case to verify that a plot run with one data point has size 1.
     */
    @Test
    void testPlotRunWithOneDataPointSize() {
        PlotDatum datum = new PlotDatum(1.0, 2.0);
        PlotRun run = new PlotRun(Collections.singletonList(datum));
        assertEquals(1, run.size());
    }

    /**
     * Test case to verify that a plot run with multiple data points has the correct size.
     */
    @Test
    void testPlotRunWithMultipleDataPointsSize() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(3, run.size());
    }

    /**
     * Test case to verify that adding a data point to an empty plot run increases its size to 1.
     */
    @Test
    void testAddDataPointToEmptyPlotRun() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        assertEquals(1, run.size());
    }

    /**
     * Test case to verify that adding a data point to a non-empty plot run increases its size by 1.
     */
    @Test
    void testAddDataPointToNonEmptyPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Collections.singletonList(datum1));
        run.add(datum2);
        assertEquals(2, run.size());
    }

    /**
     * Test case to verify that removing a data point from a plot run decreases its size by 1.
     */
    @Test
    void testRemoveDataPointFromPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        run.remove(0);
        assertEquals(1, run.size());
    }

    /**
     * Test case to verify that removing all data points from a plot run sets its size to 0.
     */
    @Test
    void testRemoveAllDataPointsFromPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        run.clear();
        assertEquals(0, run.size());
    }

    /**
     * Test case to verify that setting a data point in a plot run does not change its size.
     */
    @Test
    void testSetDataPointInPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        run.set(0, new PlotDatum(3.0, 4.0));
        assertEquals(2, run.size());
    }

    /**
     * Test case to verify that inserting a data point into a plot run increases its size by 1.
     */
    @Test
    void testInsertDataPointIntoPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Collections.singletonList(datum1));
        run.add(0, datum2);
        assertEquals(2, run.size());
    }

    /**
     * Test case to verify that iterating over a plot run returns the correct number of data points.
     */
    @Test
    void testIterateOverPlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        int count = 0;
        for (Object obj : run) {
            count++;
        }
        assertEquals(2, count);
    }

    /**
     * Test case to verify that cloning a plot run returns a new object with the same size.
     */
    @Test
    void testClonePlotRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = (PlotRun) run1.clone();
        assertEquals(run1.size(), run2.size());
    }
}