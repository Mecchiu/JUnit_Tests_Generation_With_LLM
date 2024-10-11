package jahuwaldt.plot;
java
class PlotDatum_1Test {

    @Test
    void testConnectedTrue() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        assertTrue(plotDatum.connected());
    }

    @Test
    void testConnectedFalse() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        assertFalse(plotDatum.connected());
    }

    @Test
    void testConnectedDefault() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        assertTrue(plotDatum.connected());
    }

    @Test
    void testConnectedChangeToFalse() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }

    @Test
    void testConnectedChangeToTrue() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }

    @Test
    void testConnectedMultipleChanges() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }

    @Test
    void testConnectedNull() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertNotNull(plotDatum);
    }

    @Test
    void testConnectedNotNull() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        assertNotNull(plotDatum);
    }

    @Test
    void testConnectedColor() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setLineColor(Color.RED);
        assertEquals(Color.RED, plotDatum.getLineColor());
    }
}
