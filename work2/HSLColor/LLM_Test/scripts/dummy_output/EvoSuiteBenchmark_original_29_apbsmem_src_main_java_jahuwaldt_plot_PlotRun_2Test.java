package jahuwaldt.plot;
java
public class PlotRun_2Test {

    @Test
    void testRemoveAtIndexZero() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        PlotDatum removedDatum = (PlotDatum) plotRun.remove(0);

        assertEquals(datum1, removedDatum);
        assertEquals(1, plotRun.size());
    }

    @Test
    void testRemoveAtIndexOne() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        PlotDatum removedDatum = (PlotDatum) plotRun.remove(1);

        assertEquals(datum2, removedDatum);
        assertEquals(1, plotRun.size());
    }

    @Test
    void testRemoveAtInvalidIndex() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        assertThrows(IndexOutOfBoundsException.class, () -> plotRun.remove(2));
    }

    @Test
    void testRemoveFromEmptyPlotRun() {
        PlotRun plotRun = new PlotRun();

        assertThrows(IndexOutOfBoundsException.class, () -> plotRun.remove(0));
    }

    @Test
    void testRemoveAllElements() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        plotRun.clear();

        assertEquals(0, plotRun.size());
    }

    @Test
    void testRemoveAndAddElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        PlotDatum newDatum = new PlotDatum(5.0, 6.0, true, PlotSymbol.TRIANGLE);
        plotRun.remove(0);
        plotRun.add(0, newDatum);

        assertEquals(newDatum, plotRun.get(0));
        assertEquals(2, plotRun.size());
    }

    @Test
    void testRemoveAndSetElement() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        PlotDatum newDatum = new PlotDatum(5.0, 6.0, true, PlotSymbol.TRIANGLE);
        plotRun.remove(0);
        plotRun.set(0, newDatum);

        assertEquals(newDatum, plotRun.get(0));
        assertEquals(2, plotRun.size());
    }

    @Test
    void testRemoveAndIterate() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        plotRun.remove(0);

        Iterator iterator = plotRun.iterator();
        assertEquals(datum2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testRemoveAndClone() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));

        plotRun.remove(0);

        PlotRun clonedRun = (PlotRun) plotRun.clone();
        assertEquals(datum2, clonedRun.get(0));
        assertEquals(1, clonedRun.size());
    }
}
