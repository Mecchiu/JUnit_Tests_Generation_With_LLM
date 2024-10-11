// Test cases for the PlotDatum class.

public class PlotDatum_0Test {

    // Test case 1: Test that a PlotDatum with no error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NoErrorBar() {
        PlotDatum datum = new PlotDatum();
        assertFalse(datum.hasErrorBar());
    }

    // Test case 2: Test that a PlotDatum with an error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_WithErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(0.1, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 3: Test that a PlotDatum with a zero-length error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_ZeroLengthErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(0.0, 0.0);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 4: Test that a PlotDatum with a negative error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NegativeErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(-0.1, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 5: Test that a PlotDatum with a NaN error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NaNErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(Double.NaN, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 6: Test that a PlotDatum with a positive infinity error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_PositiveInfinityErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(Double.POSITIVE_INFINITY, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 7: Test that a PlotDatum with a negative infinity error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NegativeInfinityErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(Double.NEGATIVE_INFINITY, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 8: Test that a PlotDatum with a null error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NullErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(null);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 9: Test that a PlotDatum with a NaN x error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NaNXErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(Double.NaN, 0.2);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 10: Test that a PlotDatum with a NaN y error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NaNYErrorBar() {
        PlotDatum datum = new PlotDatum();
        datum.setErrorBar(0.1, Double.NaN);
        assertTrue(datum.hasErrorBar());
    }
}