// Here is an example implementation of the PlotRun_2Test class with ten unit test cases for the remove() method:

class PlotRun_2Test {

    @Test
    void testRemoveFirstElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        PlotDatum removed = (PlotDatum) run.remove(0);
        assertEquals(1, run.size());
        assertEquals(1, removed.getX());
        assertEquals(2, removed.getY());
    }

    @Test
    void testRemoveLastElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        PlotDatum removed = (PlotDatum) run.remove(1);
        assertEquals(1, run.size());
        assertEquals(3, removed.getX());
        assertEquals(4, removed.getY());
    }

    @Test
    void testRemoveMiddleElement() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        run.add(new PlotDatum(5, 6));
        PlotDatum removed = (PlotDatum) run.remove(1);
        assertEquals(2, run.size());
        assertEquals(3, removed.getX());
        assertEquals(4, removed.getY());
    }

    @Test
    void testRemoveOutOfBounds() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(1));
    }

    @Test
    void testRemoveEmptyRun() {
        PlotRun run = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(0));
    }

    @Test
    void testRemoveAllElements() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        run.remove(0);
        run.remove(0);
        assertEquals(0, run.size());
    }

    @Test
    void testRemoveDuplicateElements() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        run.add(new PlotDatum(3, 4));
        PlotDatum removed = (PlotDatum) run.remove(1);
        assertEquals(2, run.size());
        assertEquals(3, removed.getX());
        assertEquals(4, removed.getY());
    }

    @Test
    void testRemoveAllDuplicateElements() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        run.add(new PlotDatum(3, 4));
        run.remove(1);
        run.remove(1);
        assertEquals(1, run.size());
    }

    @Test
    void testRemoveNegativeIndex() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(-1));
    }

    @Test
    void testRemoveLargeIndex() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> run.remove(100));
    }
}