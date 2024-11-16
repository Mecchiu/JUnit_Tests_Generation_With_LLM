// TimeStamp_0Test.java

package timestamp;

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
        long expectedNtpValue = 0xc1a089bdL << 32 | 0xfc904f6dL;
        TimeStamp timeStamp = new TimeStamp(expectedNtpValue);
        assertEquals(expectedNtpValue, timeStamp.ntpValue(), "The NTP value should match the expected value.");
    }

    /**
     * Test case for ntpValue() method with zero value.
     * This test checks if the ntpValue() method returns zero when initialized with zero.
     */
    @Test
    void testNtpValueZero() {
        TimeStamp timeStamp = new TimeStamp(0L);
        assertEquals(0L, timeStamp.ntpValue(), "The NTP value should be zero.");
    }

    /**
     * Test case for ntpValue() method with maximum value.
     * This test checks if the ntpValue() method returns the maximum possible NTP timestamp value.
     */
    @Test
    void testNtpValueMax() {
        long maxNtpValue = 0xFFFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(maxNtpValue);
        assertEquals(maxNtpValue, timeStamp.ntpValue(), "The NTP value should be the maximum possible value.");
    }

    /**
     * Test case for ntpValue() method with minimum value.
     * This test checks if the ntpValue() method returns the minimum possible NTP timestamp value.
     */
    @Test
    void testNtpValueMin() {
        long minNtpValue = 0x0000000000000000L;
        TimeStamp timeStamp = new TimeStamp(minNtpValue);
        assertEquals(minNtpValue, timeStamp.ntpValue(), "The NTP value should be the minimum possible value.");
    }

    /**
     * Test case for ntpValue() method with a random value.
     * This test checks if the ntpValue() method returns the correct NTP timestamp value for a random input.
     */
    @Test
    void testNtpValueRandom() {
        long randomNtpValue = 0x12345678L << 32 | 0x9abcdef0L;
        TimeStamp timeStamp = new TimeStamp(randomNtpValue);
        assertEquals(randomNtpValue, timeStamp.ntpValue(), "The NTP value should match the random input value.");
    }

    /**
     * Test case for ntpValue() method with a negative value.
     * This test checks if the ntpValue() method handles negative values correctly.
     */
    @Test
    void testNtpValueNegative() {
        long negativeNtpValue = -1L;
        TimeStamp timeStamp = new TimeStamp(negativeNtpValue);
        assertEquals(negativeNtpValue, timeStamp.ntpValue(), "The NTP value should match the negative input value.");
    }

    /**
     * Test case for ntpValue() method with a large positive value.
     * This test checks if the ntpValue() method handles large positive values correctly.
     */
    @Test
    void testNtpValueLargePositive() {
        long largePositiveNtpValue = 0x7FFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(largePositiveNtpValue);
        assertEquals(largePositiveNtpValue, timeStamp.ntpValue(), "The NTP value should match the large positive input value.");
    }

    /**
     * Test case for ntpValue() method with a large negative value.
     * This test checks if the ntpValue() method handles large negative values correctly.
     */
    @Test
    void testNtpValueLargeNegative() {
        long largeNegativeNtpValue = 0x8000000000000000L;
        TimeStamp timeStamp = new TimeStamp(largeNegativeNtpValue);
        assertEquals(largeNegativeNtpValue, timeStamp.ntpValue(), "The NTP value should match the large negative input value.");
    }

    /**
     * Test case for ntpValue() method with a value close to zero.
     * This test checks if the ntpValue() method handles values close to zero correctly.
     */
    @Test
    void testNtpValueCloseToZero() {
        long closeToZeroNtpValue = 0x0000000000000001L;
        TimeStamp timeStamp = new TimeStamp(closeToZeroNtpValue);
        assertEquals(closeToZeroNtpValue, timeStamp.ntpValue(), "The NTP value should match the value close to zero.");
    }

    /**
     * Test case for ntpValue() method with a value close to maximum.
     * This test checks if the ntpValue() method handles values close to maximum correctly.
     */
    @Test
    void testNtpValueCloseToMax() {
        long closeToMaxNtpValue = 0xFFFFFFFFFFFFFFFEL;
        TimeStamp timeStamp = new TimeStamp(closeToMaxNtpValue);
        assertEquals(closeToMaxNtpValue, timeStamp.ntpValue(), "The NTP value should match the value close to maximum.");
    }
}