@Test
void testParseValidDate() throws ParseException {
    String dateString = "2021-05-20";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseInvalidDate() {
    String dateString = "invalid date";
    Date actualDate = DateTools.parse(dateString);
    assertNull(actualDate);
}

@Test
void testParseNullDate() {
    String dateString = null;
    Date actualDate = DateTools.parse(dateString);
    assertNull(actualDate);
}

@Test
void testParseEmptyDate() {
    String dateString = "";
    Date actualDate = DateTools.parse(dateString);
    assertNull(actualDate);
}

@Test
void testParseDateWithInvalidFormat() {
    String dateString = "20-05-2021";
    Date actualDate = DateTools.parse(dateString);
    assertNull(actualDate);
}

@Test
void testParseDateWithExtraSpaces() throws ParseException {
    String dateString = "  2021-05-20  ";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-20");
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseDateWithExtraCharacters() throws ParseException {
    String dateString = "2021-05-20T12:00:00Z";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseDateWithDifferentLocale() throws ParseException {
    String dateString = "20 mai 2021";
    SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.FRENCH);
    Date expectedDate = formatter.parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseDateWithDifferentTimeZone() throws ParseException {
    String dateString = "2021-05-20T12:00:00-05:00";
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
    formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    Date expectedDate = formatter.parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseDateWithDifferentCalendar() throws ParseException {
    String dateString = "1442-09-08";
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", new UmmAlQuraCalendar());
    Date expectedDate = formatter.parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}
}