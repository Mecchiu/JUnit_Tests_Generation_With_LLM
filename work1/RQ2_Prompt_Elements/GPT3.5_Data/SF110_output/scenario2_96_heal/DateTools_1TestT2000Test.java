@Test
void testFormatWithNullDate() {
    assertNull(DateTools.format(null, "yyyy-MM-dd"));
}

@Test
void testFormatWithNullFormat() {
    Date date = new Date();
    assertEquals(date.toString(), DateTools.format(date, null));
}

@Test
void testFormatWithValidDateAndFormat() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String expected = formatter.format(date);
    assertEquals(expected, DateTools.format(date, "yyyy-MM-dd"));
}

@Test
void testFormatWithInvalidFormat() {
    Date date = new Date();
    assertNull(DateTools.format(date, "invalid format"));
}

@Test
void testFormatWithInvalidDate() {
    assertNull(DateTools.format(parseDate("invalid date"), "yyyy-MM-dd"));
}

@Test
void testFormatWithEmptyFormat() {
    Date date = new Date();
    assertEquals(date.toString(), DateTools.format(date, ""));
}

@Test
void testFormatWithWhitespaceFormat() {
    Date date = new Date();
    assertEquals(date.toString(), DateTools.format(date, "   "));
}

@Test
void testFormatWithDifferentFormat() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String expected = formatter.format(date);
    assertEquals(expected, DateTools.format(date, "dd/MM/yyyy"));
}

@Test
void testFormatWithLongFormat() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
    String expected = formatter.format(date);
    assertEquals(expected, DateTools.format(date, "EEE, d MMM yyyy HH:mm:ss z"));
}

@Test
void testFormatWithShortFormat() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
    String expected = formatter.format(date);
    assertEquals(expected, DateTools.format(date, "dd/MM/yy"));
}

/**
 * Helper method to parse a date string.
 * @param dateString A date string in the format "yyyy-MM-dd".
 * @return A {@link Date} object representing the parsed date string.
 */
private Date parseDate(String dateString) {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    try {
        return formatter.parse(dateString);
    } catch (ParseException e) {
        return null;
    }
}
}