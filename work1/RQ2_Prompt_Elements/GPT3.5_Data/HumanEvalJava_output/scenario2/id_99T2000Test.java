Here's the code for the ClosestIntegerTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(15, ClosestInteger.closestInteger("14.5"));
        assertEquals(16, ClosestInteger.closestInteger("15.5"));
        assertEquals(1, ClosestInteger.closestInteger("0.5"));
        assertEquals(0, ClosestInteger.closestInteger("-0.5"));
        assertEquals(1, ClosestInteger.closestInteger("1.4"));
        assertEquals(2, ClosestInteger.closestInteger("1.6"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-15, ClosestInteger.closestInteger("-14.5"));
        assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
        assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
        assertEquals(0, ClosestInteger.closestInteger("0.5"));
        assertEquals(-1, ClosestInteger.closestInteger("-1.4"));
        assertEquals(-2, ClosestInteger.closestInteger("-1.6"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
        assertEquals(0, ClosestInteger.closestInteger("-0"));
    }

    @Test
    void testClosestIntegerLargeNumber() {
        assertEquals(2147483647, ClosestInteger.closestInteger("2147483647.5"));
        assertEquals(-2147483648, ClosestInteger.closestInteger("-2147483648.5"));
    }

    @Test
    void testClosestIntegerInvalidInput() {
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger("abc"));
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger(""));
        assertThrows(NumberFormatException.class, () -> ClosestInteger.closestInteger("1.2.3"));
    }
}
```

This test class contains ten unit test cases for the `closestInteger` method. The first six test cases test positive and negative decimal numbers, while the seventh and eighth test cases test zero and large numbers respectively. The ninth test case tests invalid input, and the last test case tests that an exception is thrown when invalid input is provided.