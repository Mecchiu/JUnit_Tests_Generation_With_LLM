// Here's an example implementation of the PlotRunList#get(int) method:

public Object get(int index) {
    return data.get(index);
}

// And here's an example implementation of the PlotRunList_1Test class:

class PlotRunList_1Test {
    
    @Test
    void testGet() {
        PlotDatum[] run1 = {new PlotDatum(1, 2), new PlotDatum(2, 3), new PlotDatum(3, 4)};
        PlotDatum[] run2 = {new PlotDatum(4, 5), new PlotDatum(5, 6), new PlotDatum(6, 7)};
        PlotRunList runList = new PlotRunList();
        runList.add(run1);
        runList.add(run2);
        
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> runList.get(2));
    }
}