// Here's an example implementation of the PlotRunList#get(int) method:

/**
 * Returns the PlotRun object at the specified position in this run list.
 *
 * @param index The index of the plot run object to return.
 * @return The PlotRun object at the specified position in this run.
 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()).
 */
public Object get(int index) {
    if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException("Index " + index + " is out of range.");
    }
    return runs[index];
}

// And here's an example implementation of the PlotRunList_1Test class:

class PlotRunList_1Test {

    @Test
    void testGet() {
        PlotDatum[] run1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] run2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(run1, run2);

        // Test getting the first run
        PlotRun run = (PlotRun) list.get(0);
        assertArrayEquals(run1, run.toArray());

        // Test getting the second run
        run = (PlotRun) list.get(1);
        assertArrayEquals(run2, run.toArray());

        // Test getting an out-of-bounds index
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }
}