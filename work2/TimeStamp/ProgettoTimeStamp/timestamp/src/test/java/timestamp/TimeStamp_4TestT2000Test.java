// TimeStamp_4Test.java

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
     * This test checks if the conversion is accurate for the epoch time.
     */
    @Test
    void testGetDateForEpochTime() {
        // NTP timestamp for 1-Jan-1970 00:00:00.000
        long ntpTime = 0x83aa7e80_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(0L); // Java epoch time
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a future date.
     */
    @Test
    void testGetDateForFutureTime() {
        // NTP timestamp for 1-Jan-2100 00:00:00.000
        long ntpTime = 0xe17b0d80_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(4102444800000L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date before 1970.
     */
    @Test
    void testGetDateForPreEpochTime() {
        // NTP timestamp for 1-Jan-1960 00:00:00.000
        long ntpTime = 0x7c6ef9c0_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(-315619200000L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a leap year date.
     */
    @Test
    void testGetDateForLeapYear() {
        // NTP timestamp for 29-Feb-2000 00:00:00.000
        long ntpTime = 0xc0a8f380_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(951782400000L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date with fractional seconds.
     */
    @Test
    void testGetDateForFractionalSeconds() {
        // NTP timestamp for 1-Jan-2000 00:00:00.500
        long ntpTime = 0xc0a8f380_80000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(946684800500L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date with maximum fractional seconds.
     */
    @Test
    void testGetDateForMaxFractionalSeconds() {
        // NTP timestamp for 1-Jan-2000 00:00:00.999
        long ntpTime = 0xc0a8f380_fffffff0L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(946684800999L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date with minimum fractional seconds.
     */
    @Test
    void testGetDateForMinFractionalSeconds() {
        // NTP timestamp for 1-Jan-2000 00:00:00.001
        long ntpTime = 0xc0a8f380_00000010L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(946684800001L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date with zero fractional seconds.
     */
    @Test
    void testGetDateForZeroFractionalSeconds() {
        // NTP timestamp for 1-Jan-2000 00:00:00.000
        long ntpTime = 0xc0a8f380_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(946684800000L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to Java Date.
     * This test checks if the conversion is accurate for a date with random fractional seconds.
     */
    @Test
    void testGetDateForRandomFractionalSeconds() {
        // NTP timestamp for 1-Jan-2000 00:00:00.123
        long ntpTime = 0xc0a8f380_1f7ced91L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        Date expectedDate = new Date(946684800123L); // Java time in milliseconds
        assertEquals(expectedDate, timeStamp.getDate());
    }
}