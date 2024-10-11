package timestamp;
// TimeStamp_3Test.java


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
     * This test checks if the conversion is accurate for a known NTP timestamp.
     */
    @Test
    void testGetTimeForKnownNtpTimestamp() {
        // Known NTP timestamp for 1-Jan-1970 00:00:00 UTC
        long ntpTime = 0x83AA7E80L << 32; // equivalent to 2208988800 seconds
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(0L, timeStamp.getTime(), "The Java time should be 0 for the epoch start.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a current NTP timestamp.
     */
    @Test
    void testGetTimeForCurrentNtpTimestamp() {
        TimeStamp currentTimeStamp = TimeStamp.getCurrentTime();
        long currentJavaTime = System.currentTimeMillis();
        long timeDifference = Math.abs(currentTimeStamp.getTime() - currentJavaTime);
        assertTrue(timeDifference < 1000, "The time difference should be less than 1000 milliseconds.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a future NTP timestamp.
     */
    @Test
    void testGetTimeForFutureNtpTimestamp() {
        // Future date: 1-Jan-2100 00:00:00 UTC
        long futureNtpTime = 0xE17B0D00L << 32; // equivalent to 4102444800 seconds
        TimeStamp futureTimeStamp = new TimeStamp(futureNtpTime);
        long expectedJavaTime = 4102444800000L; // Java time for 1-Jan-2100
        assertEquals(expectedJavaTime, futureTimeStamp.getTime(), "The Java time should match the expected future time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a past NTP timestamp.
     */
    @Test
    void testGetTimeForPastNtpTimestamp() {
        // Past date: 1-Jan-1900 00:00:00 UTC
        long pastNtpTime = 0x00000000L; // equivalent to 0 seconds
        TimeStamp pastTimeStamp = new TimeStamp(pastNtpTime);
        long expectedJavaTime = -2208988800000L; // Java time for 1-Jan-1900
        assertEquals(expectedJavaTime, pastTimeStamp.getTime(), "The Java time should match the expected past time.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp with fractional seconds.
     */
    @Test
    void testGetTimeForFractionalNtpTimestamp() {
        // NTP timestamp with fractional seconds
        long ntpTime = (0x83AA7E80L << 32) | 0x80000000L; // 1-Jan-1970 00:00:00.5 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(500L, timeStamp.getTime(), "The Java time should be 500 milliseconds for the fractional timestamp.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp with maximum fractional seconds.
     */
    @Test
    void testGetTimeForMaxFractionalNtpTimestamp() {
        // NTP timestamp with maximum fractional seconds
        long ntpTime = (0x83AA7E80L << 32) | 0xFFFFFFFFL; // 1-Jan-1970 00:00:00.999999999 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(999L, timeStamp.getTime(), "The Java time should be 999 milliseconds for the max fractional timestamp.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp with minimum fractional seconds.
     */
    @Test
    void testGetTimeForMinFractionalNtpTimestamp() {
        // NTP timestamp with minimum fractional seconds
        long ntpTime = (0x83AA7E80L << 32) | 0x00000001L; // 1-Jan-1970 00:00:00.000000001 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(0L, timeStamp.getTime(), "The Java time should be 0 milliseconds for the min fractional timestamp.");
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java time.
     * This test checks if the conversion is accurate for a timestamp with zero seconds and maximum fraction.
     */
    @Test
    void testGetTimeForZeroSecondsMaxFractionNtpTimestamp() {
        // NTP timestamp with zero seconds and maximum fraction
        long ntpTime = 0xFFFFFFFFL; // 0 seconds and max fraction
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(-1L, timeStamp.getTime(), "The Java time should be -1 milliseconds for zero seconds and max fraction.");
    }
}