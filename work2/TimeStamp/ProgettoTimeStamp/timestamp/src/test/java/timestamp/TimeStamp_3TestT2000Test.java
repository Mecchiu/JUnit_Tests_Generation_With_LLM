// TimeStamp_3Test.java

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
* It contains ten unit test cases for the {@link TimeStamp#getTime()} method.
*/
class TimeStamp_3Test {
    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a known timestamp.
     */
    @Test
    void testGetTimeKnownValue() {
        // Known NTP timestamp for 1-Jan-1970 00:00:00 UTC
        long ntpTime = 0x83AA7E80L << 32; // equivalent to 2208988800 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(0L, timeStamp.getTime(), "The Java time should be 0 for the epoch start.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp in 2036.
     */
    @Test
    void testGetTime2036() {
        // NTP timestamp for 7-Feb-2036 06:28:16 UTC
        long ntpTime = 0x00000000L; // seconds part is 0 for 2036 base
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(2085978496000L, timeStamp.getTime(), "The Java time should match the 2036 base time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp in 1900.
     */
    @Test
    void testGetTime1900() {
        // NTP timestamp for 1-Jan-1900 01:00:00 UTC
        long ntpTime = 0x80000000L << 32; // MSB set for 1900 base
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(-2208988800000L, timeStamp.getTime(), "The Java time should match the 1900 base time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles fractional seconds correctly.
     */
    @Test
    void testGetTimeFractionalSeconds() {
        // NTP timestamp with fractional seconds
        long ntpTime = (0x83AA7E80L << 32) | 0x80000000L; // 0.5 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(500L, timeStamp.getTime(), "The Java time should account for fractional seconds.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles maximum possible NTP time.
     */
    @Test
    void testGetTimeMaxValue() {
        // Maximum NTP timestamp value
        long ntpTime = 0xFFFFFFFFFFFFFFFFL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(Long.MAX_VALUE, timeStamp.getTime(), "The Java time should be Long.MAX_VALUE for max NTP time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles minimum possible NTP time.
     */
    @Test
    void testGetTimeMinValue() {
        // Minimum NTP timestamp value
        long ntpTime = 0x0000000000000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(Long.MIN_VALUE, timeStamp.getTime(), "The Java time should be Long.MIN_VALUE for min NTP time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles a random timestamp correctly.
     */
    @Test
    void testGetTimeRandomValue() {
        // Random NTP timestamp
        long ntpTime = 0xC1A089BDL << 32 | 0xFC904F6DL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedTime = TimeStamp.getTime(ntpTime);
        assertEquals(expectedTime, timeStamp.getTime(), "The Java time should match the expected conversion.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles a timestamp with only fractional part.
     */
    @Test
    void testGetTimeOnlyFraction() {
        // NTP timestamp with only fractional part
        long ntpTime = 0x00000000L << 32 | 0x80000000L; // 0.5 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(500L, timeStamp.getTime(), "The Java time should account for only fractional seconds.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles a timestamp with only seconds part.
     */
    @Test
    void testGetTimeOnlySeconds() {
        // NTP timestamp with only seconds part
        long ntpTime = 0x83AA7E80L << 32; // 2208988800 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(0L, timeStamp.getTime(), "The Java time should account for only seconds part.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion handles a timestamp with both seconds and fractional parts.
     */
    @Test
    void testGetTimeSecondsAndFraction() {
        // NTP timestamp with both seconds and fractional parts
        long ntpTime = (0x83AA7E80L << 32) | 0x40000000L; // 0.25 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(250L, timeStamp.getTime(), "The Java time should account for both seconds and fractional parts.");
    }
}