// Test case 1: Test if the upper bounds of the linear axis scale is 1.0 by default.
@Test
public void testDefaultUpperBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertEquals(1.0, scale.upperBounds());
}

// Test case 2: Test if the upper bounds of the linear axis scale is correctly set to a new value.
@Test
public void testSetUpperBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(10.0);
    assertEquals(10.0, scale.upperBounds());
}

// Test case 3: Test if the upper bounds of the linear axis scale is correctly set to a negative value.
@Test
public void testSetUpperBoundsNegative() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(-10.0);
    assertEquals(-10.0, scale.upperBounds());
}

// Test case 4: Test if the upper bounds of the linear axis scale is correctly set to zero.
@Test
public void testSetUpperBoundsZero() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(0.0);
    assertEquals(0.0, scale.upperBounds());
}

// Test case 5: Test if the upper bounds of the linear axis scale is correctly set to a very large value.
@Test
public void testSetUpperBoundsLarge() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(Double.MAX_VALUE);
    assertEquals(Double.MAX_VALUE, scale.upperBounds());
}

// Test case 6: Test if the upper bounds of the linear axis scale is correctly set to a very small value.
@Test
public void testSetUpperBoundsSmall() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(Double.MIN_VALUE);
    assertEquals(Double.MIN_VALUE, scale.upperBounds());
}

// Test case 7: Test if the upper bounds of the linear axis scale is correctly set to NaN.
@Test
public void testSetUpperBoundsNaN() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(Double.NaN);
    assertTrue(Double.isNaN(scale.upperBounds()));
}

// Test case 8: Test if the upper bounds of the linear axis scale is correctly set to positive infinity.
@Test
public void testSetUpperBoundsPositiveInfinity() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(Double.POSITIVE_INFINITY);
    assertTrue(Double.isInfinite(scale.upperBounds()));
    assertEquals(Double.POSITIVE_INFINITY, scale.upperBounds());
}

// Test case 9: Test if the upper bounds of the linear axis scale is correctly set to negative infinity.
@Test
public void testSetUpperBoundsNegativeInfinity() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(Double.NEGATIVE_INFINITY);
    assertTrue(Double.isInfinite(scale.upperBounds()));
    assertEquals(Double.NEGATIVE_INFINITY, scale.upperBounds());
}

// Test case 10: Test if the upper bounds of the linear axis scale is correctly set to a very large negative value.
@Test
public void testSetUpperBoundsLargeNegative() {
    LinearAxisScale scale = new LinearAxisScale();
    scale.setUpperBounds(-Double.MAX_VALUE);
    assertEquals(-Double.MAX_VALUE, scale.upperBounds());
}
}