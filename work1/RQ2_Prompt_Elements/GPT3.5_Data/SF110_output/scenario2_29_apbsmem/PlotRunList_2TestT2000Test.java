// Here's an example implementation of the PlotRunList_2Test class with ten unit test cases for the remove() method:

class PlotRunList_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2)));
        PlotRun removed = (PlotRun) list.remove(0);
        assertEquals(1, list.size());
        assertEquals(data2, list.get(0).toArray());
        assertEquals(data1, removed.toArray());
    }

    @Test
    void testRemoveLastElement() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2)));
        PlotRun removed = (PlotRun) list.remove(1);
        assertEquals(1, list.size());
        assertEquals(data1, list.get(0).toArray());
        assertEquals(data2, removed.toArray());
    }

    @Test
    void testRemoveMiddleElement() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotDatum[] data3 = {new PlotDatum(9, 10), new PlotDatum(11, 12)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2), new PlotRun(data3)));
        PlotRun removed = (PlotRun) list.remove(1);
        assertEquals(2, list.size());
        assertEquals(data1, list.get(0).toArray());
        assertEquals(data3, list.get(1).toArray());
        assertEquals(data2, removed.toArray());
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2)));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
    }

    @Test
    void testRemoveEmptyList() {
        PlotRunList list = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void testRemoveSingleElementList() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRunList list = new PlotRunList(Collections.singletonList(new PlotRun(data)));
        PlotRun removed = (PlotRun) list.remove(0);
        assertTrue(list.isEmpty());
        assertEquals(data, removed.toArray());
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2)));
        PlotRun removed1 = (PlotRun) list.remove(0);
        PlotRun removed2 = (PlotRun) list.remove(0);
        assertTrue(list.isEmpty());
        assertEquals(data1, removed1.toArray());
        assertEquals(data2, removed2.toArray());
    }

    @Test
    void testRemoveDuplicateElements() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), new PlotRun(data2), new PlotRun(data1)));
        PlotRun removed = (PlotRun) list.remove(1);
        assertEquals(2, list.size());
        assertEquals(data1, list.get(0).toArray());
        assertEquals(data1, list.get(1).toArray());
        assertEquals(data2, removed.toArray());
    }

    @Test
    void testRemoveNullElement() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRunList list = new PlotRunList(Arrays.asList(new PlotRun(data1), null, new PlotRun(data2)));
        assertNull(list.remove(1));
        assertEquals(2, list.size());
        assertEquals(data1, list.get(0).toArray());
        assertEquals(data2, list.get(1).toArray());
    }

}