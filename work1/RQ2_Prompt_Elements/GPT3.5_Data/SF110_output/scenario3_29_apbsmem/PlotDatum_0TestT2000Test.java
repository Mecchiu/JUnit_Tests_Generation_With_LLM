// Test cases for the PlotDatum class.

public class PlotDatum_0Test {

    // Test case 1: Test that a PlotDatum with no error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NoErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 2: Test that a PlotDatum with an error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_WithErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, 0.5);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 3: Test that a PlotDatum with a negative error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NegativeErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, -0.5);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 4: Test that a PlotDatum with a zero error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_ZeroErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, 0.0);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 5: Test that a PlotDatum with NaN for the error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NaNErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, Double.NaN);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 6: Test that a PlotDatum with positive infinity for the error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_PosInfinityErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, Double.POSITIVE_INFINITY);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 7: Test that a PlotDatum with negative infinity for the error bar returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NegInfinityErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, Double.NEGATIVE_INFINITY);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 8: Test that a PlotDatum with a null error bar returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NullErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, null);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 9: Test that a PlotDatum with a non-null error bar object returns true for hasErrorBar().
    @Test
    public void testHasErrorBar_NonNullErrorBar() {
        ErrorBar errorBar = new ErrorBar(0.5, 0.5);
        PlotDatum datum = new PlotDatum(1.0, 2.0, errorBar);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 10: Test that a PlotDatum with a non-null error bar object with zero error bar length returns false for hasErrorBar().
    @Test
    public void testHasErrorBar_NonNullErrorBar_ZeroLength() {
        ErrorBar errorBar = new ErrorBar(0.0, 0.0);
        PlotDatum datum = new PlotDatum(1.0, 2.0, errorBar);
        assertFalse(datum.hasErrorBar());
    }
}