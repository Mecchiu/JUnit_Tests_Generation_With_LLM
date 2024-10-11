package timestamp;
// TimeStamp_5Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getTime(long)} method.
*/
class TimeStamp_5Test {
    /**
     * Test case for the getTime method with a timestamp representing a date before 2036.
     */
    @Test
    void testGetTimeBefore2036() {
        // NTP timestamp for 1-Jan-1970 00:00:00 UTC
        long ntpTime = 0x83AA7E80L << 32;
        long expectedTime = 0L; // Java epoch time
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date after 2036.
     */
    @Test
    void testGetTimeAfter2036() {
        // NTP timestamp for 7-Feb-2036 06:28:16 UTC
        long ntpTime = 0x00000000L;
        long expectedTime = 2085978496000L; // Java time for 7-Feb-2036 06:28:16 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 1900.
     */
    @Test
    void testGetTimeIn1900() {
        // NTP timestamp for 1-Jan-1900 01:00:00 UTC
        long ntpTime = 0x80000000L << 32;
        long expectedTime = -2208988800000L; // Java time for 1-Jan-1900 01:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 2000.
     */
    @Test
    void testGetTimeIn2000() {
        // NTP timestamp for 1-Jan-2000 00:00:00 UTC
        long ntpTime = 0x83AA7E80L << 32;
        long expectedTime = 946684800000L; // Java time for 1-Jan-2000 00:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 2100.
     */
    @Test
    void testGetTimeIn2100() {
        // NTP timestamp for 1-Jan-2100 00:00:00 UTC
        long ntpTime = 0xA2C2A080L << 32;
        long expectedTime = 4102444800000L; // Java time for 1-Jan-2100 00:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 1969.
     */
    @Test
    void testGetTimeIn1969() {
        // NTP timestamp for 31-Dec-1969 23:59:59 UTC
        long ntpTime = 0x83AA7E7FL << 32;
        long expectedTime = -1000L; // Java time for 31-Dec-1969 23:59:59 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 2037.
     */
    @Test
    void testGetTimeIn2037() {
        // NTP timestamp for 1-Jan-2037 00:00:00 UTC
        long ntpTime = 0x00000001L;
        long expectedTime = 2085978496000L + 31536000000L; // Java time for 1-Jan-2037 00:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 1999.
     */
    @Test
    void testGetTimeIn1999() {
        // NTP timestamp for 31-Dec-1999 23:59:59 UTC
        long ntpTime = 0x83AA7E7FL << 32;
        long expectedTime = 946684799000L; // Java time for 31-Dec-1999 23:59:59 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 2001.
     */
    @Test
    void testGetTimeIn2001() {
        // NTP timestamp for 1-Jan-2001 00:00:00 UTC
        long ntpTime = 0x83AA7E81L << 32;
        long expectedTime = 978307200000L; // Java time for 1-Jan-2001 00:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }

    /**
     * Test case for the getTime method with a timestamp representing a date in 2040.
     */
    @Test
    void testGetTimeIn2040() {
        // NTP timestamp for 1-Jan-2040 00:00:00 UTC
        long ntpTime = 0x00000004L;
        long expectedTime = 2085978496000L + 94608000000L; // Java time for 1-Jan-2040 00:00:00 UTC
        assertEquals(expectedTime, TimeStamp.getTime(ntpTime));
    }
}