// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRunList}.
 * It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
 */
class PlotRunList_2Test {

    /**
     * Test removing the first element from a run list with one element.
     */
    @Test
    void testRemoveFirstElementFromOneElementList() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        Object removed = list.remove(0);
        assertEquals(run, removed);
        assertEquals(0, list.size());
    }

    /**
     * Test removing the only element from a run list with one element.
     */
    @Test
    void testRemoveOnlyElementFromOneElementList() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        Object removed = list.remove(0);
        assertEquals(run, removed);
        assertEquals(0, list.size());
    }

    /**
     * Test removing the last element from a run list with one element.
     */
    @Test
    void testRemoveLastElementFromOneElementList() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        Object removed = list.remove(0);
        assertEquals(run, removed);
        assertEquals(0, list.size());
    }

    /**
     * Test removing the first element from a run list with multiple elements.
     */
    @Test
    void testRemoveFirstElementFromMultipleElementList() {
        PlotDatum[] data1 = {new PlotDatum(1.0, 2.0)};
        PlotDatum[] data2 = {new PlotDatum(3.0, 4.0)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        Object removed = list.remove(0);
        assertEquals(run1, removed);
        assertEquals(1, list.size());
        assertEquals(run2, list.get(0));
    }

    /**
     * Test removing the middle element from a run list with multiple elements.
     */
    @Test
    void testRemoveMiddleElementFromMultipleElementList() {
        PlotDatum[] data1 = {new PlotDatum(1.0, 2.0)};
        PlotDatum[] data2 = {new PlotDatum(3.0, 4.0)};
        PlotDatum[] data3 = {new PlotDatum(5.0, 6.0)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRun run3 = new PlotRun(data3);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2, run3));
        Object removed = list.remove(1);
        assertEquals(run2, removed);
        assertEquals(2, list.size());
        assertEquals(run1, list.get(0));
        assertEquals(run3, list.get(1));
    }

    /**
     * Test removing the last element from a run list with multiple elements.
     */
    @Test
    void testRemoveLastElementFromMultipleElementList() {
        PlotDatum[] data1 = {new PlotDatum(1.0, 2.0)};
        PlotDatum[] data2 = {new PlotDatum(3.0, 4.0)};
        PlotRun run1 = new PlotRun(data1);
        PlotRun run2 = new PlotRun(data2);
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        Object removed = list.remove(1);
        assertEquals(run2, removed);
        assertEquals(1, list.size());
        assertEquals(run1, list.get(0));
    }

    /**
     * Test removing an element from an empty run list.
     */
    @Test
    void testRemoveFromEmptyList() {
        PlotRunList list = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    /**
     * Test removing an element with an index greater than the size of the run list.
     */
    @Test
    void testRemoveWithIndexGreaterThanSize() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    /**
     * Test removing an element with a negative index.
     */
    @Test
    void testRemoveWithNegativeIndex() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun run = new PlotRun(data);
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    /**
     * Test removing an element with a null object.
     */
    @Test
    void testRemoveWithNullObject() {
        PlotRunList list = new PlotRunList();
        assertThrows(NullPointerException.class, () -> list.remove(null));
    }
}