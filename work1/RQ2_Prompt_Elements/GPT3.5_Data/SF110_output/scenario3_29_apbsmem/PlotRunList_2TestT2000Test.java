// Here's an example implementation of the PlotRunList_2Test class with ten unit test cases for the remove() method:

class PlotRunList_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRunList list = new PlotRunList(run1, run2);
        PlotRun removed = list.remove(0);
        assertEquals(run1, removed);
        assertEquals(1, list.size());
        assertEquals(run2, list.get(0));
    }

    @Test
    void testRemoveLastElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRunList list = new PlotRunList(run1, run2);
        PlotRun removed = list.remove(1);
        assertEquals(run2, removed);
        assertEquals(1, list.size());
        assertEquals(run1, list.get(0));
    }

    @Test
    void testRemoveMiddleElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRun run3 = new PlotRun(data, Color.GREEN);
        PlotRunList list = new PlotRunList(run1, run2, run3);
        PlotRun removed = list.remove(1);
        assertEquals(run2, removed);
        assertEquals(2, list.size());
        assertEquals(run1, list.get(0));
        assertEquals(run3, list.get(1));
    }

    @Test
    void testRemoveSingleElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRunList list = new PlotRunList(run1);
        PlotRun removed = list.remove(0);
        assertEquals(run1, removed);
        assertEquals(0, list.size());
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRunList list = new PlotRunList(run1);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(1);
        });
    }

    @Test
    void testRemoveEmptyList() {
        PlotRunList list = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(0);
        });
    }

    @Test
    void testRemoveNullElement() {
        PlotRunList list = new PlotRunList();
        assertThrows(NullPointerException.class, () -> {
            list.remove(null);
        });
    }

    @Test
    void testRemoveNonexistentElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRunList list = new PlotRunList(run1);
        boolean removed = list.remove(run2);
        assertFalse(removed);
        assertEquals(1, list.size());
        assertEquals(run1, list.get(0));
    }

    @Test
    void testRemoveExistingElement() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRunList list = new PlotRunList(run1, run2);
        boolean removed = list.remove(run1);
        assertTrue(removed);
        assertEquals(1, list.size());
        assertEquals(run2, list.get(0));
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run1 = new PlotRun(data, Color.RED);
        PlotRun run2 = new PlotRun(data, Color.BLUE);
        PlotRunList list = new PlotRunList(run1, run2);
        boolean removed1 = list.remove(run1);
        boolean removed2 = list.remove(run2);
        assertTrue(removed1);
        assertTrue(removed2);
        assertEquals(0, list.size());
    }
}