package jahuwaldt.plot;
java
public class PlotRunList_3Test {

    @Test
    void testIterator_EmptyList() {
        PlotRunList runList = new PlotRunList();
        Iterator iterator = runList.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIterator_NonEmptyList() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIterator_RemoveElement() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        iterator.next();
        iterator.remove();
        assertEquals(1, runList.size());
    }

    @Test
    void testIterator_ConcurrentModification() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        runList.add(new PlotRun());
        assertThrows(ConcurrentModificationException.class, iterator::next);
    }

    @Test
    void testIterator_EmptyListHasNext() {
        PlotRunList runList = new PlotRunList();
        Iterator iterator = runList.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIterator_NonEmptyListHasNext() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
    }

    @Test
    void testIterator_EmptyListNext() {
        PlotRunList runList = new PlotRunList();
        Iterator iterator = runList.iterator();
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    void testIterator_NonEmptyListNext() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        assertNotNull(iterator.next());
        assertNotNull(iterator.next());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    void testIterator_RemoveWithoutNext() {
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRunList runList = new PlotRunList(Arrays.asList(run1, run2));
        Iterator iterator = runList.iterator();
        assertThrows(IllegalStateException.class, iterator::remove);
    }
}
