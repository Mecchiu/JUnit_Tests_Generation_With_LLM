Here's an example of how you can write the ten unit test cases for the `DateTools.format(Date)` method:

```
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
    void testFormatDifferentDateFormat() throws ParseException {
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

These test cases cover a range of scenarios, including null input, valid and invalid dates, different date formats and locales, dates before 1900 and after 2100, and leap years.