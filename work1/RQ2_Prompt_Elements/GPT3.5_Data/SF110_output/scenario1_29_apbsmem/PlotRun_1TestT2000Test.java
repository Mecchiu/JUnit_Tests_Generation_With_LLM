// Here's an example implementation of the PlotRun#get(int) method:

public Object get(int index) {
    if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }
    return data.get(index);
}

// And here are the ten unit test cases for the method:

class PlotRun_1Test {
    
    @Test
    void testGetValidIndex() {
        PlotDatum datum = new PlotDatum(1, 2);
        PlotRun run = new PlotRun(Arrays.asList(datum));
        assertEquals(datum, run.get(0));
    }
    
    @Test
    void testGetInvalidIndex() {
        PlotRun run = new PlotRun(Collections.emptyList());
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
    }
    
    @Test
    void testGetNegativeIndex() {
        PlotRun run = new PlotRun(Collections.emptyList());
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
    }
    
    @Test
    void testGetIndexEqualToSize() {
        PlotRun run = new PlotRun(Collections.emptyList());
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(run.size()));
    }
    
    @Test
    void testGetFirstElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        assertEquals(datum1, run.get(0));
    }
    
    @Test
    void testGetLastElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2));
        assertEquals(datum2, run.get(1));
    }
    
    @Test
    void testGetMiddleElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertEquals(datum2, run.get(1));
    }
    
    @Test
    void testGetWithNullElement() {
        PlotRun run = new PlotRun(Arrays.asList(null));
        assertNull(run.get(0));
    }
    
    @Test
    void testGetWithMultipleNullElements() {
        PlotRun run = new PlotRun(Arrays.asList(null, null, null));
        assertNull(run.get(1));
    }
    
    @Test
    void testGetWithMixedElements() {
        PlotDatum datum = new PlotDatum(1, 2);
        PlotRun run = new PlotRun(Arrays.asList(null, datum, null));
        assertEquals(datum, run.get(1));
    }
}