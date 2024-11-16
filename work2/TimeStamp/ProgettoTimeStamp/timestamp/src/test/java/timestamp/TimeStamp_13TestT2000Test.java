// TimeStamp_13Test.java

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
* It contains ten unit test cases for the {@link TimeStamp#toDateString()} method.
*/
class TimeStamp_13Test {
    /**
     * Test case for verifying the date string format of a known NTP timestamp.
     */
    @Test
    void testToDateStringKnownTimestamp() {
        // Known NTP timestamp for Tue, Dec 10 2002 10:41:49.986
        long ntpTime = 0xc1a089bdL << 32 | 0xfc904f6dL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.986";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of the current time.
     */
    @Test
    void testToDateStringCurrentTime() {
        TimeStamp timeStamp = TimeStamp.getCurrentTime();
        Date currentDate = new Date(System.currentTimeMillis());
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(currentDate);
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with zero value.
     */
    @Test
    void testToDateStringZeroTimestamp() {
        TimeStamp timeStamp = new TimeStamp(0L);
        String expectedDateString = "Thu, Jan 01 1970 00:00:00.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with maximum value.
     */
    @Test
    void testToDateStringMaxTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MAX_VALUE);
        Date maxDate = new Date(timeStamp.getTime());
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(maxDate);
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with minimum value.
     */
    @Test
    void testToDateStringMinTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MIN_VALUE);
        Date minDate = new Date(timeStamp.getTime());
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(minDate);
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a specific date.
     */
    @Test
    void testToDateStringSpecificDate() {
        Date specificDate = new Date(1000000000000L); // Sat, Sep 08 2001 01:46:40.000
        TimeStamp timeStamp = new TimeStamp(specificDate);
        String expectedDateString = "Sat, Sep 08 2001 01:46:40.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a negative date.
     */
    @Test
    void testToDateStringNegativeDate() {
        Date negativeDate = new Date(-1000000000000L); // Mon, Apr 24 1933 22:13:20.000
        TimeStamp timeStamp = new TimeStamp(negativeDate);
        String expectedDateString = "Mon, Apr 24 1933 22:13:20.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a fractional second.
     */
    @Test
    void testToDateStringFractionalSecond() {
        long ntpTime = 0xc1a089bdL << 32 | 0x00000001L; // Slightly after Tue, Dec 10 2002 10:41:49.000
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a leap second.
     */
    @Test
    void testToDateStringLeapSecond() {
        long ntpTime = 0xc1a089bdL << 32 | 0xffffffffL; // Just before Tue, Dec 10 2002 10:41:50.000
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.999";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a large fractional second.
     */
    @Test
    void testToDateStringLargeFractionalSecond() {
        long ntpTime = 0xc1a089bdL << 32 | 0x80000000L; // Halfway through Tue, Dec 10 2002 10:41:49.500
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.500";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }
}