// Here's an example implementation of the PlotRunList_2Test class with ten unit test cases for the remove() method:

class PlotRunList_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));

        runList.remove(0);

        assertEquals(1, runList.size());
        assertEquals(run2, runList.get(0));
    }

    @Test
    void testRemoveLastElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));

        runList.remove(1);

        assertEquals(1, runList.size());
        assertEquals(run1, runList.get(0));
    }

    @Test
    void testRemoveMiddleElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));

        runList.remove(1);

        assertEquals(2, run1.size());
        assertEquals(datum1, run1.get(0));
        assertEquals(datum2, run1.get(1));
        assertEquals(1, runList.size());
        assertEquals(run2, runList.get(0));
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));

        assertThrows(IndexOutOfBoundsException.class, () -> runList.remove(2));
    }

    @Test
    void testRemoveEmptyList() {
        PlotRunList runList = new PlotRunList(Collections.emptyList());

        assertThrows(IndexOutOfBoundsException.class, () -> runList.remove(0));
    }

    @Test
    void testRemoveSingleElementList() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1));

        runList.remove(0);

        assertEquals(0, runList.size());
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));

        runList.remove(0);
        runList.remove(0);

        assertEquals(0, runList.size());
    }

    @Test
    void testRemoveNullElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, null, run2));

        runList.remove(1);

        assertEquals(2, runList.size());
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
    }

    @Test
    void testRemoveDuplicateElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2, run1));

        runList.remove(2);

        assertEquals(2, runList.size());
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
    }

    @Test
    void testRemoveAllDuplicateElements() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(3, 4);
        PlotDatum datum3 = new PlotDatum(5, 6);
        PlotRun run1 = new PlotRun(Arrays.asList(datum1, datum2));
        PlotRun run2 = new PlotRun(Arrays.asList(datum3));
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2, run1));

        runList.remove(0);
        runList.remove(1);

        assertEquals(1, runList.size());
        assertEquals(run2, runList.get(0));
    }
}