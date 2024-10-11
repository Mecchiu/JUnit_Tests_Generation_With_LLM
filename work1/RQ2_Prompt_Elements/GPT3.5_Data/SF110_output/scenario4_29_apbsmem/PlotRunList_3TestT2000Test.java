// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRunList}.
 * It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
 */
class PlotRunList_3Test {

    /**
     * Test case to verify that the iterator returns all the plot runs in the list.
     */
    @Test
    void testIteratorReturnsAllPlotRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotDatum[] data2 = {new PlotDatum(3, 4), new PlotDatum(4, 5)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(2, runs.size());
        assertTrue(runs.contains(run1));
        assertTrue(runs.contains(run2));
    }

    /**
     * Test case to verify that the iterator throws a NoSuchElementException when there are no more elements to iterate.
     */
    @Test
    void testIteratorThrowsNoSuchElementException() {
        PlotRunList list = new PlotRunList();

        Iterator iterator = list.iterator();

        assertThrows(NoSuchElementException.class, () -> {
            iterator.next();
        });
    }

    /**
     * Test case to verify that the iterator throws an UnsupportedOperationException when the remove() method is called.
     */
    @Test
    void testIteratorThrowsUnsupportedOperationException() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotRun run1 = new PlotRun(data1);
        PlotRunList list = new PlotRunList(Collections.singletonList(run1));

        Iterator iterator = list.iterator();

        assertThrows(UnsupportedOperationException.class, () -> {
            iterator.remove();
        });
    }

    /**
     * Test case to verify that the iterator returns the plot runs in the correct order.
     */
    @Test
    void testIteratorReturnsPlotRunsInCorrectOrder() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotDatum[] data2 = {new PlotDatum(3, 4), new PlotDatum(4, 5)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(run1, runs.get(0));
        assertEquals(run2, runs.get(1));
    }

    /**
     * Test case to verify that the iterator can handle an empty plot run list.
     */
    @Test
    void testIteratorHandlesEmptyPlotRunList() {
        PlotRunList list = new PlotRunList();

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertTrue(runs.isEmpty());
    }

    /**
     * Test case to verify that the iterator can handle a plot run list with one plot run.
     */
    @Test
    void testIteratorHandlesPlotRunListWithOnePlotRun() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotRun run1 = new PlotRun(data1);
        PlotRunList list = new PlotRunList(Collections.singletonList(run1));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(1, runs.size());
        assertEquals(run1, runs.get(0));
    }

    /**
     * Test case to verify that the iterator can handle a plot run list with multiple plot runs.
     */
    @Test
    void testIteratorHandlesPlotRunListWithMultiplePlotRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotDatum[] data2 = {new PlotDatum(3, 4), new PlotDatum(4, 5)};
        PlotDatum[] data3 = {new PlotDatum(5, 6), new PlotDatum(6, 7)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRun run3 = new PlotRun(data3);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2, run3));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(3, runs.size());
        assertTrue(runs.contains(run1));
        assertTrue(runs.contains(run2));
        assertTrue(runs.contains(run3));
    }

    /**
     * Test case to verify that the iterator can handle a plot run list with null plot runs.
     */
    @Test
    void testIteratorHandlesPlotRunListWithNullPlotRuns() {
        PlotRunList list = new PlotRunList(Arrays.asList(null, null, null));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(3, runs.size());
        assertTrue(runs.contains(null));
    }

    /**
     * Test case to verify that the iterator can handle a plot run list with a mix of null and non-null plot runs.
     */
    @Test
    void testIteratorHandlesPlotRunListWithMixOfNullAndNonNullPlotRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(2, 3)};
        PlotRun run1 = new PlotRun(data1);
        PlotRunList list = new PlotRunList(Arrays.asList(null, run1, null));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(3, runs.size());
        assertTrue(runs.contains(null));
        assertTrue(runs.contains(run1));
    }

    /**
     * Test case to verify that the iterator can handle a plot run list with plot runs that have no plot data.
     */
    @Test
    void testIteratorHandlesPlotRunListWithPlotRunsWithNoPlotData() {
        PlotRun run1 = new PlotRun(new PlotDatum[0]);
        PlotRun run2 = new PlotRun(new PlotDatum[0]);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));

        Iterator iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        while (iterator.hasNext()) {
            runs.add((PlotRun) iterator.next());
        }

        assertEquals(2, runs.size());
        assertTrue(runs.contains(run1));
        assertTrue(runs.contains(run2));
    }
}