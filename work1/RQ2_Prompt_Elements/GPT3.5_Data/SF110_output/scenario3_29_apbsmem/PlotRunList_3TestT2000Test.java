// Here's an example implementation of the PlotRunList_3Test class with ten unit test cases for the iterator() method:

class PlotRunList_3Test {

    @Test
    void testIteratorEmptyList() {
        PlotRunList list = new PlotRunList();
        Iterator<PlotRun> iterator = list.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorSingleRun() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data, Color.RED);
        PlotRunList list = new PlotRunList();
        list.add(run);
        Iterator<PlotRun> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorMultipleRuns() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRun run1 = new PlotRun(data1, Color.RED);
        PlotRun run2 = new PlotRun(data2, Color.BLUE);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator<PlotRun> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(run2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorRemove() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRun run1 = new PlotRun(data1, Color.RED);
        PlotRun run2 = new PlotRun(data2, Color.BLUE);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator<PlotRun> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(run1, iterator.next());
        iterator.remove();
        assertTrue(iterator.hasNext());
        assertEquals(run2, iterator.next());
        assertFalse(iterator.hasNext());
        assertEquals(1, list.size());
        assertEquals(run2, list.get(0));
    }

    @Test
    void testIteratorConcurrentModification() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRun run1 = new PlotRun(data1, Color.RED);
        PlotRun run2 = new PlotRun(data2, Color.BLUE);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator<PlotRun> iterator = list.iterator();
        list.add(new PlotRun(data1, Color.GREEN));
        assertThrows(ConcurrentModificationException.class, () -> iterator.hasNext());
    }

    @Test
    void testIteratorNoSuchElementException() {
        PlotRunList list = new PlotRunList();
        Iterator<PlotRun> iterator = list.iterator();
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    @Test
    void testIteratorUnsupportedOperationException() {
        PlotRunList list = new PlotRunList();
        Iterator<PlotRun> iterator = list.iterator();
        assertThrows(UnsupportedOperationException.class, () -> iterator.remove());
    }

    @Test
    void testIteratorEmptyListForEachRemaining() {
        PlotRunList list = new PlotRunList();
        Iterator<PlotRun> iterator = list.iterator();
        iterator.forEachRemaining(run -> fail("Should not be called"));
    }

    @Test
    void testIteratorSingleRunForEachRemaining() {
        PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotRun run = new PlotRun(data, Color.RED);
        PlotRunList list = new PlotRunList();
        list.add(run);
        Iterator<PlotRun> iterator = list.iterator();
        iterator.forEachRemaining(r -> assertEquals(run, r));
    }

    @Test
    void testIteratorMultipleRunsForEachRemaining() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRun run1 = new PlotRun(data1, Color.RED);
        PlotRun run2 = new PlotRun(data2, Color.BLUE);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator<PlotRun> iterator = list.iterator();
        List<PlotRun> runs = new ArrayList<>();
        iterator.forEachRemaining(runs::add);
        assertEquals(Arrays.asList(run1, run2), runs);
    }

    @Test
    void testIteratorRemoveForEachRemaining() {
        PlotDatum[] data1 = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
        PlotDatum[] data2 = {new PlotDatum(5, 6), new PlotDatum(7, 8)};
        PlotRun run1 = new PlotRun(data1, Color.RED);
        PlotRun run2 = new PlotRun(data2, Color.BLUE);
        PlotRunList list = new PlotRunList();
        list.add(run1);
        list.add(run2);
        Iterator<PlotRun> iterator = list.iterator();
        iterator.next();
        iterator.forEachRemaining(iterator::remove);
        assertTrue(list.isEmpty());
    }
}