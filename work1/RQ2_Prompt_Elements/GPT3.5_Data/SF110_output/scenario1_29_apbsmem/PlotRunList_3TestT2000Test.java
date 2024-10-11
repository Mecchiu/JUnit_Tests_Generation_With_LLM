// Here's an example implementation of the PlotRunList_3Test class with ten unit test cases for the iterator() method:

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
     * Test case for an empty PlotRunList.
     */
    @Test
    void testEmptyList() {
        PlotRunList list = new PlotRunList();
        Iterator iterator = list.iterator();
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with one run of one datum.
     */
    @Test
    void testOneRunOneDatum() {
        PlotDatum datum = new PlotDatum(1.0, 2.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with one run of multiple data.
     */
    @Test
    void testOneRunMultipleData() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0);
        PlotDatum datum3 = new PlotDatum(5.0, 6.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum1, datum2, datum3});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with multiple runs of one datum.
     */
    @Test
    void testMultipleRunsOneDatum() {
        PlotDatum datum = new PlotDatum(1.0, 2.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum});
        list.add(new PlotDatum[] {datum});
        list.add(new PlotDatum[] {datum});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with multiple runs of multiple data.
     */
    @Test
    void testMultipleRunsMultipleData() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0);
        PlotDatum datum3 = new PlotDatum(5.0, 6.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum1, datum2});
        list.add(new PlotDatum[] {datum3});
        list.add(new PlotDatum[] {datum1, datum3});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with null runs.
     */
    @Test
    void testNullRuns() {
        PlotRunList list = new PlotRunList();
        list.add(null);
        list.add(null);
        Iterator iterator = list.iterator();
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with a null datum.
     */
    @Test
    void testNullDatum() {
        PlotDatum datum = new PlotDatum(1.0, 2.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum, null, datum});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for a PlotRunList with a large number of runs and data.
     */
    @Test
    void testLargeList() {
        PlotRunList list = new PlotRunList();
        for (int i = 0; i < 1000; i++) {
            PlotDatum datum1 = new PlotDatum(i, i+1);
            PlotDatum datum2 = new PlotDatum(i+2, i+3);
            list.add(new PlotDatum[] {datum1, datum2});
        }
        Iterator iterator = list.iterator();
        for (int i = 0; i < 2000; i += 2) {
            assertTrue(iterator.hasNext());
            assertEquals(new PlotDatum(i, i+1), iterator.next());
            assertTrue(iterator.hasNext());
            assertEquals(new PlotDatum(i+2, i+3), iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    /**
     * Test case for the remove() method of the iterator.
     */
    @Test
    void testIteratorRemove() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0);
        PlotDatum datum3 = new PlotDatum(5.0, 6.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum1, datum2});
        list.add(new PlotDatum[] {datum3});
        list.add(new PlotDatum[] {datum1, datum3});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        iterator.remove();
        assertTrue(iterator.hasNext());
        assertEquals(datum2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        iterator.remove();
        assertTrue(iterator.hasNext());
        assertEquals(datum3, iterator.next());
        assertFalse(iterator.hasNext());
        assertEquals(2, list.size());
        assertEquals(2, list.get(0).length);
        assertEquals(datum2, list.get(0)[0]);
        assertEquals(datum3, list.get(0)[1]);
        assertEquals(1, list.get(1).length);
        assertEquals(datum3, list.get(1)[0]);
    }

    /**
     * Test case for the remove() method of the iterator when called twice in a row.
     */
    @Test
    void testIteratorRemoveTwice() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0);
        PlotRunList list = new PlotRunList();
        list.add(new PlotDatum[] {datum1, datum2});
        Iterator iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        iterator.remove();
        assertTrue(iterator.hasNext());
        assertEquals(datum2, iterator.next());
        iterator.remove();
        assertFalse(iterator.hasNext());
        assertEquals(0, list.size());
    }

}