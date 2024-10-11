```java
    private PlotRunList plotRunList;

    @BeforeEach
    void setUp() {
        plotRunList = new PlotRunList();
        // Add some PlotRun objects to the plotRunList for testing
        PlotRun plotRun1 = new PlotRun();
        PlotRun plotRun2 = new PlotRun();
        PlotRun plotRun3 = new PlotRun();
        plotRunList.add(plotRun1);
        plotRunList.add(plotRun2);
        plotRunList.add(plotRun3);
    }

    @Test
    void testGetAtIndexZero() {
        assertEquals(plotRunList.get(0), plotRunList.get(0));
    }

    @Test
    void testGetAtIndexOne() {
        assertEquals(plotRunList.get(1), plotRunList.get(1));
    }

    @Test
    void testGetAtIndexTwo() {
        assertEquals(plotRunList.get(2), plotRunList.get(2));
    }

    @Test
    void testGetAtNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.get(-1));
    }

    @Test
    void testGetAtInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.get(3));
    }

    @Test
    void testGetAtEmptyList() {
        PlotRunList emptyList = new PlotRunList();
        assertThrows(IndexOutOfBoundsException.class, () -> emptyList.get(0));
    }

    @Test
    void testGetAtNullIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.get(null));
    }

    @Test
    void testGetAtOutOfBoundsIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> plotRunList.get(100));
    }

    @Test
    void testGetAtMiddleIndex() {
        PlotRun plotRun = new PlotRun();
        plotRunList.add(1, plotRun);
        assertEquals(plotRun, plotRunList.get(1));
    }
```
