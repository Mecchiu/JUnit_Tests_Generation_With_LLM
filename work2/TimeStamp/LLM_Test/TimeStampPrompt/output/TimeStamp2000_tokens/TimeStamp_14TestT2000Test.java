package timestamp;
// TimeStamp_14Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#toUTCString()} method.
*/
class TimeStamp_14Test {
    /**
     * Test case for verifying the UTC string representation of a known NTP timestamp.
     */
    @Test
    void testToUTCStringKnownTimestamp() {
        // Known NTP timestamp for Tue, Dec 10 2002 10:41:49.986 UTC
        long ntpTime = 0xc1a089bd_fc904f6dL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expected = "Tue, Dec 10 2002 10:41:49.986 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of the current time.
     */
    @Test
    void testToUTCStringCurrentTime() {
        TimeStamp timeStamp = TimeStamp.getCurrentTime();
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expected = utcFormatter.format(new Date(System.currentTimeMillis()));
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of the epoch time.
     */
    @Test
    void testToUTCStringEpochTime() {
        TimeStamp timeStamp = new TimeStamp(new Date(0));
        String expected = "Thu, Jan 01 1970 00:00:00.000 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a time before 1970.
     */
    @Test
    void testToUTCStringBeforeEpoch() {
        // Date: Wed, Dec 31 1969 23:59:59.999 UTC
        TimeStamp timeStamp = new TimeStamp(new Date(-1));
        String expected = "Wed, Dec 31 1969 23:59:59.999 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a time after 2036.
     */
    @Test
    void testToUTCStringAfter2036() {
        // Date: Fri, Feb 07 2036 06:28:16.000 UTC
        long ntpTime = 0x00000000_00000000L; // NTP time for 7-Feb-2036 @ 06:28:16 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expected = "Fri, Feb 07 2036 06:28:16.000 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a random timestamp.
     */
    @Test
    void testToUTCStringRandomTimestamp() {
        // Random NTP timestamp
        long ntpTime = 0xabcdef12_34567890L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expected = utcFormatter.format(timeStamp.getDate());
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with zero fraction.
     */
    @Test
    void testToUTCStringZeroFraction() {
        // NTP timestamp with zero fraction
        long ntpTime = 0xc1a089bd_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expected = "Tue, Dec 10 2002 10:41:49.000 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with maximum fraction.
     */
    @Test
    void testToUTCStringMaxFraction() {
        // NTP timestamp with maximum fraction
        long ntpTime = 0xc1a089bd_ffffffffL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expected = utcFormatter.format(timeStamp.getDate());
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with minimum fraction.
     */
    @Test
    void testToUTCStringMinFraction() {
        // NTP timestamp with minimum fraction
        long ntpTime = 0xc1a089bd_00000001L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expected = utcFormatter.format(timeStamp.getDate());
        assertEquals(expected, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a specific date.
     */
    @Test
    void testToUTCStringSpecificDate() {
        // Specific date: Mon, Jan 01 2001 00:00:00.000 UTC
        Date specificDate = new Date(978307200000L);
        TimeStamp timeStamp = new TimeStamp(specificDate);
        String expected = "Mon, Jan 01 2001 00:00:00.000 UTC";
        assertEquals(expected, timeStamp.toUTCString());
    }
}