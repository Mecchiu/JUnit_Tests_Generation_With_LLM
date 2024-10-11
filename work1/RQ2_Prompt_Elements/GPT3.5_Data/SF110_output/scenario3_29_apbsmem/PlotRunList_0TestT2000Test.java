// Here's an example implementation of the PlotRunList class and a test class for its size() method:

// PlotRunList.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a list of runs of data in a plot.
 *      A run is an array or list of PlotDatum objects.  A run
 *      list is an array or list of runs.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version November 20, 2000
 */
public class PlotRunList extends AbstractList implements Cloneable, java.io.Serializable {

    private List<List<PlotDatum>> runs;

    /**
     *  Constructs an empty plot run list.
     */
    public PlotRunList() {
        runs = new ArrayList<>();
    }

    /**
     *  Returns the number of PlotRun objects in this run list.
     *
     * @return The number of plot run objects in this run list.
     */
    public int size() {
        return runs.size();
    }

    /**
     *  Returns the PlotRun object at the specified index.
     *
     * @param index The index of the PlotRun object to return.
     * @return The PlotRun object at the specified index.
     */
    public List<PlotDatum> get(int index) {
        return runs.get(index);
    }

    /**
     *  Adds a new PlotRun object to the end of the run list.
     *
     * @param run The PlotRun object to add to the end of the run list.
     * @return True if the PlotRun object was successfully added to the run list.
     */
    public boolean add(List<PlotDatum> run) {
        return runs.add(run);
    }

    /**
     *  Removes the PlotRun object at the specified index from the run list.
     *
     * @param index The index of the PlotRun object to remove.
     * @return The PlotRun object that was removed from the run list.
     */
    public List<PlotDatum> remove(int index) {
        return runs.remove(index);
    }

    /**
     *  Returns a shallow copy of this PlotRunList object.
     *
     * @return A shallow copy of this PlotRunList object.
     */
    public Object clone() {
        PlotRunList copy = new PlotRunList();
        for (List<PlotDatum> run : runs) {
            copy.add(new ArrayList<>(run));
        }
        return copy;
    }

}

// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

    @Test
    void testEmptyList() {
        PlotRunList list = new PlotRunList();
        assertEquals(0, list.size());
    }

    @Test
    void testSingleRun() {
        PlotRunList list = new PlotRunList();
        List<PlotDatum> run = new ArrayList<>();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        list.add(run);
        assertEquals(1, list.size());
    }

    @Test
    void testMultipleRuns() {
        PlotRunList list = new PlotRunList();
        List<PlotDatum> run1 = new ArrayList<>();
        run1.add(new PlotDatum(1, 2));
        run1.add(new PlotDatum(3, 4));
        List<PlotDatum> run2 = new ArrayList<>();
        run2.add(new PlotDatum(5, 6));
        run2.add(new PlotDatum(7, 8));
        list.add(run1);
        list.add(run2);
        assertEquals(2, list.size());
    }

    @Test
    void testAddRemove() {
        PlotRunList list = new PlotRunList();
        List<PlotDatum> run1 = new ArrayList<>();
        run1.add(new PlotDatum(1, 2));
        run1.add(new PlotDatum(3, 4));
        List<PlotDatum> run2 = new ArrayList<>();
        run2.add(new PlotDatum(5, 6));
        run2.add(new PlotDatum(7, 8));
        list.add(run1);
        list.add(run2);
        list.remove(0);
        assertEquals(1, list.size());
        list.add(run1);
        assertEquals(2, list.size());
    }

    @Test
    void testClone() {
        PlotRunList list1 = new PlotRunList();
        List<PlotDatum> run1 = new ArrayList<>();
        run1.add(new PlotDatum(1, 2));
        run1.add(new PlotDatum(3, 4));
        List<PlotDatum> run2 = new ArrayList<>();
        run2.add(new PlotDatum(5, 6));
        run2.add(new PlotDatum(7, 8));
        list1.add(run1);
        list1.add(run2);
        PlotRunList list2 = (PlotRunList) list1.clone();
        assertEquals(list1.size(), list2.size());
        assertEquals(list1.get(0).size(), list2.get(0).size());
        assertEquals(list1.get(1).size(), list2.get(1).size());
        assertEquals(list1.get(0).get(0), list2.get(0).get(0));
        assertEquals(list1.get(0).get(1), list2.get(0).get(1));
        assertEquals(list1.get(1).get(0), list2.get(1).get(0));
        assertEquals(list1.get(1).get(1), list2.get(1).get(1));
    }

    @Test
    void testUnsupportedOperations() {
        PlotRunList list = new PlotRunList();
        assertThrows(UnsupportedOperationException.class, () -> list.add(0, new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.addAll(new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.addAll(0, new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.clear());
        assertThrows(UnsupportedOperationException.class, () -> list.remove(new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.removeAll(new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.retainAll(new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.set(0, new ArrayList<>()));
        assertThrows(UnsupportedOperationException.class, () -> list.subList(0, 1));
    }

    @Test
    void testNullRun() {
        PlotRunList list = new PlotRunList();
        assertThrows(NullPointerException.class, () -> list.add(null));
    }

    @Test
    void testNullDatum() {
        PlotRunList list = new PlotRunList();
        List<PlotDatum> run = new ArrayList<>();
        run.add(new PlotDatum(1, 2));
        run.add(null);
        assertThrows(NullPointerException.class, () -> list.add(run));
    }

    @Test
    void testToString() {
        PlotRunList list = new PlotRunList();
        List<PlotDatum> run1 = new ArrayList<>();
        run1.add(new PlotDatum(1, 2));
        run1.add(new PlotDatum(3, 4));
        List<PlotDatum> run2 = new ArrayList<>();
        run2.add(new PlotDatum(5, 6));
        run2.add(new PlotDatum(7, 8));
        list.add(run1);
        list.add(run2);
        String expected = "[[1.0, 2.0], [3.0, 4.0]], [[5.0, 6.0], [7.0, 8.0]]";
        assertEquals(expected, list.toString());
    }

}