package jahuwaldt.plot;
java
public class PlotRun_3Test {

    @Test
    void testIteratorEmptyRun() {
        PlotRun plotRun = new PlotRun();
        Iterator iterator = plotRun.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorSingleElement() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorMultipleElements() {
        PlotDatum datum1 = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotDatum datum2 = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        PlotRun plotRun = new PlotRun(Arrays.asList(datum1, datum2));
        Iterator iterator = plotRun.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(datum1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(datum2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorEmptyRunAfterClear() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        plotRun.clear();
        Iterator iterator = plotRun.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorRemoveElement() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        iterator.next();
        iterator.remove();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorConcurrentModification() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        plotRun.add(new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE));
        assertThrows(ConcurrentModificationException.class, iterator::next);
    }

    @Test
    void testIteratorSetElement() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        PlotDatum newDatum = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        iterator.next();
        iterator.set(newDatum);
        assertEquals(newDatum, plotRun.get(0));
    }

    @Test
    void testIteratorAddElement() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        PlotDatum newDatum = new PlotDatum(3.0, 4.0, false, PlotSymbol.SQUARE);
        iterator.add(newDatum);
        assertEquals(newDatum, plotRun.get(1));
    }

    @Test
    void testIteratorClone() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE);
        PlotRun plotRun = new PlotRun(Collections.singletonList(datum));
        Iterator iterator = plotRun.iterator();
        PlotRun clonedRun = (PlotRun) plotRun.clone();
        Iterator clonedIterator = clonedRun.iterator();
        assertEquals(iterator.next(), clonedIterator.next());
    }
}
