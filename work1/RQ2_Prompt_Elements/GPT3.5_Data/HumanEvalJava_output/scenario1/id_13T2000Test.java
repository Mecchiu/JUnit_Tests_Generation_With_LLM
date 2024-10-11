Here's the code for the test class:

```
// GreatestCommonDivisorTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {

    @Test
    void testGCDWithTwoPositiveNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(12, 18);
        assertEquals(6, result);
    }

    @Test
    void testGCDWithTwoNegativeNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(-12, -18);
        assertEquals(6, result);
    }

    @Test
    void testGCDWithOnePositiveAndOneNegativeNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(12, -18);
        assertEquals(6, result);
    }

    @Test
    void testGCDWithZeroAndPositiveNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 18);
        assertEquals(18, result);
    }

    @Test
    void testGCDWithZeroAndNegativeNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, -18);
        assertEquals(18, result);
    }

    @Test
    void testGCDWithTwoZeroes() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 0);
        assertEquals(0, result);
    }

    @Test
    void testGCDWithTwoLargeNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(123456789, 987654321);
        assertEquals(9, result);
    }

    @Test
    void testGCDWithTwoSmallNumbers() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(2, 3);
        assertEquals(1, result);
    }

    @Test
    void testGCDWithOneZeroAndOneLargeNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 987654321);
        assertEquals(987654321, result);
    }

    @Test
    void testGCDWithOneZeroAndOneSmallNumber() {
        int result = GreatestCommonDivisor.greatestCommonDivisor(0, 3);
        assertEquals(3, result);
    }
}
```