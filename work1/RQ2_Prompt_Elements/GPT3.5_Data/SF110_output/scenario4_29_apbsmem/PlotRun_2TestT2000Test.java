// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRun}.
 * It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
 */
class PlotRun_2Test {

    /**
     * Test removing an element from an empty plot run.
     */
    @Test
    void testRemoveFromEmpty() {
        PlotRun run = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
    }

    /**
     * Test removing an element from a plot run with one element.
     */
    @Test
    void testRemoveFromOneElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        assertEquals(1, run.size());
        assertEquals(new PlotDatum(1.0, 2.0), run.remove(0));
        assertEquals(0, run.size());
    }

    /**
     * Test removing the first element from a plot run with multiple elements.
     */
    @Test
    void testRemoveFirstElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        assertEquals(3, run.size());
        assertEquals(new PlotDatum(1.0, 2.0), run.remove(0));
        assertEquals(2, run.size());
        assertEquals(new PlotDatum(2.0, 3.0), run.get(0));
        assertEquals(new PlotDatum(3.0, 4.0), run.get(1));
    }

    /**
     * Test removing the last element from a plot run with multiple elements.
     */
    @Test
    void testRemoveLastElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        assertEquals(3, run.size());
        assertEquals(new PlotDatum(3.0, 4.0), run.remove(2));
        assertEquals(2, run.size());
        assertEquals(new PlotDatum(1.0, 2.0), run.get(0));
        assertEquals(new PlotDatum(2.0, 3.0), run.get(1));
    }

    /**
     * Test removing an element from the middle of a plot run with odd number of elements.
     */
    @Test
    void testRemoveMiddleElementOdd() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        run.add(new PlotDatum(4.0, 5.0));
        run.add(new PlotDatum(5.0, 6.0));
        assertEquals(5, run.size());
        assertEquals(new PlotDatum(3.0, 4.0), run.remove(2));
        assertEquals(4, run.size());
        assertEquals(new PlotDatum(1.0, 2.0), run.get(0));
        assertEquals(new PlotDatum(2.0, 3.0), run.get(1));
        assertEquals(new PlotDatum(4.0, 5.0), run.get(2));
        assertEquals(new PlotDatum(5.0, 6.0), run.get(3));
    }

    /**
     * Test removing an element from the middle of a plot run with even number of elements.
     */
    @Test
    void testRemoveMiddleElementEven() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        run.add(new PlotDatum(4.0, 5.0));
        assertEquals(4, run.size());
        assertEquals(new PlotDatum(2.0, 3.0), run.remove(1));
        assertEquals(3, run.size());
        assertEquals(new PlotDatum(1.0, 2.0), run.get(0));
        assertEquals(new PlotDatum(3.0, 4.0), run.get(1));
        assertEquals(new PlotDatum(4.0, 5.0), run.get(2));
    }

    /**
     * Test removing an element with an index out of bounds.
     */
    @Test
    void testRemoveIndexOutOfBounds() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(1));
    }

    /**
     * Test removing a null element.
     */
    @Test
    void testRemoveNull() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        assertThrows(NullPointerException.class, () -> run.remove(null));
    }

    /**
     * Test removing an element that is not in the plot run.
     */
    @Test
    void testRemoveNonexistentElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        assertThrows(IllegalArgumentException.class, () -> run.remove(new PlotDatum(3.0, 4.0)));
    }

    /**
     * Test removing all elements from a plot run.
     */
    @Test
    void testRemoveAllElements() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        assertEquals(3, run.size());
        run.clear();
        assertEquals(0, run.size());
    }
}