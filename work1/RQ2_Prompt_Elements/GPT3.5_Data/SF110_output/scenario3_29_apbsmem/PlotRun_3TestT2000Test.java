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
        Iterator<PlotDatum> iterator = run.iterator();
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
        Iterator<PlotDatum> iterator = run.iterator();
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertEquals(new PlotDatum(3, 4), iterator.next());
        assertEquals(new PlotDatum(5, 6), iterator.next());
    }
    
    /**
     * Test case to verify that the iterator throws a NoSuchElementException when there are no more elements.
     */
    @Test
    void testIteratorNoSuchElementException() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        iterator.next();
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }
    
    /**
     * Test case to verify that the iterator is read-only and throws an UnsupportedOperationException when remove() is called.
     */
    @Test
    void testIteratorRemoveUnsupportedOperationException() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        assertThrows(UnsupportedOperationException.class, () -> iterator.remove());
    }
    
    /**
     * Test case to verify that the iterator is fail-fast and throws a ConcurrentModificationException when the underlying data is modified.
     */
    @Test
    void testIteratorConcurrentModificationException() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        run.add(new PlotDatum(3, 4));
        assertThrows(ConcurrentModificationException.class, () -> iterator.next());
    }
    
    /**
     * Test case to verify that the iterator works correctly with an empty run.
     */
    @Test
    void testIteratorEmptyRun() {
        PlotRun run = new PlotRun();
        Iterator<PlotDatum> iterator = run.iterator();
        assertFalse(iterator.hasNext());
    }
    
    /**
     * Test case to verify that the iterator works correctly with a run containing a single element.
     */
    @Test
    void testIteratorSingleElement() {
        PlotDatum[] data = {new PlotDatum(1, 2)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertFalse(iterator.hasNext());
    }
    
    /**
     * Test case to verify that the iterator works correctly with a run containing multiple elements with the same x-coordinate.
     */
    @Test
    void testIteratorMultipleElementsSameX() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(1, 3), new PlotDatum(1, 4)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertEquals(new PlotDatum(1, 3), iterator.next());
        assertEquals(new PlotDatum(1, 4), iterator.next());
        assertFalse(iterator.hasNext());
    }
    
    /**
     * Test case to verify that the iterator works correctly with a run containing multiple elements with the same y-coordinate.
     */
    @Test
    void testIteratorMultipleElementsSameY() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 2), new PlotDatum(5, 2)};
        PlotRun run = new PlotRun(data);
        Iterator<PlotDatum> iterator = run.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new PlotDatum(1, 2), iterator.next());
        assertEquals(new PlotDatum(3, 2), iterator.next());
        assertEquals(new PlotDatum(5, 2), iterator.next());
        assertFalse(iterator.hasNext());
    }
}