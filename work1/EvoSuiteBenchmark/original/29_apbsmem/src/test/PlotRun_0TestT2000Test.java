```java
class PlotRun_0Test {

    @Test
    void testSizeEmptyRun() {
        PlotRun plotRun = new PlotRun();
        assertEquals(0, plotRun.size());
    }

    @Test
    void testSizeSingleElementRun() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0)};
        PlotRun plotRun = new PlotRun(data);
        assertEquals(1, plotRun.size());
    }

    @Test
    void testSizeMultipleElementsRun() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0), new PlotDatum(3.0, 4.0), new PlotDatum(5.0, 6.0)};
        PlotRun plotRun = new PlotRun(data);
        assertEquals(3, plotRun.size());
    }

    @Test
    void testSizeEmptyCollectionRun() {
        Collection<PlotDatum> data = new ArrayList<>();
        PlotRun plotRun = new PlotRun(data);
        assertEquals(0, plotRun.size());
    }

    @Test
    void testSizeSingleElementCollectionRun() {
        Collection<PlotDatum> data = new ArrayList<>();
        data.add(new PlotDatum(1.0, 2.0));
        PlotRun plotRun = new PlotRun(data);
        assertEquals(1, plotRun.size());
    }

    @Test
    void testSizeMultipleElementsCollectionRun() {
        Collection<PlotDatum> data = new ArrayList<>();
        data.add(new PlotDatum(1.0, 2.0));
        data.add(new PlotDatum(3.0, 4.0));
        data.add(new PlotDatum(5.0, 6.0));
        PlotRun plotRun = new PlotRun(data);
        assertEquals(3, plotRun.size());
    }

    @Test
    void testSizeMixedCollectionRun() {
        Collection<Object> data = new ArrayList<>();
        data.add(new PlotDatum(1.0, 2.0));
        data.add("test");
        data.add(new PlotDatum(3.0, 4.0));
        PlotRun plotRun = new PlotRun(data);
        assertEquals(2, plotRun.size());
    }

    @Test
    void testSizeNullCollectionRun() {
        assertThrows(NullPointerException.class, () -> {
            Collection<PlotDatum> data = null;
            PlotRun plotRun = new PlotRun(data);
        });
    }

    @Test
    void testSizeCloneRun() {
        PlotDatum[] data = {new PlotDatum(1.0, 2.0), new PlotDatum(3.0, 4.0)};
        PlotRun original = new PlotRun(data);
        PlotRun clone = (PlotRun) original.clone();
        assertEquals(original.size(), clone.size());
    }

}
```
```