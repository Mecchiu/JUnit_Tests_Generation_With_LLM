```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTools_0Test {

    @Test
    void testFormatWithNullDate() {
        assertNull(DateTools.format(null));
    }

    @Test
    void testFormatWithValidDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        assertEquals(formatter.format(date), DateTools.format(date));
    }

    @Test
    void testFormatWithCustomFormat() {
        Date date = new Date();
        String customFormat = "dd/MM/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(customFormat);
        assertEquals(formatter.format(date), DateTools.format(date, customFormat));
    }

    @Test
    void testParseWithNullString() {
        assertNull(DateTools.parse(null));
    }

    @Test
    void testParseWithValidDateString() {
        String dateString = "2022-01-01";
        SimpleDateFormat formatter = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT);
        try {
            Date expectedDate = formatter.parse(dateString);
            assertEquals(expectedDate, DateTools.parse(dateString));
        } catch (ParseException e) {
            fail("ParseException occurred during testParseWithValidDateString");
        }
    }

    @Test
    void testParseWithCustomFormat() {
        String dateString = "01/01/2022";
        String customFormat = "dd/MM/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(customFormat);
        try {
            Date expectedDate = formatter.parse(dateString);
            assertEquals(expectedDate, DateTools.parse(dateString, customFormat));
        } catch (ParseException e) {
            fail("ParseException occurred during testParseWithCustomFormat");
        }
    }

    @Test
    void testIsValidDateWithNullString() {
        assertFalse(DateTools.isValidDate(null));
    }

    @Test
    void testIsValidDateWithValidDateString() {
        String dateString = "2022-01-01";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDateWithInvalidDateString() {
        String dateString = "01/01/2022";
        assertFalse(DateTools.isValidDate(dateString));
    }
}
```
```