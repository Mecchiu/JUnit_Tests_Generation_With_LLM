Here's the code for the test class:

```
class AnyIntTest {

    @Test
    void testAllIntegers() {
        assertTrue(AnyInt.anyInt(1, 2, 3));
        assertTrue(AnyInt.anyInt(2, 1, 3));
        assertTrue(AnyInt.anyInt(3, 1, 2));
        assertFalse(AnyInt.anyInt(1, 2, 4));
    }

    @Test
    void testMixedTypes() {
        assertFalse(AnyInt.anyInt(1, 2.0, 3));
        assertFalse(AnyInt.anyInt(1, "2", 3));
        assertFalse(AnyInt.anyInt(1, 2, null));
    }

    @Test
    void testNegativeNumbers() {
        assertTrue(AnyInt.anyInt(-1, -2, -3));
        assertTrue(AnyInt.anyInt(-2, -1, -3));
        assertTrue(AnyInt.anyInt(-3, -1, -2));
        assertFalse(AnyInt.anyInt(-1, -2, -4));
    }

    @Test
    void testZero() {
        assertTrue(AnyInt.anyInt(0, 0, 0));
        assertFalse(AnyInt.anyInt(0, 1, 2));
        assertFalse(AnyInt.anyInt(1, 0, 2));
        assertFalse(AnyInt.anyInt(1, 2, 0));
    }

    @Test
    void testMaxValue() {
        assertTrue(AnyInt.anyInt(Integer.MAX_VALUE, 0, -1));
        assertTrue(AnyInt.anyInt(0, Integer.MAX_VALUE, -1));
        assertTrue(AnyInt.anyInt(-1, 0, Integer.MAX_VALUE));
        assertFalse(AnyInt.anyInt(Integer.MAX_VALUE, 0, 1));
    }

    @Test
    void testMinValue() {
        assertTrue(AnyInt.anyInt(Integer.MIN_VALUE, 0, 1));
        assertTrue(AnyInt.anyInt(0, Integer.MIN_VALUE, 1));
        assertTrue(AnyInt.anyInt(1, 0, Integer.MIN_VALUE));
        assertFalse(AnyInt.anyInt(Integer.MIN_VALUE, 0, -1));
    }

    @Test
    void testLargeNumbers() {
        assertTrue(AnyInt.anyInt(1000000000, 2000000000, -1000000000));
        assertTrue(AnyInt.anyInt(-1000000000, 2000000000, 1000000000));
        assertTrue(AnyInt.anyInt(2000000000, -1000000000, 1000000000));
        assertFalse(AnyInt.anyInt(1000000000, 2000000000, 1000000000));
    }

    @Test
    void testDecimalNumbers() {
        assertFalse(AnyInt.anyInt(1.5, 2.5, 3));
        assertFalse(AnyInt.anyInt(1, 2, 3.5));
        assertFalse(AnyInt.anyInt(1, 2.5, 3));
    }

    @Test
    void testNull() {
        assertFalse(AnyInt.anyInt(null, 2, 3));
        assertFalse(AnyInt.anyInt(1, null, 3));
        assertFalse(AnyInt.anyInt(1, 2, null));
    }
}
```