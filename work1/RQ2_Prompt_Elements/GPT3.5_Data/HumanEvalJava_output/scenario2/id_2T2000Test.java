// TruncateNumberTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TruncateNumber}.
 * It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
 */
class TruncateNumberTest {

    @Test
    void testTruncateNumberWithPositiveInteger() {
        Double result = TruncateNumber.truncateNumber(10.0);
        assertEquals(0.0, result);
    }

    @Test
    void testTruncateNumberWithPositiveDecimal() {
        Double result = TruncateNumber.truncateNumber(10.123);
        assertEquals(0.123, result);
    }

    @Test
    void testTruncateNumberWithNegativeInteger() {
        Double result = TruncateNumber.truncateNumber(-10.0);
        assertEquals(0.0, result);
    }

    @Test
    void testTruncateNumberWithNegativeDecimal() {
        Double result = TruncateNumber.truncateNumber(-10.123);
        assertEquals(0.123, result);
    }

    @Test
    void testTruncateNumberWithZero() {
        Double result = TruncateNumber.truncateNumber(0.0);
        assertEquals(0.0, result);
    }

    @Test
    void testTruncateNumberWithLargeNumber() {
        Double result = TruncateNumber.truncateNumber(123456789.123456789);
        assertEquals(0.123, result);
    }

    @Test
    void testTruncateNumberWithSmallNumber() {
        Double result = TruncateNumber.truncateNumber(0.000000001);
        assertEquals(0.0, result);
    }

    @Test
    void testTruncateNumberWithMaxValue() {
        Double result = TruncateNumber.truncateNumber(Double.MAX_VALUE);
        assertEquals(0.999, result);
    }

    @Test
    void testTruncateNumberWithMinValue() {
        Double result = TruncateNumber.truncateNumber(Double.MIN_VALUE);
        assertEquals(0.0, result);
    }

    @Test
    void testTruncateNumberWithNaN() {
        Double result = TruncateNumber.truncateNumber(Double.NaN);
        assertTrue(Double.isNaN(result));
    }
}