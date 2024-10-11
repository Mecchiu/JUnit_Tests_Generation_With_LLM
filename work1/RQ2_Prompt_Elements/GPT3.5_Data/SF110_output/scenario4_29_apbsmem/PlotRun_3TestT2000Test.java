// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRun}.
 * It contains ten unit test cases for the {@link PlotRun#iterator()} method.
 */
class PlotRun_3Test {

    /**
     * Test case to verify that the iterator returns the correct number of elements.
     */
    @Test
    void testIteratorSize() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4), new PlotDatum(5, 6)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(3, count);
    }

    /**
     * Test case to verify that the iterator returns the correct elements in the correct order.
     */
    @Test
    void testIteratorOrder() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4), new PlotDatum(5, 6)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(3, 4), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(5, 6), iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator throws a NoSuchElementException when there are no more elements.
     */
    @Test
    void testIteratorNoSuchElementException() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    /**
     * Test case to verify that the iterator can handle an empty run.
     */
    @Test
    void testIteratorEmptyRun() {
        PlotRun run = new PlotRun();
        Iterator iterator = run.iterator();
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator can handle a run with one element.
     */
    @Test
    void testIteratorSingleElement() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator can handle a run with multiple elements of the same value.
     */
    @Test
    void testIteratorMultipleSameElements() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(1, 2), new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator can handle a run with multiple elements of different values.
     */
    @Test
    void testIteratorMultipleDifferentElements() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4), new PlotDatum(5, 6)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(3, 4), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(5, 6), iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator can handle a run with null elements.
     */
    @Test
    void testIteratorNullElements() {
        PlotDatum[] data = {new PlotDatum(1, 2), null, new PlotDatum(5, 6)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(5, 6), iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case to verify that the iterator can handle a run with mixed types of elements.
     */
    @Test
    void testIteratorMixedTypes() {
        PlotDatum[] data = {new PlotDatum(1, 2), "not a PlotDatum", new PlotDatum(5, 6)};
        PlotRun run = new PlotRun(data);
        Iterator iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertTrue(iterator.hasNext());
        assertThrows(ClassCastException.class, () -> iterator.next());
    }

    /**
     * Test case to verify that the iterator can handle a run with elements that are not PlotDatum objects.
     */
    @Test
    void testIteratorNonPlotDatumElements() {
        Object[] data = {new Object(), new Object(), new Object()};
        PlotRun run = new PlotRun(Arrays.asList(data));
        Iterator iterator = run.iterator();
        assertFalse(iterator.hasNext());
    }
}