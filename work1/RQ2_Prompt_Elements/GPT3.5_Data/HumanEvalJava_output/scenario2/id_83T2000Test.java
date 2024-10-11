Here's the code for the test class:

```
// StartsOneEndsTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartsOneEnds}.
 * It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
 */
class StartsOneEndsTest {

    @Test
    void testStartsOneEndsForOneDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(1);
        assertEquals(2, result);
    }

    @Test
    void testStartsOneEndsForTwoDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(2);
        assertEquals(20, result);
    }

    @Test
    void testStartsOneEndsForThreeDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(3);
        assertEquals(200, result);
    }

    @Test
    void testStartsOneEndsForFourDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(4);
        assertEquals(2000, result);
    }

    @Test
    void testStartsOneEndsForFiveDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(5);
        assertEquals(20000, result);
    }

    @Test
    void testStartsOneEndsForSixDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(6);
        assertEquals(200000, result);
    }

    @Test
    void testStartsOneEndsForSevenDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(7);
        assertEquals(2000000, result);
    }

    @Test
    void testStartsOneEndsForEightDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(8);
        assertEquals(20000000, result);
    }

    @Test
    void testStartsOneEndsForNineDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(9);
        assertEquals(200000000, result);
    }

    @Test
    void testStartsOneEndsForTenDigitNumber() {
        int result = StartsOneEnds.startsOneEnds(10);
        assertEquals(2000000000, result);
    }
}
```