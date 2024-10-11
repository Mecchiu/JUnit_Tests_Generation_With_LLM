// Here's an example implementation of the PlotRun class and a JUnit test class for the get() method.

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    private List<PlotDatum> data;

    /**
     * Constructs a new PlotRun object with an empty list of PlotDatum objects.
     */
    public PlotRun() {
        data = new ArrayList<>();
    }

    /**
     * Constructs a new PlotRun object with the specified list of PlotDatum objects.
     *
     * @param data The list of PlotDatum objects to use for this run.
     */
    public PlotRun(List<PlotDatum> data) {
        this.data = data;
    }

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public PlotDatum get(int index) {
        return data.get(index);
    }

    /**
     * Returns the number of PlotDatum objects in this run.
     *
     * @return The number of PlotDatum objects in this run.
     */
    public int size() {
        return data.size();
    }

    /**
     * Adds a PlotDatum object to the end of this run.
     *
     * @param datum The PlotDatum object to add to this run.
     * @return True if the object was added successfully, false otherwise.
     */
    public boolean add(PlotDatum datum) {
        return data.add(datum);
    }

    /**
     * Removes the PlotDatum object at the specified position in this run.
     *
     * @param index The index of the PlotDatum object to remove.
     * @return The PlotDatum object that was removed from this run.
     */
    public PlotDatum remove(int index) {
        return data.remove(index);
    }

    /**
     * Returns a shallow copy of this PlotRun object.
     *
     * @return A shallow copy of this PlotRun object.
     */
    public Object clone() {
        return new PlotRun(new ArrayList<>(data));
    }
}

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

    @Test
    void testGet() {
        // Create a new PlotRun object with some test data.
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(0, 0));
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 4));
        run.add(new PlotDatum(3, 9));
        run.add(new PlotDatum(4, 16));

        // Test getting each PlotDatum object from the run.
        assertEquals(new PlotDatum(0, 0), run.get(0));
        assertEquals(new PlotDatum(1, 1), run.get(1));
        assertEquals(new PlotDatum(2, 4), run.get(2));
        assertEquals(new PlotDatum(3, 9), run.get(3));
        assertEquals(new PlotDatum(4, 16), run.get(4));

        // Test getting an out-of-bounds index.
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(5));
    }
}