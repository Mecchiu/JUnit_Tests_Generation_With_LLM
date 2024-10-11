// Here's an example implementation of the PlotRun_2Test class with ten unit test cases for the remove() method:

class PlotRun_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        run.remove(0);
        assertEquals(2, run.size());
        assertEquals(datum2, run.get(0));
        assertEquals(datum3, run.get(1));
    }

    @Test
    void testRemoveLastElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        run.remove(2);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum2, run.get(1));
    }

    @Test
    void testRemoveMiddleElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        run.remove(1);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum3, run.get(1));
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(3));
    }

    @Test
    void testRemoveEmptyList() {
        PlotRun run = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
    }

    @Test
    void testRemoveNull() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertThrows(NullPointerException.class, () -> run.remove(null));
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        run.remove(0);
        run.remove(0);
        run.remove(0);
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveDuplicateElements() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3, datum2));
        run.remove(1);
        assertEquals(3, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum3, run.get(1));
        assertEquals(datum2, run.get(2));
    }

    @Test
    void testRemoveAllDuplicateElements() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum2, datum2, datum2));
        run.remove(0);
        run.remove(0);
        run.remove(0);
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveNonexistentElement() {
        PlotDatum datum1 = new PlotDatum(1, 2);
        PlotDatum datum2 = new PlotDatum(2, 3);
        PlotDatum datum3 = new PlotDatum(3, 4);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertFalse(run.remove(new PlotDatum(4, 5)));
        assertEquals(3, run.size());
    }
}