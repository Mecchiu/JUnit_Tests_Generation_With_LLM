// TimeStamp_14Test.java

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
        String expectedUTCString = "Tue, Dec 10 2002 10:41:49.986 UTC";
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of the current time.
     */
    @Test
    void testToUTCStringCurrentTime() {
        TimeStamp timeStamp = TimeStamp.getCurrentTime();
        Date currentDate = new Date(System.currentTimeMillis());
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expectedUTCString = utcFormatter.format(currentDate);
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with zero value.
     */
    @Test
    void testToUTCStringZeroTimestamp() {
        TimeStamp timeStamp = new TimeStamp(0L);
        String expectedUTCString = "Thu, Jan 01 1970 00:00:00.000 UTC";
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with maximum long value.
     */
    @Test
    void testToUTCStringMaxLongTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MAX_VALUE);
        // The expected date is far in the future, so we just check if it doesn't throw an error
        assertNotNull(timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with minimum long value.
     */
    @Test
    void testToUTCStringMinLongTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MIN_VALUE);
        // The expected date is far in the past, so we just check if it doesn't throw an error
        assertNotNull(timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a negative value.
     */
    @Test
    void testToUTCStringNegativeTimestamp() {
        TimeStamp timeStamp = new TimeStamp(-1L);
        String expectedUTCString = "Wed, Dec 31 1969 23:59:59.999 UTC";
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a fractional second.
     */
    @Test
    void testToUTCStringFractionalSecond() {
        // NTP timestamp for a date with fractional seconds
        long ntpTime = 0xc1a089bd_fc000000L; // Tue, Dec 10 2002 10:41:49.000 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedUTCString = "Tue, Dec 10 2002 10:41:49.000 UTC";
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a leap second.
     */
    @Test
    void testToUTCStringLeapSecond() {
        // NTP timestamp for a date with a leap second
        long ntpTime = 0xc1a089bd_ff000000L; // Tue, Dec 10 2002 10:41:49.999 UTC
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedUTCString = "Tue, Dec 10 2002 10:41:49.999 UTC";
        assertEquals(expectedUTCString, timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a future date.
     */
    @Test
    void testToUTCStringFutureDate() {
        // NTP timestamp for a future date
        long ntpTime = 0xe1a089bd_fc904f6dL; // Some future date
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        // The expected date is in the future, so we just check if it doesn't throw an error
        assertNotNull(timeStamp.toUTCString());
    }

    /**
     * Test case for verifying the UTC string representation of a timestamp with a past date.
     */
    @Test
    void testToUTCStringPastDate() {
        // NTP timestamp for a past date
        long ntpTime = 0x41a089bd_fc904f6dL; // Some past date
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        // The expected date is in the past, so we just check if it doesn't throw an error
        assertNotNull(timeStamp.toUTCString());
    }
}