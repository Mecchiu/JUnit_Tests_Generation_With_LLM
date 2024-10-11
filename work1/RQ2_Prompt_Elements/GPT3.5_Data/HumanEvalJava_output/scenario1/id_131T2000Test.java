Here's the code for the `DigitsTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Digits}.
 * It contains ten unit test cases for the {@link Digits#digits(int)} method.
 */
class DigitsTest {

    @Test
    void testDigitsWithZero() {
        assertEquals(0, Digits.digits(0));
    }

    @Test
    void testDigitsWithEvenNumber() {
        assertEquals(0, Digits.digits(2468));
    }

    @Test
    void testDigitsWithOddNumber() {
        assertEquals(3, Digits.digits(135));
    }

    @Test
    void testDigitsWithMixedNumber() {
        assertEquals(15, Digits.digits(246135));
    }

    @Test
    void testDigitsWithNegativeNumber() {
        assertEquals(15, Digits.digits(-246135));
    }

    @Test
    void testDigitsWithSingleDigitNumber() {
        assertEquals(1, Digits.digits(7));
    }

    @Test
    void testDigitsWithLargeNumber() {
        assertEquals(945, Digits.digits(123456789));
    }

    @Test
    void testDigitsWithAllEvenDigits() {
        assertEquals(0, Digits.digits(24680));
    }

    @Test
    void testDigitsWithAllOddDigits() {
        assertEquals(243, Digits.digits(13579));
    }

    @Test
    void testDigitsWithNoOddDigits() {
        assertEquals(0, Digits.digits(246));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `Digits.digits()` method. Each test case is annotated with the `@Test` annotation and contains an assertion using the `assertEquals()` method to check the expected result against the actual result returned by the method.