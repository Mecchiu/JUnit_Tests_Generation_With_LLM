// FTPFile_21Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#setTimestamp(Calendar)} method.
*/
class FTPFile_21Test {
```java
    /**
     * Test case for setting a valid timestamp.
     */
    @Test
    void testSetTimestampValid() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        assertEquals(calendar, file.getTimestamp());
    }

    /**
     * Test case for setting a null timestamp.
     */
    @Test
    void testSetTimestampNull() {
        FTPFile file = new FTPFile();
        file.setTimestamp(null);
        assertNull(file.getTimestamp());
    }

    /**
     * Test case for setting a timestamp and checking if it is not altered.
     */
    @Test
    void testSetTimestampImmutable() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        calendar.set(2023, Calendar.NOVEMBER, 11, 11, 11, 11);
        assertNotEquals(calendar, file.getTimestamp());
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted.
     */
    @Test
    void testSetTimestampFormattedString() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("GMT");
        assertTrue(formattedString.contains("2023-10-10 10:10:10 GMT"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with a different timezone.
     */
    @Test
    void testSetTimestampFormattedStringDifferentTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("PST");
        assertTrue(formattedString.contains("2023-10-10 03:10:10 PST"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with an invalid timezone.
     */
    @Test
    void testSetTimestampFormattedStringInvalidTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("Invalid-Timezone");
        assertTrue(formattedString.contains("2023-10-10 10:10:10 GMT"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with null timezone.
     */
    @Test
    void testSetTimestampFormattedStringNullTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString(null);
        assertTrue(formattedString.contains("2023-10-10 10:10:10"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with a specific timezone.
     */
    @Test
    void testSetTimestampFormattedStringSpecificTimezone() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("Asia/Tokyo");
        assertTrue(formattedString.contains("2023-10-10 19:10:10 JST"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with UTC timezone.
     */
    @Test
    void testSetTimestampFormattedStringUTC() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("UTC");
        assertTrue(formattedString.contains("2023-10-10 10:10:10 UTC"));
    }

    /**
     * Test case for setting a timestamp and checking if it is correctly formatted with CET timezone.
     */
    @Test
    void testSetTimestampFormattedStringCET() {
        FTPFile file = new FTPFile();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 10, 10, 10, 10);
        file.setTimestamp(calendar);
        String formattedString = file.toFormattedString("CET");
        assertTrue(formattedString.contains("2023-10-10 11:10:10 CET"));
    }
}
```

This test class `FTPFile_21Test` contains ten unit test cases for the `setTimestamp(Calendar)` method of the `FTPFile` class. Each test case checks different aspects of setting and formatting the timestamp, including handling of different time zones and invalid inputs.