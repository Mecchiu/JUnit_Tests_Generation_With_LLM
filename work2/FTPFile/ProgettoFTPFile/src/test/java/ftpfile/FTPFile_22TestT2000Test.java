package ftpfile;
// FTPFile_22Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#getTimestamp()} method.
*/
class FTPFile_22Test {
    /**
     * Test case for verifying the default timestamp of a newly created FTPFile.
     */
    @Test
    void testDefaultTimestamp() {
        FTPFile file = new FTPFile();
        assertNull(file.getTimestamp(), "Default timestamp should be null");
    }

    /**
     * Test case for setting and getting a valid timestamp.
     */
    @Test
    void testSetAndGetTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the set value");
    }

    /**
     * Test case for setting a null timestamp.
     */
    @Test
    void testSetNullTimestamp() {
        FTPFile file = new FTPFile();
        file.setTimestamp(null);
        assertNull(file.getTimestamp(), "Timestamp should be null after setting null");
    }

    /**
     * Test case for verifying timestamp with a specific timezone.
     */
    @Test
    void testTimestampWithTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the set value with timezone");
    }

    /**
     * Test case for verifying timestamp after changing the timezone.
     */
    @Test
    void testChangeTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        file.setTimestamp(calendar);
        Calendar newCalendar = Calendar.getInstance(TimeZone.getTimeZone("PST"));
        newCalendar.setTime(calendar.getTime());
        file.setTimestamp(newCalendar);
        assertEquals(newCalendar, file.getTimestamp(), "Timestamp should match the new timezone");
    }

    /**
     * Test case for verifying timestamp with a leap year date.
     */
    @Test
    void testLeapYearTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.FEBRUARY, 29); // Leap year date
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the leap year date");
    }

    /**
     * Test case for verifying timestamp with a past date.
     */
    @Test
    void testPastDateTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JANUARY, 1);
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the past date");
    }

    /**
     * Test case for verifying timestamp with a future date.
     */
    @Test
    void testFutureDateTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2050, Calendar.DECEMBER, 31);
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the future date");
    }

    /**
     * Test case for verifying timestamp with only date set (no time).
     */
    @Test
    void testDateOnlyTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the date-only value");
    }

    /**
     * Test case for verifying timestamp with maximum possible date.
     */
    @Test
    void testMaxDateTimestamp() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 9999);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp(), "Timestamp should match the maximum possible date");
    }
}