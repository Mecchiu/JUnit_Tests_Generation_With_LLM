// Test case for PlotDatum.hasErrorBar() method
public class PlotDatum_0Test {

    // Test case 1: Test that a new PlotDatum object has no error bar by default
    @Test
    public void testHasErrorBar_NoErrorBar() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 2: Test that setting the error on Y value to a non-zero value
    //              results in the hasErrorBar() method returning true.
    @Test
    public void testHasErrorBar_ErrorSet() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(0.5);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 3: Test that setting the error on Y value to zero
    //              results in the hasErrorBar() method returning false.
    @Test
    public void testHasErrorBar_ErrorSetToZero() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(0.0);
        assertFalse(datum.hasErrorBar());
    }

    // Test case 4: Test that setting the error on Y value to a negative value
    //              results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToNegative() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(-0.5);
        });
    }

    // Test case 5: Test that setting the error on Y value to NaN
    //              results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToNaN() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(Double.NaN);
        });
    }

    // Test case 6: Test that setting the error on Y value to positive infinity
    //              results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToPositiveInfinity() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(Double.POSITIVE_INFINITY);
        });
    }

    // Test case 7: Test that setting the error on Y value to negative infinity
    //              results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToNegativeInfinity() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(Double.NEGATIVE_INFINITY);
        });
    }

    // Test case 8: Test that setting the error on Y value to a very small positive value
    //              results in the hasErrorBar() method returning true.
    @Test
    public void testHasErrorBar_ErrorSetToVerySmallPositiveValue() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        datum.setYError(1e-10);
        assertTrue(datum.hasErrorBar());
    }

    // Test case 9: Test that setting the error on Y value to a very small negative value
    //              results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToVerySmallNegativeValue() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(-1e-10);
        });
    }

    // Test case 10: Test that setting the error on Y value to a very large positive value
    //               results in an IllegalArgumentException being thrown.
    @Test
    public void testHasErrorBar_ErrorSetToVeryLargePositiveValue() {
        PlotDatum datum = new PlotDatum(1.0, 2.0, true);
        assertThrows(IllegalArgumentException.class, () -> {
            datum.setYError(1e10);
        });
    }
}