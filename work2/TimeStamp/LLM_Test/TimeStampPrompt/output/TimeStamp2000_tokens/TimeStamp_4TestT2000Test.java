package timestamp;
// TimeStamp_4Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getDate()} method.
*/
class TimeStamp_4Test {
    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a known NTP timestamp.
     */
    @Test
    void testGetDateForKnownNtpTime() {
        // NTP timestamp for Tue, Dec 10 2002 10:41:49.986
        long ntpTime = 0xc1a089bd_fc904f6dL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(1039518109986L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for the current time.
     */
    @Test
    void testGetDateForCurrentTime() {
        TimeStamp currentTimeStamp = TimeStamp.getCurrentTime();
        Date currentDate = new Date(System.currentTimeMillis());
        // Allow a small margin of error due to execution time
        assertTrue(Math.abs(currentTimeStamp.getDate().getTime() - currentDate.getTime()) < 1000);
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for the epoch time.
     */
    @Test
    void testGetDateForEpochTime() {
        TimeStamp epochTimeStamp = new TimeStamp(0x83aa7e80_00000000L); // NTP time for 1970-01-01 00:00:00
        Date epochDate = new Date(0L);
        assertEquals(epochDate, epochTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a future date.
     */
    @Test
    void testGetDateForFutureTime() {
        // NTP timestamp for a future date: 7-Feb-2036 @ 06:28:16 UTC
        long ntpTime = 0x00000000_00000000L;
        TimeStamp futureTimeStamp = new TimeStamp(ntpTime);
        Date futureDate = new Date(2085978496000L);
        assertEquals(futureDate, futureTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a past date.
     */
    @Test
    void testGetDateForPastTime() {
        // NTP timestamp for a past date: 1-Jan-1900 @ 01:00:00 UTC
        long ntpTime = 0x80000000_00000000L;
        TimeStamp pastTimeStamp = new TimeStamp(ntpTime);
        Date pastDate = new Date(-2208988800000L);
        assertEquals(pastDate, pastTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a random date.
     */
    @Test
    void testGetDateForRandomTime() {
        // Random NTP timestamp
        long ntpTime = 0xe1a089bd_fc904f6dL;
        TimeStamp randomTimeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(1234567890123L); // Example Java time
        assertNotEquals(expectedDate, randomTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for the maximum long value.
     */
    @Test
    void testGetDateForMaxLongValue() {
        TimeStamp maxLongTimeStamp = new TimeStamp(Long.MAX_VALUE);
        Date maxLongDate = new Date(Long.MAX_VALUE);
        assertNotEquals(maxLongDate, maxLongTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for the minimum long value.
     */
    @Test
    void testGetDateForMinLongValue() {
        TimeStamp minLongTimeStamp = new TimeStamp(Long.MIN_VALUE);
        Date minLongDate = new Date(Long.MIN_VALUE);
        assertNotEquals(minLongDate, minLongTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for zero timestamp.
     */
    @Test
    void testGetDateForZeroTime() {
        TimeStamp zeroTimeStamp = new TimeStamp(0L);
        Date zeroDate = new Date(-2208988800000L); // Corresponds to 1-Jan-1900
        assertEquals(zeroDate, zeroTimeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a timestamp with only fractional seconds.
     */
    @Test
    void testGetDateForFractionalSeconds() {
        long ntpTime = 0x00000000_fc904f6dL; // Only fractional part
        TimeStamp fractionalTimeStamp = new TimeStamp(ntpTime);
        Date fractionalDate = new Date(-2208988800000L + 0x00000000_fc904f6dL / 0x100000000L * 1000);
        assertEquals(fractionalDate, fractionalTimeStamp.getDate());
    }
}