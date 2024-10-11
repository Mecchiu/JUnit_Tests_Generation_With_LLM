// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRun}.
 * It contains ten unit test cases for the {@link PlotRun#get(int)} method.
 */
class PlotRun_1Test {

    /**
     * Test case for getting the first element in the run.
     */
    @Test
    void testGetFirstElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(datum1, run.get(0));
    }

    /**
     * Test case for getting the last element in the run.
     */
    @Test
    void testGetLastElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(datum3, run.get(2));
    }

    /**
     * Test case for getting an element in the middle of the run.
     */
    @Test
    void testGetMiddleElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(datum2, run.get(1));
    }

    /**
     * Test case for getting an element with an index out of bounds (negative).
     */
    @Test
    void testGetNegativeIndex() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
    }

    /**
     * Test case for getting an element with an index out of bounds (too large).
     */
    @Test
    void testGetIndexTooLarge() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
    }

    /**
     * Test case for getting an element from an empty run.
     */
    @Test
    void testGetFromEmptyRun() {
        PlotRun run = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
    }

    /**
     * Test case for getting an element from a run with one element.
     */
    @Test
    void testGetFromSingleElementRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotRun run = new PlotRun(Collections.singletonList(datum1));
        assertEquals(datum1, run.get(0));
    }

    /**
     * Test case for getting an element with a null value.
     */
    @Test
    void testGetNullElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = null;
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertNull(run.get(1));
    }

    /**
     * Test case for getting an element with a non-PlotDatum object.
     */
    @Test
    void testGetNonPlotDatumElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        String nonDatum = "not a PlotDatum";
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, nonDatum, datum3));
        assertThrows(ClassCastException.class, () -> run.get(1));
    }

    /**
     * Test case for getting an element with a negative zero value.
     */
    @Test
    void testGetNegativeZeroElement() {
        PlotDatum datum1 = new PlotDatum(-0.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(datum1, run.get(0));
    }
}