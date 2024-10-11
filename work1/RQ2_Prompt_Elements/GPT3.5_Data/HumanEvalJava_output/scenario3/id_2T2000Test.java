// TruncateNumber.java
package scenario3;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
        return number - Math.floor(number);
    }
}

// TruncateNumberTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
    @Test
    void testTruncateNumber() {
        assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
        assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
        assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
        assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
        assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
        assertEquals(0.1, TruncateNumber.truncateNumber(0.1));
        assertEquals(0.01, TruncateNumber.truncateNumber(0.01));
        assertEquals(0.001, TruncateNumber.truncateNumber(0.001));
        assertEquals(0.0001, TruncateNumber.truncateNumber(0.0001));
        assertEquals(0.00001, TruncateNumber.truncateNumber(0.00001));
    }
}