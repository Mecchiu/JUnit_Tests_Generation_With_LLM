Here's an example implementation of the test class for the `DateTools` class:

```
// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link DateTools}.
 * It contains ten unit test cases for the {@link DateTools#format(Date)} method.
 */
class DateTools_0Test {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    @Test
    void testFormatNullDate() {
        assertNull(DateTools.format(null));
    }

    @Test
    void testFormatValidDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date));
    }

    @Test
    void testFormatInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.format(new Date(Long.MAX_VALUE));
        });
    }

    @Test
    void testFormatEmptyString() {
        assertEquals("", DateTools.format(new Date(0)));
    }

    @Test
    void testFormatDifferentFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("01/01/2021");
        assertEquals("01/01/2021", DateTools.format(date));
    }

    @Test
    void testFormatDifferentLocale() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.FRANCE);
        Date date = formatter.parse("01/01/2021");
        assertEquals("2021-01-01", DateTools.format(date));
    }

    @Test
    void testFormatBefore1900() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("1899-12-31");
        assertEquals("1899-12-31", DateTools.format(date));
    }

    @Test
    void testFormatAfter2100() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2100-01-01");
        assertEquals("2100-01-01", DateTools.format(date));
    }

    @Test
    void testFormatLeapYear() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2020-02-29");
        assertEquals("2020-02-29", DateTools.format(date));
    }

    @Test
    void testFormatNonLeapYear() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("2021-02-28");
        assertEquals("2021-02-28", DateTools.format(date));
    }
}
```

This test class contains ten test cases for the `DateTools.format(Date)` method. The test cases cover different scenarios such as null input, valid input, invalid input, different date formats, different locales, dates before 1900, dates after 2100, leap years, and non-leap years. The `@Test` annotation is used to mark each test case method, and the `assertEquals()` and `assertThrows()` methods are used to verify the expected output and exceptions.