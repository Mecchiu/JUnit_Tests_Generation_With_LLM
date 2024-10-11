@Test
void testParseValidDate() {
    String dateString = "2021-05-20";
    String format = "yyyy-MM-dd";
    Date expected = new Date(121, 4, 20); // year is 1900 + 121, month is 0-based
    Date actual = DateTools.parse(dateString, format);
    assertEquals(expected, actual);
}

@Test
void testParseInvalidDate() {
    String dateString = "2021-13-40";
    String format = "yyyy-MM-dd";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseNullDate() {
    String dateString = null;
    String format = "yyyy-MM-dd";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseNullFormat() {
    String dateString = "2021-05-20";
    String format = null;
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseEmptyFormat() {
    String dateString = "2021-05-20";
    String format = "";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseInvalidFormat() {
    String dateString = "2021-05-20";
    String format = "invalid format";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseValidDateWithInvalidFormat() {
    String dateString = "2021-05-20";
    String format = "dd/MM/yyyy";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseInvalidDateWithValidFormat() {
    String dateString = "2021-13-40";
    String format = "yyyy-MM-dd";
    Date actual = DateTools.parse(dateString, format);
    assertNull(actual);
}

@Test
void testParseValidDateWithValidFormatAndTime() {
    String dateString = "2021-05-20 12:30:45";
    String format = "yyyy-MM-dd HH:mm:ss";
    Date expected = new Date(121, 4, 20, 12, 30, 45); // year is 1900 + 121, month is 0-based
    Date actual = DateTools.parse(dateString, format);
    assertEquals(expected, actual);
}

@Test
void testParseValidDateWithValidFormatAndTimezone() {
    String dateString = "2021-05-20 12:30:45 GMT";
    String format = "yyyy-MM-dd HH:mm:ss z";
    Date expected = new Date(121, 4, 20, 12, 30, 45); // year is 1900 + 121, month is 0-based
    Date actual = DateTools.parse(dateString, format);
    assertEquals(expected, actual);
}
}