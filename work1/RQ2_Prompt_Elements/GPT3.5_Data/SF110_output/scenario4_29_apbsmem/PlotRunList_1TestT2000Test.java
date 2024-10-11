// Here is an example implementation of the PlotRunList#get(int) method test cases.

class PlotRunList_1Test {
    
    @Test
    void testGet() {
        // Create a new PlotRunList object
        PlotRunList runList = new PlotRunList();
        
        // Create some PlotDatum objects to add to the run list
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        
        // Create a new PlotRun object and add the PlotDatum objects to it
        PlotRun run1 = new PlotRun();
        run1.add(datum1);
        run1.add(datum2);
        run1.add(datum3);
        
        // Add the PlotRun object to the run list
        runList.add(run1);
        
        // Test getting the first element of the run list
        assertEquals(run1, runList.get(0));
        
        // Test getting an element that is out of bounds
        assertThrows(IndexOutOfBoundsException.class, () -> runList.get(1));
        
        // Add another PlotRun object to the run list
        PlotRun run2 = new PlotRun();
        runList.add(run2);
        
        // Test getting the second element of the run list
        assertEquals(run2, runList.get(1));
        
        // Test getting an element that is out of bounds
        assertThrows(IndexOutOfBoundsException.class, () -> runList.get(2));
    }
}