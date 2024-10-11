// Here's an example implementation of the PlotRunList_0Test class with ten unit test cases for the size() method:

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
    void testSizeEmptyList() {
        PlotRunList list = new PlotRunList();
        assertEquals(0, list.size());
    }

    @Test
    void testSizeSingleRun() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRunList list = new PlotRunList();
        list.add(data);
        assertEquals(1, list.size());
    }

    @Test
    void testSizeMultipleRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        assertEquals(2, list.size());
    }

    @Test
    void testSizeEmptyRuns() {
        PlotDatum[] data1 = {};
        PlotDatum[] data2 = {};
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        assertEquals(2, list.size());
    }

    @Test
    void testSizeNullRuns() {
        PlotDatum[] data1 = null;
        PlotDatum[] data2 = null;
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        assertEquals(2, list.size());
    }

    @Test
    void testSizeMixedRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {};
        PlotDatum[] data3 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotDatum[] data4 = null;
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        assertEquals(4, list.size());
    }

    @Test
    void testSizeLargeList() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRunList list = new PlotRunList();
        for (int i = 0; i < 100000; i++) {
            list.add(data);
        }
        assertEquals(100000, list.size());
    }

    @Test
    void testSizeAfterRemove() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    void testSizeAfterClear() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testSizeAfterSet() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList();
        list.add(data1);
        list.add(data2);
        PlotDatum[] newData = {new PlotDatum(9, 10)};
        list.set(0, newData);
        assertEquals(2, list.size());
    }
}