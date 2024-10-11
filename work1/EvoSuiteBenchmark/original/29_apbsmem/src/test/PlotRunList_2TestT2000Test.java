```java
class PlotRunList_2Test {

    @Test
    void testRemove_EmptyList() {
        PlotRunList plotRunList = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.remove(0));
    }

    @Test
    void testRemove_IndexOutOfBounds() {
        PlotRunList plotRunList = new PlotRunList();
        plotRunList.add(new PlotRun());
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.remove(1));
    }

    @Test
    void testRemove_FirstElement() {
        PlotRunList plotRunList = new PlotRunList();
        PlotRun run = new PlotRun();
        plotRunList.add(run);
        assertEquals(run, plotRunList.remove(0));
        assertEquals(0, plotRunList.size());
    }

    @Test
    void testRemove_LastElement() {
        PlotRunList plotRunList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        plotRunList.add(run1);
        plotRunList.add(run2);
        assertEquals(run2, plotRunList.remove(1));
        assertEquals(1, plotRunList.size());
    }

    @Test
    void testRemove_MiddleElement() {
        PlotRunList plotRunList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        plotRunList.add(run1);
        plotRunList.add(run2);
        plotRunList.add(run3);
        assertEquals(run2, plotRunList.remove(1));
        assertEquals(2, plotRunList.size());
    }

    @Test
    void testRemove_AllElements() {
        PlotRunList plotRunList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        plotRunList.add(run1);
        plotRunList.add(run2);
        plotRunList.remove(1);
        plotRunList.remove(0);
        assertEquals(0, plotRunList.size());
    }

    @Test
    void testRemove_NegativeIndex() {
        PlotRunList plotRunList = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.remove(-1));
    }

    @Test
    void testRemove_LargeIndex() {
        PlotRunList plotRunList = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.remove(100));
    }

    @Test
    void testRemove_NullElement() {
        PlotRunList plotRunList = new PlotRunList();
        plotRunList.add(new PlotRun());
        assertThrows(ClassCastException.class, () -> plotRunList.remove(0));
    }
}
```
```