```java
class EvenOddCountTest {

    @Test
    void testEvenOddCount_negativeNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(-12);
        assertEquals(Arrays.asList(1, 1), result);
    }

    @Test
    void testEvenOddCount_positiveNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(123);
        assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    void testEvenOddCount_singleDigitOdd() {
        List<Integer> result = EvenOddCount.evenOddCount(7);
        assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void testEvenOddCount_singleDigitNegativeEven() {
        List<Integer> result = EvenOddCount.evenOddCount(-78);
        assertEquals(Arrays.asList(1, 1), result);
    }

    @Test
    void testEvenOddCount_multipleDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(3452);
        assertEquals(Arrays.asList(2, 2), result);
    }

    @Test
    void testEvenOddCount_multipleDigitsWithRepeatingDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(346211);
        assertEquals(Arrays.asList(3, 3), result);
    }

    @Test
    void testEvenOddCount_negativeMultipleDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(-345821);
        assertEquals(Arrays.asList(3, 3), result);
    }

    @Test
    void testEvenOddCount_singleNegativeEvenDigit() {
        List<Integer> result = EvenOddCount.evenOddCount(-2);
        assertEquals(Arrays.asList(1, 0), result);
    }

    @Test
    void testEvenOddCount_negativeMultipleDigitsWithOddDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(-45347);
        assertEquals(Arrays.asList(2, 3), result);
    }

    @Test
    void testEvenOddCount_zero() {
        List<Integer> result = EvenOddCount.evenOddCount(0);
        assertEquals(Arrays.asList(1, 0), result);
    }
}
```
```