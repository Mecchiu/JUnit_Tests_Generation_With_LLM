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
     * Test case to verify that an empty PlotRun has size 0.
     */
    @Test
    void testEmptyPlotRunSize() {
        PlotRun plotRun = new PlotRun();
        assertEquals(0, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with one PlotDatum has size 1.
     */
    @Test
    void testPlotRunSizeWithOnePlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        assertEquals(1, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with multiple PlotDatum objects has the correct size.
     */
    @Test
    void testPlotRunSizeWithMultiplePlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        plotRun.add(new PlotDatum(2, 3));
        plotRun.add(new PlotDatum(3, 4));
        assertEquals(3, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with a null PlotDatum object has size 1.
     */
    @Test
    void testPlotRunSizeWithNullPlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(null);
        assertEquals(1, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with a mix of null and non-null PlotDatum objects has the correct size.
     */
    @Test
    void testPlotRunSizeWithMixedNullAndNonNullPlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        plotRun.add(null);
        plotRun.add(new PlotDatum(3, 4));
        assertEquals(3, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with a large number of PlotDatum objects has the correct size.
     */
    @Test
    void testPlotRunSizeWithLargeNumberOfPlotDatum() {
        PlotRun plotRun = new PlotRun();
        for (int i = 0; i < 1000; i++) {
            plotRun.add(new PlotDatum(i, i+1));
        }
        assertEquals(1000, plotRun.size());
    }
    
    /**
     * Test case to verify that a PlotRun with a negative size throws an exception.
     */
    @Test
    void testPlotRunSizeWithNegativeSize() {
        PlotRun plotRun = new PlotRun();
        assertThrows(IllegalArgumentException.class, () -> {
            plotRun.size(-1);
        });
    }
    
    /**
     * Test case to verify that a PlotRun with a size greater than the number of PlotDatum objects throws an exception.
     */
    @Test
    void testPlotRunSizeWithSizeGreaterThanNumberOfPlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        plotRun.add(new PlotDatum(2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            plotRun.size(3);
        });
    }
    
    /**
     * Test case to verify that a PlotRun with a size equal to the number of PlotDatum objects has the correct size.
     */
    @Test
    void testPlotRunSizeWithSizeEqualToNumberOfPlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        plotRun.add(new PlotDatum(2, 3));
        assertEquals(2, plotRun.size(2));
    }
    
    /**
     * Test case to verify that a PlotRun with a size less than the number of PlotDatum objects has the correct size.
     */
    @Test
    void testPlotRunSizeWithSizeLessThanNumberOfPlotDatum() {
        PlotRun plotRun = new PlotRun();
        plotRun.add(new PlotDatum(1, 2));
        plotRun.add(new PlotDatum(2, 3));
        assertEquals(1, plotRun.size(1));
    }
}