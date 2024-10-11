package timestamp;
// TimeStamp_0Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#ntpValue()} method.
*/
class TimeStamp_0Test {
    /**
     * Test case for ntpValue() method.
     * This test checks if the ntpValue() method returns the correct NTP timestamp value.
     */
    @Test
    void testNtpValue() {
        long expectedNtpValue = 0x83aa7e80L << 32; // Example NTP value
        TimeStamp timeStamp = new TimeStamp(expectedNtpValue);
        assertEquals(expectedNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with zero value.
     * This test checks if the ntpValue() method returns zero for a zero NTP timestamp.
     */
    @Test
    void testNtpValueZero() {
        TimeStamp timeStamp = new TimeStamp(0L);
        assertEquals(0L, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with maximum value.
     * This test checks if the ntpValue() method returns the maximum NTP timestamp value.
     */
    @Test
    void testNtpValueMax() {
        long maxNtpValue = 0xFFFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(maxNtpValue);
        assertEquals(maxNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with minimum value.
     * This test checks if the ntpValue() method returns the minimum NTP timestamp value.
     */
    @Test
    void testNtpValueMin() {
        long minNtpValue = 0x0000000000000000L;
        TimeStamp timeStamp = new TimeStamp(minNtpValue);
        assertEquals(minNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a random value.
     * This test checks if the ntpValue() method returns the correct NTP timestamp value for a random input.
     */
    @Test
    void testNtpValueRandom() {
        long randomNtpValue = 0x12345678ABCDEF01L;
        TimeStamp timeStamp = new TimeStamp(randomNtpValue);
        assertEquals(randomNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a negative value.
     * This test checks if the ntpValue() method handles negative values correctly.
     */
    @Test
    void testNtpValueNegative() {
        long negativeNtpValue = -0x12345678ABCDEF01L;
        TimeStamp timeStamp = new TimeStamp(negativeNtpValue);
        assertEquals(negativeNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a large positive value.
     * This test checks if the ntpValue() method handles large positive values correctly.
     */
    @Test
    void testNtpValueLargePositive() {
        long largePositiveNtpValue = 0x7FFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(largePositiveNtpValue);
        assertEquals(largePositiveNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a large negative value.
     * This test checks if the ntpValue() method handles large negative values correctly.
     */
    @Test
    void testNtpValueLargeNegative() {
        long largeNegativeNtpValue = -0x7FFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(largeNegativeNtpValue);
        assertEquals(largeNegativeNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a value close to zero.
     * This test checks if the ntpValue() method handles values close to zero correctly.
     */
    @Test
    void testNtpValueCloseToZero() {
        long closeToZeroNtpValue = 0x0000000000000001L;
        TimeStamp timeStamp = new TimeStamp(closeToZeroNtpValue);
        assertEquals(closeToZeroNtpValue, timeStamp.ntpValue());
    }

    /**
     * Test case for ntpValue() method with a value close to maximum.
     * This test checks if the ntpValue() method handles values close to maximum correctly.
     */
    @Test
    void testNtpValueCloseToMax() {
        long closeToMaxNtpValue = 0xFFFFFFFFFFFFFFFEL;
        TimeStamp timeStamp = new TimeStamp(closeToMaxNtpValue);
        assertEquals(closeToMaxNtpValue, timeStamp.ntpValue());
    }
}