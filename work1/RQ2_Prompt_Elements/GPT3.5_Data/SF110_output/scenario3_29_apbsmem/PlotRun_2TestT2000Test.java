// Here is an example implementation of the PlotRun_2Test class with ten unit test cases for the remove() method.

class PlotRun_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        PlotDatum removed = (PlotDatum) run.remove(0);
        assertEquals(datum1, removed);
        assertEquals(2, run.size());
        assertEquals(datum2, run.get(0));
        assertEquals(datum3, run.get(1));
    }

    @Test
    void testRemoveLastElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        PlotDatum removed = (PlotDatum) run.remove(2);
        assertEquals(datum3, removed);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum2, run.get(1));
    }

    @Test
    void testRemoveMiddleElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        PlotDatum removed = (PlotDatum) run.remove(1);
        assertEquals(datum2, removed);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum3, run.get(1));
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(3));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(-1));
        assertEquals(3, run.size());
    }

    @Test
    void testRemoveEmptyRun() {
        PlotRun run = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveSingleElementRun() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotRun run = new PlotRun(Collections.singletonList(datum1));
        PlotDatum removed = (PlotDatum) run.remove(0);
        assertEquals(datum1, removed);
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        PlotDatum removed1 = (PlotDatum) run.remove(0);
        PlotDatum removed2 = (PlotDatum) run.remove(0);
        PlotDatum removed3 = (PlotDatum) run.remove(0);
        assertEquals(datum1, removed1);
        assertEquals(datum2, removed2);
        assertEquals(datum3, removed3);
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveDuplicateElements() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = new PlotDatum(2.0, 3.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum1));
        PlotDatum removed = (PlotDatum) run.remove(2);
        assertEquals(datum1, removed);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum2, run.get(1));
    }

    @Test
    void testRemoveNullElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        PlotDatum datum2 = null;
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, datum2, datum3));
        PlotDatum removed = (PlotDatum) run.remove(1);
        assertNull(removed);
        assertEquals(2, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(datum3, run.get(1));
    }

    @Test
    void testRemoveNonPlotDatumElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0);
        String notAPlotDatum = "not a PlotDatum";
        PlotDatum datum3 = new PlotDatum(3.0, 4.0);
        PlotRun run = new PlotRun(Arrays.asList(datum1, notAPlotDatum, datum3));
        assertThrows(ClassCastException.class, () -> run.remove(1));
        assertEquals(3, run.size());
        assertEquals(datum1, run.get(0));
        assertEquals(notAPlotDatum, run.get(1));
        assertEquals(datum3, run.get(2));
    }
}