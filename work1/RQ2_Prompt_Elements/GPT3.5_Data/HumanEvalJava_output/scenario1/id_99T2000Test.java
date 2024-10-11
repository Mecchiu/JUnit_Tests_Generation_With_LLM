Here's the code for the ClosestIntegerTest class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerTest {

    @Test
    void testClosestIntegerPositive() {
        assertEquals(5, ClosestInteger.closestInteger("4.6"));
    }

    @Test
    void testClosestIntegerNegative() {
        assertEquals(-4, ClosestInteger.closestInteger("-4.6"));
    }

    @Test
    void testClosestIntegerZero() {
        assertEquals(0, ClosestInteger.closestInteger("0"));
    }

    @Test
    void testClosestIntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerMinValue() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    void testClosestIntegerMaxDouble() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerMinDouble() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(-Double.MAX_VALUE)));
    }

    @Test
    void testClosestIntegerNaN() {
        assertEquals(0, ClosestInteger.closestInteger(String.valueOf(Double.NaN)));
    }

    @Test
    void testClosestIntegerInfinity() {
        assertEquals(Integer.MAX_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.POSITIVE_INFINITY)));
    }

    @Test
    void testClosestIntegerNegativeInfinity() {
        assertEquals(Integer.MIN_VALUE, ClosestInteger.closestInteger(String.valueOf(Double.NEGATIVE_INFINITY)));
    }
}
```

This test class contains ten unit test cases for the `closestInteger` method of the `ClosestInteger` class. The test cases cover a range of input values, including positive and negative numbers, zero, the maximum and minimum values of the `int` data type, the maximum and minimum values of the `double` data type, `NaN`, `Infinity`, and `-Infinity`. The `assertEquals` method is used to compare the expected output of the `closestInteger` method with the actual output.