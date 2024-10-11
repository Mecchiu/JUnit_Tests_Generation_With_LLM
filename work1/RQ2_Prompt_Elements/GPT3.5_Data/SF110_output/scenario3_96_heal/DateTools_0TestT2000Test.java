// Here's an example implementation of the DateTools.format() method:

/**
 * @param date A {@link Date} to format.
 * @return A String representation of the date parameter in
 * 		the {@link #DEFAULT_DATE_FORMAT default format}.
 */
public static String format(Date date) {
    SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
    return formatter.format(date);
}

// And here's an example implementation of the DateTools_0Test class:

/**
 * Test class of {@link DateTools}.
 * It contains ten unit test cases for the {@link DateTools#format(Date)} method.
 */
class DateTools_0Test {

    @Test
    void testFormatNullDate() {
        assertNull(DateTools.format(null));
    }

    @Test
    void testFormatValidDate() throws ParseException {
        Date date = new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse("2022-01-01");
        assertEquals("2022-01-01", DateTools.format(date));
    }

    @Test
    void testFormatInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.format(new Date(Long.MAX_VALUE));
        });
    }

    @Test
    void testFormatEmptyString() throws ParseException {
        assertEquals("", DateTools.format(new SimpleDateFormat(DEFAULT_DATE_FORMAT).parse("")));
    }

    @Test
    void testFormatInvalidFormat() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2022/01/01");
        assertEquals("", DateTools.format(date));
    }

    @Test
    void testFormatDifferentLocale() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.FRANCE);
        Date date = formatter.parse("01/01/2022");
        assertEquals("2022-01-01", DateTools.format(date));
    }

    @Test
    void testFormatDifferentTimeZone() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        Date date = formatter.parse("2022-01-01");
        assertEquals("2021-12-31", DateTools.format(date));
    }

    @Test
    void testFormatBeforeEpoch() {
        Date date = new Date(-1_000_000_000_000L);
        assertEquals("1938-04-24", DateTools.format(date));
    }

    @Test
    void testFormatAfterEpoch() {
        Date date = new Date(1_000_000_000_000L);
        assertEquals("33658-09-27", DateTools.format(date));
    }

    @Test
    void testFormatEdgeCases() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Date date = formatter.parse("0001-01-01");
        assertEquals("0001-01-01", DateTools.format(date));

        date = formatter.parse("9999-12-31");
        assertEquals("9999-12-31", DateTools.format(date));
    }
}