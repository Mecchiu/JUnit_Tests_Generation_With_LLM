@Test
void testParseValidDate() throws ParseException {
    String dateString = "2021-05-20";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseInvalidDate() {
    String dateString = "2021-13-20";
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
void testParseInvalidFormat() {
    String dateString = "20/05/2021";
    Date actualDate = DateTools.parse(dateString);
    assertNull(actualDate);
}

@Test
void testParseValidDateWithTime() throws ParseException {
    String dateString = "2021-05-20 12:30:45";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseValidDateWithTimeZone() throws ParseException {
    String dateString = "2021-05-20T12:30:45-05:00";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseValidDateWithMilliseconds() throws ParseException {
    String dateString = "2021-05-20T12:30:45.123";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseValidDateWithZ() throws ParseException {
    String dateString = "2021-05-20T12:30:45Z";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}

@Test
void testParseValidDateWithOffset() throws ParseException {
    String dateString = "2021-05-20T12:30:45+02:00";
    Date expectedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").parse(dateString);
    Date actualDate = DateTools.parse(dateString);
    assertEquals(expectedDate, actualDate);
}
}