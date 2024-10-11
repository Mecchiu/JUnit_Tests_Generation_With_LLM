package timestamp;
// TimeStamp_13Test.java


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
     * Test case for verifying the date string format of a known timestamp.
     */
    @Test
    void testToDateStringKnownTimestamp() {
        TimeStamp timeStamp = new TimeStamp("c1a089bd.fc904f6d");
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.986";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of the current timestamp.
     */
    @Test
    void testToDateStringCurrentTimestamp() {
        TimeStamp timeStamp = TimeStamp.getCurrentTime();
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(new Date());
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
     * Test case for verifying the date string format of a timestamp with maximum long value.
     */
    @Test
    void testToDateStringMaxLongTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MAX_VALUE);
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(new Date(Long.MAX_VALUE));
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with minimum long value.
     */
    @Test
    void testToDateStringMinLongTimestamp() {
        TimeStamp timeStamp = new TimeStamp(Long.MIN_VALUE);
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        String expectedDateString = simpleFormatter.format(new Date(Long.MIN_VALUE));
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
        TimeStamp timeStamp = new TimeStamp("c1a089bd.fc904f6d");
        String expectedDateString = "Tue, Dec 10 2002 10:41:49.986";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a leap year date.
     */
    @Test
    void testToDateStringLeapYear() {
        Date leapYearDate = new Date(951782400000L); // Tue, Feb 29 2000 00:00:00.000
        TimeStamp timeStamp = new TimeStamp(leapYearDate);
        String expectedDateString = "Tue, Feb 29 2000 00:00:00.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }

    /**
     * Test case for verifying the date string format of a timestamp with a date in the future.
     */
    @Test
    void testToDateStringFutureDate() {
        Date futureDate = new Date(4102444800000L); // Fri, Jan 01 2100 00:00:00.000
        TimeStamp timeStamp = new TimeStamp(futureDate);
        String expectedDateString = "Fri, Jan 01 2100 00:00:00.000";
        assertEquals(expectedDateString, timeStamp.toDateString());
    }
}