package timestamp;
// TimeStamp_7Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getCurrentTime()} method.
*/
class TimeStamp_7Test {
    /**
     * Test case for verifying that the current time is not null.
     */
    @Test
    void testGetCurrentTimeNotNull() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        assertNotNull(currentTime, "Current time should not be null");
    }

    /**
     * Test case for verifying that the current time is close to the system time.
     */
    @Test
    void testGetCurrentTimeCloseToSystemTime() {
        long systemTime = System.currentTimeMillis();
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        long ntpTime = currentTime.getTime();
        assertTrue(Math.abs(systemTime - ntpTime) < 1000, "Current time should be close to system time");
    }

    /**
     * Test case for verifying that the current time is consistent when called multiple times.
     */
    @Test
    void testGetCurrentTimeConsistency() {
        TimeStamp currentTime1 = TimeStamp.getCurrentTime();
        TimeStamp currentTime2 = TimeStamp.getCurrentTime();
        assertEquals(currentTime1, currentTime2, "Current time should be consistent when called multiple times");
    }

    /**
     * Test case for verifying that the current time is after a known past time.
     */
    @Test
    void testGetCurrentTimeAfterPastTime() {
        TimeStamp pastTime = new TimeStamp(new Date(0)); // January 1, 1970
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        assertTrue(currentTime.compareTo(pastTime) > 0, "Current time should be after a known past time");
    }

    /**
     * Test case for verifying that the current time is before a known future time.
     */
    @Test
    void testGetCurrentTimeBeforeFutureTime() {
        TimeStamp futureTime = new TimeStamp(new Date(Long.MAX_VALUE)); // Far future date
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        assertTrue(currentTime.compareTo(futureTime) < 0, "Current time should be before a known future time");
    }

    /**
     * Test case for verifying that the current time is correctly formatted as a string.
     */
    @Test
    void testGetCurrentTimeStringFormat() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        String timeString = currentTime.toString();
        assertNotNull(timeString, "Current time string should not be null");
        assertTrue(timeString.matches("[0-9a-f]{8}\\.[0-9a-f]{8}"), "Current time string should match the expected format");
    }

    /**
     * Test case for verifying that the current time is correctly formatted as a date string.
     */
    @Test
    void testGetCurrentTimeDateStringFormat() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        String dateString = currentTime.toDateString();
        assertNotNull(dateString, "Current time date string should not be null");
        DateFormat simpleFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT, Locale.US);
        simpleFormatter.setTimeZone(TimeZone.getDefault());
        Date parsedDate = simpleFormatter.parse(dateString, new java.text.ParsePosition(0));
        assertNotNull(parsedDate, "Current time date string should be parsable");
    }

    /**
     * Test case for verifying that the current time is correctly formatted as a UTC string.
     */
    @Test
    void testGetCurrentTimeUTCStringFormat() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        String utcString = currentTime.toUTCString();
        assertNotNull(utcString, "Current time UTC string should not be null");
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parsedDate = utcFormatter.parse(utcString, new java.text.ParsePosition(0));
        assertNotNull(parsedDate, "Current time UTC string should be parsable");
    }

    /**
     * Test case for verifying that the current time is equal to itself.
     */
    @Test
    void testGetCurrentTimeEqualsItself() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        assertEquals(currentTime, currentTime, "Current time should be equal to itself");
    }

    /**
     * Test case for verifying that the current time is not equal to a different time.
     */
    @Test
    void testGetCurrentTimeNotEqualsDifferentTime() {
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        TimeStamp differentTime = new TimeStamp(new Date(0)); // January 1, 1970
        assertNotEquals(currentTime, differentTime, "Current time should not be equal to a different time");
    }
}