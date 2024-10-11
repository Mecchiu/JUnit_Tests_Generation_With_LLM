// Test class of LinearAxisScale's upperBounds() method.
public class LinearAxisScale_1Test {

    // Test case 1: Test if the default upper bounds is 1.0.
    @Test
    public void testDefaultUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertEquals(1.0, axisScale.upperBounds(), 0.0001);
    }

    // Test case 2: Test if the upper bounds is correctly set to a positive value.
    @Test
    public void testPositiveUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(10.0);
        assertEquals(10.0, axisScale.upperBounds(), 0.0001);
    }

    // Test case 3: Test if the upper bounds is correctly set to a negative value.
    @Test
    public void testNegativeUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(-10.0);
        assertEquals(-10.0, axisScale.upperBounds(), 0.0001);
    }

    // Test case 4: Test if the upper bounds is correctly set to zero.
    @Test
    public void testZeroUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(0.0);
        assertEquals(0.0, axisScale.upperBounds(), 0.0001);
    }

    // Test case 5: Test if the upper bounds is correctly set to a large positive value.
    @Test
    public void testLargePositiveUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(1.0E10);
        assertEquals(1.0E10, axisScale.upperBounds(), 0.0001);
    }

    // Test case 6: Test if the upper bounds is correctly set to a large negative value.
    @Test
    public void testLargeNegativeUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(-1.0E10);
        assertEquals(-1.0E10, axisScale.upperBounds(), 0.0001);
    }

    // Test case 7: Test if the upper bounds is correctly set to a small positive value.
    @Test
    public void testSmallPositiveUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(1.0E-10);
        assertEquals(1.0E-10, axisScale.upperBounds(), 0.0001);
    }

    // Test case 8: Test if the upper bounds is correctly set to a small negative value.
    @Test
    public void testSmallNegativeUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(-1.0E-10);
        assertEquals(-1.0E-10, axisScale.upperBounds(), 0.0001);
    }

    // Test case 9: Test if the upper bounds is correctly set to a very large positive value.
    @Test
    public void testVeryLargePositiveUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, axisScale.upperBounds(), 0.0001);
    }

    // Test case 10: Test if the upper bounds is correctly set to a very large negative value.
    @Test
    public void testVeryLargeNegativeUpperBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        axisScale.setUpperBounds(-Double.MAX_VALUE);
        assertEquals(-Double.MAX_VALUE, axisScale.upperBounds(), 0.0001);
    }
}