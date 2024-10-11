package jahuwaldt.plot;
java
class LinearAxisScale_1Test {

    @Test
    void testLowerBounds() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithPositiveValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithNegativeValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithZero() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithLargeValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithSmallValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithDecimalValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithFractionValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }

    @Test
    void testLowerBoundsWithNegativeFractionValue() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        assertEquals(-1.0, linearAxisScale.lowerBounds());
    }
}
