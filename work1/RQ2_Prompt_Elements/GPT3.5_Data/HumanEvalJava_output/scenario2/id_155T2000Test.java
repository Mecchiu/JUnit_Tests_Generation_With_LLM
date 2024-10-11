Here's the code for the test class:

```
class EvenOddCountTest {

    @Test
    void testEvenOddCountWithZero() {
        List<Integer> result = EvenOddCount.evenOddCount(0);
        assertEquals(Arrays.asList(1, 0), result);
    }

    @Test
    void testEvenOddCountWithPositiveEvenNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(2468);
        assertEquals(Arrays.asList(4, 0), result);
    }

    @Test
    void testEvenOddCountWithPositiveOddNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(13579);
        assertEquals(Arrays.asList(0, 5), result);
    }

    @Test
    void testEvenOddCountWithNegativeEvenNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(-2468);
        assertEquals(Arrays.asList(4, 0), result);
    }

    @Test
    void testEvenOddCountWithNegativeOddNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(-13579);
        assertEquals(Arrays.asList(0, 5), result);
    }

    @Test
    void testEvenOddCountWithMixedDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(123456789);
        assertEquals(Arrays.asList(4, 5), result);
    }

    @Test
    void testEvenOddCountWithSingleDigit() {
        List<Integer> result = EvenOddCount.evenOddCount(7);
        assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void testEvenOddCountWithLargeNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(1234567890);
        assertEquals(Arrays.asList(5, 5), result);
    }

    @Test
    void testEvenOddCountWithMaxValue() {
        List<Integer> result = EvenOddCount.evenOddCount(Integer.MAX_VALUE);
        assertEquals(Arrays.asList(31, 0), result);
    }

    @Test
    void testEvenOddCountWithMinValue() {
        List<Integer> result = EvenOddCount.evenOddCount(Integer.MIN_VALUE);
        assertEquals(Arrays.asList(31, 0), result);
    }
}
```

This test class contains ten test cases that cover different scenarios for the `evenOddCount` method. The `@Test` annotation is used to mark each test method. The `assertEquals` method is used to compare the expected result with the actual result returned by the `evenOddCount` method.