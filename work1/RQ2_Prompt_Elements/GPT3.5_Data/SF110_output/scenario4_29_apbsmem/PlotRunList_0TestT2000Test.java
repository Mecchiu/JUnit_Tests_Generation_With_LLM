// Here is the source code for the PlotRunList_0Test class, which tests the size() method of the PlotRunList class.

// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

    /**
     * Test case to verify that an empty PlotRunList has size 0.
     */
    @Test
    void testEmptyList() {
        PlotRunList list = new PlotRunList();
        assertEquals(0, list.size());
    }

    /**
     * Test case to verify that a PlotRunList with one run has size 1.
     */
    @Test
    void testListWithOneRun() {
        PlotRun run = new PlotRun();
        PlotRunList list = new PlotRunList(Collections.singletonList(run));
        assertEquals(1, list.size());
    }

    /**
     * Test case to verify that a PlotRunList with multiple runs has the correct size.
     */
    @Test
    void testListWithMultipleRuns() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        List<PlotRun> runs = Arrays.asList(run1, run2, run3);
        PlotRunList list = new PlotRunList(runs);
        assertEquals(3, list.size());
    }

    /**
     * Test case to verify that adding a run to an empty PlotRunList increases its size to 1.
     */
    @Test
    void testAddToEmptyList() {
        PlotRunList list = new PlotRunList();
        PlotRun run = new PlotRun();
        list.add(run);
        assertEquals(1, list.size());
    }

    /**
     * Test case to verify that adding a run to a non-empty PlotRunList increases its size by 1.
     */
    @Test
    void testAddToNonEmptyList() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList(Collections.singletonList(run1));
        list.add(run2);
        assertEquals(2, list.size());
    }

    /**
     * Test case to verify that removing a run from a PlotRunList decreases its size by 1.
     */
    @Test
    void testRemoveFromList() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        list.remove(0);
        assertEquals(1, list.size());
    }

    /**
     * Test case to verify that removing all runs from a PlotRunList sets its size to 0.
     */
    @Test
    void testRemoveAllFromList() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        list.clear();
        assertEquals(0, list.size());
    }

    /**
     * Test case to verify that setting a run in a PlotRunList does not change its size.
     */
    @Test
    void testSetInList() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        PlotRun run3 = new PlotRun();
        list.set(1, run3);
        assertEquals(2, list.size());
    }

    /**
     * Test case to verify that adding a run at a specific index in a PlotRunList increases its size by 1.
     */
    @Test
    void testAddAtIndex() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        list.add(1, run3);
        assertEquals(3, list.size());
    }

    /**
     * Test case to verify that adding a run at the end of a PlotRunList increases its size by 1.
     */
    @Test
    void testAddToEnd() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRunList list = new PlotRunList(Arrays.asList(run1, run2));
        list.add(run3);
        assertEquals(3, list.size());
    }

    /**
     * Test case to verify that removing a run from an empty PlotRunList does not change its size.
     */
    @Test
    void testRemoveFromEmptyList() {
        PlotRunList list = new PlotRunList();
        list.remove(0);
        assertEquals(0, list.size());
    }
}